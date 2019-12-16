package presentacion;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaLugar {

	private JFrame frmLugarVisita;
	private JPanel pnPrincipal;
	private JLabel lblImagen;
	private JLabel lblNombreLugar;
	private JPanel panel;
	private JLabel lblHorario;
	private JTextField txtfHorario;
	private JLabel lblDuracion;
	private JLabel lblTipologia;
	private JLabel lblPrecio;
	private JTextField txtfPrecio;
	private JTextField txtfTipologia;
	private JTextField txtfDuracion;
	private JComboBox comboBox;

	/**
	 * Create the application.
	 */
	public VentanaLugar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLugarVisita = new JFrame();
		frmLugarVisita.setTitle("Lugar visita");
		frmLugarVisita.setBounds(100, 100, 450, 300);
		
		lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(MiJPanel.class.getResource("/presentacion/imagenes/lugares/picture.png")));	

		pnPrincipal = new MiJPanel(lblImagen);
		frmLugarVisita.getContentPane().add(pnPrincipal, BorderLayout.CENTER);
		
		lblNombreLugar = new JLabel("Nombre lugar");
		lblNombreLugar.setHorizontalAlignment(SwingConstants.CENTER);
		pnPrincipal.add(lblNombreLugar, BorderLayout.NORTH);
		
		panel = new JPanel();
		pnPrincipal.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {101, 101, 101, 30};
		gbl_panel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 20};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		txtfHorario = new JTextField();
		lblHorario.setLabelFor(txtfHorario);
		GridBagConstraints gbc_txtfHorario = new GridBagConstraints();
		gbc_txtfHorario.insets = new Insets(0, 0, 5, 5);
		gbc_txtfHorario.anchor = GridBagConstraints.NORTH;
		gbc_txtfHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfHorario.gridx = 1;
		gbc_txtfHorario.gridy = 1;
		panel.add(txtfHorario, gbc_txtfHorario);
		txtfHorario.setColumns(10);
		
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
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panel.add(comboBox, gbc_comboBox);
		
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setIcon(new ImageIcon(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/cash.png")));
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 4;
		panel.add(lblPrecio, gbc_lblPrecio);
		lblPrecio.setLabelFor(txtfPrecio);
		lblTipologia.setLabelFor(txtfTipologia);
		
		txtfTipologia = new JTextField();
		GridBagConstraints gbc_txtfTipologia = new GridBagConstraints();
		gbc_txtfTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_txtfTipologia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfTipologia.gridx = 1;
		gbc_txtfTipologia.gridy = 4;
		panel.add(txtfTipologia, gbc_txtfTipologia);
		txtfTipologia.setColumns(10);
		
		txtfPrecio = new JTextField();
		GridBagConstraints gbc_txtfPrecio = new GridBagConstraints();
		gbc_txtfPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtfPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfPrecio.gridx = 1;
		gbc_txtfPrecio.gridy = 5;
		panel.add(txtfPrecio, gbc_txtfPrecio);
		txtfPrecio.setColumns(10);
		
	}

	public JFrame getFrmLugarVisita() {
		return frmLugarVisita;
	}

	public void setFrmLugarVisita(JFrame frmLugarVisita) {
		this.frmLugarVisita = frmLugarVisita;
	}



}
