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
	private ArrayList<Lugar> lugares;
	private JComboBox comboHorario;
	private DefaultListModel<String> modelo_lugares;
	private String lugar;

	/**
	 * Create the application.
	 */
	public VentanaLugar(ArrayList<Lugar> lista, DefaultListModel<String> modelo_lista, String lugar, boolean edicion) {
		lugares = lista;
		modelo_lugares = modelo_lista;
		this.lugar = lugar;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLugarVisita = new JFrame();
		frmLugarVisita.setResizable(false);
		frmLugarVisita.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/map.png")));
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
		gbl_panel.columnWidths = new int[] {101, 101, 101, 30};
		gbl_panel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 20};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
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
		comboHorario.setModel(new DefaultComboBoxModel(new String[] {"", "De 10:00 a 14:00", "De 16:00 a 20:00", "De 15:00 a 19:00", "De 9:00 a 13:00"}));
		GridBagConstraints gbc_comboHorario = new GridBagConstraints();
		gbc_comboHorario.insets = new Insets(0, 0, 5, 5);
		gbc_comboHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboHorario.gridx = 1;
		gbc_comboHorario.gridy = 1;
		panel.add(comboHorario, gbc_comboHorario);
		
		lblDuracion = new JLabel("Duración visita:");
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
		comboTipologia.setModel(new DefaultComboBoxModel(new String[] {"", "Histórico", "Natural", "Deporitvo", "Gastronómico"}));
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

	private void desactivar_edicion(boolean condicion) {
		txtfNombreLugar.setEditable(!condicion);
		txtfDuracion.setEditable(!condicion);
		txtPrecio.setEditable(!condicion);
		comboHorario.setEditable(!condicion);
		comboTipologia.setEditable(!condicion);
		lblImagen.setEnabled(!condicion);
	}

	private void mostrar_lugar() {
		desactivar_edicion(true);
		Lugar l = seleccionar_lugar();
		txtfNombreLugar.setText(l.getNombre());
		lblImagen = l.getImagen_lugar();
		comboHorario.setToolTipText(l.getHorario_visita());
		comboTipologia.setToolTipText(l.getTipologia());
		txtfDuracion.setText(Integer.toString(l.getDuracion_visita()));
		txtPrecio.setText(Double.toString(l.getPrecio()));
	}

	private Lugar seleccionar_lugar() {
		int id_lugar = Integer.parseInt(Character.toString(lugar.charAt(lugar.length() - 1)));
		Lugar aux = null;
		for(Lugar l : lugares) {
			if(l.getId() == id_lugar) {
				aux = l;
			}
		}
		return aux;
		
	}

	private class PnPrincipalBtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(pnPrincipal.getBtnAceptar().getText().equalsIgnoreCase("guardar")){
				Lugar l = new Lugar(txtfNombreLugar.getText(), comboHorario.getToolTipText(), Integer.parseInt(txtfDuracion.getText()), comboTipologia.getToolTipText(), Double.parseDouble(txtPrecio.getText()), lblImagen);
				lugares.add(l);
				modelo_lugares.addElement("Lugar " + l.getId());
			} 
			getFrmLugarVisita().dispose();
		}
	}
}
