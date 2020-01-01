package presentacion;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import dominio.Circuito;
import dominio.Lugar;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class VentanaLugar {

	private JFrame frmLugarVisita;
	private MiJPanel pnPrincipal;
	private JLabel lblImagen;
	private JTextField txtfNombreLugar;
	private JPanel panel;
	private JLabel lblHorario;
	private JLabel lblDuracion;
	private JLabel lblTipologia;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JTextField txtfDuracion;
	private JComboBox comboTipologia;
	private List<Lugar> lista_lugares;
	private JComboBox comboHorario;
	private DefaultListModel<String> modelo_lugares;
	private VentanaPrincipal vp;

	/**
	 * Create the application.
	 */
	public VentanaLugar(List<Lugar> lista, DefaultListModel<String> modelo_lista) {
		this.lista_lugares = lista;
		this.modelo_lugares = modelo_lista;
		this.vp = vp;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLugarVisita = new JFrame();
		frmLugarVisita.setResizable(false);
		frmLugarVisita.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/map.png")));
		frmLugarVisita.setTitle("Lugar visita");
		frmLugarVisita.setBounds(100, 100, 450, 300);

		lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(MiJPanel.class.getResource("/presentacion/imagenes/lugares/picture.png")));

		pnPrincipal = new MiJPanel(lblImagen);
		pnPrincipal.getBtnAceptar().addActionListener(new PnPrincipalBtnAceptarActionListener());
		frmLugarVisita.getContentPane().add(pnPrincipal, BorderLayout.CENTER);

		txtfNombreLugar = new JTextField();
		txtfNombreLugar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtfNombreLugar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtfNombreLugar.setHorizontalAlignment(SwingConstants.CENTER);
		pnPrincipal.add(txtfNombreLugar, BorderLayout.NORTH);

		panel = new JPanel();
		pnPrincipal.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 101, 101, 0, 101, 30 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 20 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		lblHorario = new JLabel("Horario visita:");
		lblHorario.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblHorario = new GridBagConstraints();
		gbc_lblHorario.anchor = GridBagConstraints.EAST;
		gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorario.gridx = 0;
		gbc_lblHorario.gridy = 1;
		panel.add(lblHorario, gbc_lblHorario);

		comboHorario = new JComboBox();
		comboHorario.setModel(new DefaultComboBoxModel(
				new String[] { "", "De 10:00 a 14:00", "De 16:00 a 20:00", "De 15:00 a 19:00", "De 9:00 a 13:00" }));
		GridBagConstraints gbc_comboHorario = new GridBagConstraints();
		gbc_comboHorario.gridwidth = 2;
		gbc_comboHorario.insets = new Insets(0, 0, 5, 5);
		gbc_comboHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboHorario.gridx = 1;
		gbc_comboHorario.gridy = 1;
		panel.add(comboHorario, gbc_comboHorario);

		lblDuracion = new JLabel("Duración:");
		lblDuracion.setIcon(new ImageIcon(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/clock.png")));
		lblDuracion.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblDuracion = new GridBagConstraints();
		gbc_lblDuracion.anchor = GridBagConstraints.EAST;
		gbc_lblDuracion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDuracion.gridx = 0;
		gbc_lblDuracion.gridy = 2;
		panel.add(lblDuracion, gbc_lblDuracion);

		txtfDuracion = new JTextField();
		lblDuracion.setLabelFor(txtfDuracion);
		GridBagConstraints gbc_txtfDuracion = new GridBagConstraints();
		gbc_txtfDuracion.insets = new Insets(0, 0, 5, 5);
		gbc_txtfDuracion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfDuracion.gridx = 1;
		gbc_txtfDuracion.gridy = 2;
		panel.add(txtfDuracion, gbc_txtfDuracion);
		txtfDuracion.setColumns(10);

		lblTipologia = new JLabel("Tipología:");
		lblTipologia.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.anchor = GridBagConstraints.EAST;
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 0;
		gbc_lblTipologia.gridy = 3;
		panel.add(lblTipologia, gbc_lblTipologia);

		comboTipologia = new JComboBox();
		comboTipologia.setModel(
				new DefaultComboBoxModel(new String[] { "", "Histórico", "Natural", "Deporitvo", "Gastronómico" }));
		GridBagConstraints gbc_comboTipologia = new GridBagConstraints();
		gbc_comboTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_comboTipologia.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboTipologia.gridx = 1;
		gbc_comboTipologia.gridy = 3;
		panel.add(comboTipologia, gbc_comboTipologia);

		lblPrecio = new JLabel("Precio:");
		lblPrecio.setIcon(new ImageIcon(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/cash.png")));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 4;
		panel.add(lblPrecio, gbc_lblPrecio);

		txtPrecio = new JTextField();
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 1;
		gbc_txtPrecio.gridy = 4;
		panel.add(txtPrecio, gbc_txtPrecio);
		txtPrecio.setColumns(10);

		if (modelo_lugares == null) {
			activar_edicion(false);
		}

	}

	private void activar_edicion(boolean condicion) {
		txtfNombreLugar.setEditable(condicion);
		txtfDuracion.setEditable(condicion);
		txtPrecio.setEditable(condicion);
		comboHorario.setEditable(condicion);
		comboTipologia.setEditable(condicion);
		lblImagen.setEnabled(condicion);
	}

	private boolean comprobar_campos() {
		return !(txtfNombreLugar.getText() == null || txtfDuracion.getText() == null || txtPrecio.getText() == null
				|| comboHorario.getSelectedItem() == "" || comboTipologia.getSelectedItem() == "");
	}

	public static boolean comprobarDecimal(String cadena) {

		try {
			Double.parseDouble(cadena);
			return true;
		} catch (Exception e) {
			return false;

		}
	}

	private class PnPrincipalBtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (pnPrincipal.getBtnAceptar().getText().equalsIgnoreCase("guardar") && comprobar_campos()) {
				if (comprobarDecimal(txtPrecio.getText()) || comprobarDecimal(txtfDuracion.getText())) {
					Lugar l = new Lugar(lista_lugares.size()+1,txtfNombreLugar.getText(), (String)comboHorario.getSelectedItem(),
							Double.parseDouble(txtfDuracion.getText()), (String)comboTipologia.getSelectedItem(),
							Double.parseDouble(txtPrecio.getText()), lblImagen);

					lista_lugares.add(l);
					modelo_lugares.addElement("Lugar " + l.getId());

					getFrmLugarVisita().dispose();

				} else {
					JOptionPane.showMessageDialog(null, "El parámetro introducido debe de ser un número.", "",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Existencia de campos vacíos, revise los datos introducidos.", "",
						JOptionPane.ERROR_MESSAGE);
			}

		}
	}

	public JFrame getFrmLugarVisita() {
		return frmLugarVisita;
	}

	public void setFrmLugarVisita(JFrame frmLugarVisita) {
		this.frmLugarVisita = frmLugarVisita;
	}

	public MiJPanel getPnPrincipal() {
		return pnPrincipal;
	}

	public void setPnPrincipal(MiJPanel pnPrincipal) {
		this.pnPrincipal = pnPrincipal;
	}

	public JTextField getTxtfNombreLugar() {
		return txtfNombreLugar;
	}

	public void setTxtfNombreLugar(JTextField txtfNombreLugar) {
		this.txtfNombreLugar = txtfNombreLugar;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}

	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}

	public JTextField getTxtfDuracion() {
		return txtfDuracion;
	}

	public void setTxtfDuracion(JTextField txtfDuracion) {
		this.txtfDuracion = txtfDuracion;
	}

	public JComboBox getComboTipologia() {
		return comboTipologia;
	}

	public void setComboTipologia(JComboBox comboTipologia) {
		this.comboTipologia = comboTipologia;
	}

	public List<Lugar> getLista_lugares() {
		return lista_lugares;
	}

	public void setLista_lugares(List<Lugar> lista_lugares) {
		this.lista_lugares = lista_lugares;
	}

	public JComboBox getComboHorario() {
		return comboHorario;
	}

	public void setComboHorario(JComboBox comboHorario) {
		this.comboHorario = comboHorario;
	}

	public DefaultListModel<String> getModelo_lugares() {
		return modelo_lugares;
	}

	public void setModelo_lugares(DefaultListModel<String> modelo_lugares) {
		this.modelo_lugares = modelo_lugares;
	}

}
