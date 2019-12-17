package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VentanaPago {

	private JFrame frmPasarelaDePago;
	private JPanel pnPrincipal;
	private JPanel pnContenido;
	private JLabel lblPrecioCircuito;
	private JTextField textField;
	private JRadioButton rdbtnGratis;

	/**
	 * Create the application.
	 */
	public VentanaPago() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			frmPasarelaDePago = new JFrame();
			frmPasarelaDePago.setIconImage(Toolkit.getDefaultToolkit()
					.getImage(VentanaPago.class.getResource("/presentacion/imagenes/iconos/credit-card.png")));
			frmPasarelaDePago.setTitle("Pasarela de pago");
			frmPasarelaDePago.setBounds(100, 100, 346, 236);
			frmPasarelaDePago.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JLabel imagen = new JLabel();

			pnPrincipal = new MiJPanel_2V(imagen);
			frmPasarelaDePago.getContentPane().add(pnPrincipal, BorderLayout.CENTER);

			pnContenido = new JPanel();
			pnContenido.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			pnPrincipal.add(pnContenido, BorderLayout.CENTER);
			pnContenido.setLayout(null);

			lblPrecioCircuito = new JLabel("Precio circuito:");
			lblPrecioCircuito
					.setIcon(new ImageIcon(VentanaPago.class.getResource("/presentacion/imagenes/iconos/cash.png")));
			lblPrecioCircuito.setBounds(66, 64, 90, 16);
			pnContenido.add(lblPrecioCircuito);

			textField = new JTextField();
			textField.setBounds(166, 61, 50, 20);
			pnContenido.add(textField);
			textField.setColumns(10);

			rdbtnGratis = new JRadioButton("Gratís");
			rdbtnGratis.setEnabled(false);
			rdbtnGratis.setBounds(166, 90, 75, 23);
			pnContenido.add(rdbtnGratis);
		
	}

	public JFrame getFrmPasarelaDePago() {
		return frmPasarelaDePago;
	}

	public void setFrmPasarelaDePago(JFrame frmPasarelaDePago) {
		this.frmPasarelaDePago = frmPasarelaDePago;
	}

}
