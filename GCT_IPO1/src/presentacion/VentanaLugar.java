package presentacion;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaLugar {

	private JFrame frmLugarVisita;
	private MiJPanel pnPrincipal;
	private JLabel lblImagen;
	public JTextField txtfNombreLugar;
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
	private int tema;
	private Color color_dia = new Color(240, 240, 240);
	private Color color_noche = new Color(51, 51, 51);
	public JLabel lblNombre;
	public JTextField txtNombre;

	/**
	 * Create the application.
	 */
	public VentanaLugar(List<Lugar> lista, DefaultListModel<String> modelo_lista, int tema) {
		this.lista_lugares = lista;
		this.modelo_lugares = modelo_lista;
		this.tema = tema;
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
		frmLugarVisita.setBounds(100, 100, 440, 265);

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
		txtfNombreLugar.setVisible(false);
		panel = new JPanel();
		pnPrincipal.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(54, 14, 59, 14);
		panel.add(lblNombre);

		lblHorario = new JLabel("Horario visita:");
		lblHorario.setBounds(22, 39, 91, 14);
		lblHorario.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblHorario);

		comboHorario = new JComboBox();
		comboHorario.setBounds(118, 36, 126, 20);
		comboHorario.setModel(new DefaultComboBoxModel(
				new String[] { "", "De 10:00 a 14:00", "De 16:00 a 20:00", "De 15:00 a 19:00", "De 9:00 a 13:00" }));
		panel.add(comboHorario);

		lblDuracion = new JLabel("Duración:");
		lblDuracion.setBounds(22, 63, 91, 16);
		lblDuracion.setIcon(new ImageIcon(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/clock.png")));
		lblDuracion.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblDuracion);

		txtfDuracion = new JTextField();
		txtfDuracion.setBounds(118, 61, 46, 20);
		lblDuracion.setLabelFor(txtfDuracion);
		panel.add(txtfDuracion);
		txtfDuracion.setColumns(10);

		lblTipologia = new JLabel("Tipología:");
		lblTipologia.setBounds(44, 89, 69, 14);
		lblTipologia.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblTipologia);

		comboTipologia = new JComboBox();
		comboTipologia.setBounds(118, 86, 96, 20);
		comboTipologia.setModel(
				new DefaultComboBoxModel(new String[] { "", "Histórico", "Natural", "Deporitvo", "Gastronómico" }));
		panel.add(comboTipologia);

		lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(44, 113, 69, 16);
		lblPrecio.setIcon(new ImageIcon(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/cash.png")));
		panel.add(lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(118, 111, 53, 20);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(118, 11, 126, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		if (modelo_lugares == null) {
			activar_edicion(false);
		}
		
		if(tema == 0) {
			cambiar_tema(color_dia, Color.BLACK, color_dia);
		} else {
			cambiar_tema(color_noche, Color.WHITE, Color.DARK_GRAY);
		}

	}
	
	private void cambiar_colorTexto(JPanel panel, Color color_texto) {
		JLabel aux;
		for (int i = 0; i < panel.getComponentCount(); i++) {
			if (panel.getComponent(i).getClass().getTypeName().equalsIgnoreCase("javax.swing.jlabel")) {
				aux = (JLabel) panel.getComponent(i);
				aux.setForeground(color_texto);
			}
		}
	}
	
	private void cambiar_tema(Color color_panel, Color color_texto, Color textfield) {
		txtfNombreLugar.setBackground(textfield);
		txtfNombreLugar.setForeground(color_texto);
		pnPrincipal.getPnimagen().setBackground(color_panel);
		pnPrincipal.getPnAceptar().setBackground(color_panel);
		panel.setBackground(color_panel);
		cambiar_colorTexto(panel, color_texto);
		
	}

	private void activar_edicion(boolean condicion) {
		txtfNombreLugar.setEditable(condicion);
		txtfDuracion.setEditable(condicion);
		txtPrecio.setEditable(condicion);
		comboHorario.setEditable(condicion);
		comboTipologia.setEditable(condicion);
		lblImagen.setEnabled(condicion);
		txtNombre.setVisible(false);
		lblNombre.setVisible(false);
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
					Lugar l = new Lugar(lista_lugares.size()+1,txtNombre.getText(), (String)comboHorario.getSelectedItem(),
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

	public JLabel getLblImagen() {
		return lblImagen;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getLblHorario() {
		return lblHorario;
	}

	public JLabel getLblDuracion() {
		return lblDuracion;
	}

	public JLabel getLblTipologia() {
		return lblTipologia;
	}

	public JLabel getLblPrecio() {
		return lblPrecio;
	}
}
