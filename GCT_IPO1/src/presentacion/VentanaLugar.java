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
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class VentanaLugar {

	private JFrame frmLugarVisita;
	private MiJPanel pnPrincipal;
	private JLabel lblImagen;
	private JLabel lblNombreLugar;
	private JPanel panel;
	private JLabel lblHorario;
	private JTextField txtfHorario;
	private JLabel lblDuracion;
	private JLabel lblTipologia;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JTextField txtfDuracion;
	private JComboBox comboTipologia;

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
		frmLugarVisita.setResizable(false);
		frmLugarVisita.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLugar.class.getResource("/presentacion/imagenes/iconos/map.png")));
		frmLugarVisita.setTitle("Lugar visita");
		frmLugarVisita.setBounds(100, 100, 450, 300);
		
		lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(MiJPanel.class.getResource("/presentacion/imagenes/lugares/picture.png")));	

		pnPrincipal = new MiJPanel(lblImagen);
		pnPrincipal.getBtnAceptar().addActionListener(new PnPrincipalBtnAceptarActionListener());
		frmLugarVisita.getContentPane().add(pnPrincipal, BorderLayout.CENTER);
		
		lblNombreLugar = new JLabel("Nombre lugar");
		lblNombreLugar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNombreLugar.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		
		comboTipologia = new JComboBox();
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





	private class PnPrincipalBtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			// CONTROLAR PAGO DE TODOS LOS LUGARES DE DICHO CIRCUITO
			String mensaje = ("Pago del circuito '" + lblNombreLugar.getText() + "' realizado correctamente.");
			JOptionPane.showMessageDialog(null, mensaje , "", JOptionPane.INFORMATION_MESSAGE);
			getFrmLugarVisita().dispose();
		}
	}
}
