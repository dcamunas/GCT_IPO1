package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

import dominio.Lugar;

import javax.swing.SwingConstants;

public class VentanaPago {

	private JFrame frmPasarelaDePago;
	private MiJPanel pnPrincipal;
	private JPanel pnContenido;
	private JLabel lblPrecioCircuito;
	private JTextField textField;
	private JCheckBox rdbtnGratis;
	private JLabel lblNombreCircuito;
	private JScrollPane scrollPane;
	private JList listaLugares;
	private JScrollPane scrollPane_1;
	private JList list;
	private JCheckBox contratado;
	private JButton contratar;
	private ArrayList<Lugar> lista_lugares;

	/**
	 * Create the application.
	 */

	public VentanaPago(JButton contratar, JCheckBox contratado, String nombreCircuito, String precio_total,
			List<Lugar> lugares) {
		initialize(contratar, contratado, nombreCircuito, precio_total, lugares);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JButton contratar, JCheckBox contratado, String nombreCircuito, String precio_total,
			List<Lugar> lugares) {
		this.contratar = contratar;
		this.contratado = contratado;
		frmPasarelaDePago = new JFrame();
		frmPasarelaDePago.setResizable(false);
		frmPasarelaDePago.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaPago.class.getResource("/presentacion/imagenes/iconos/credit-card.png")));
		frmPasarelaDePago.setTitle("Pasarela de pago");
		frmPasarelaDePago.setBounds(100, 100, 448, 290);

		pnPrincipal = new MiJPanel(new JLabel());
		pnPrincipal.getBtnAceptar().setText("Pagar");
		pnPrincipal.getBtnAceptar().setFont(new Font("Tahoma", Font.PLAIN, 12));
		pnPrincipal.getBtnAceptar().addActionListener(new PnPrincipalBtnAceptarActionListener());
		frmPasarelaDePago.getContentPane().add(pnPrincipal, BorderLayout.CENTER);

		pnContenido = new JPanel();
		pnContenido.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnPrincipal.add(pnContenido, BorderLayout.CENTER);
		pnContenido.setLayout(null);

		lblPrecioCircuito = new JLabel("Precio circuito:");
		lblPrecioCircuito
				.setIcon(new ImageIcon(VentanaPago.class.getResource("/presentacion/imagenes/iconos/cash.png")));
		lblPrecioCircuito.setBounds(248, 115, 117, 16);
		pnContenido.add(lblPrecioCircuito);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(375, 113, 50, 20);
		pnContenido.add(textField);
		textField.setColumns(10);
		textField.setText(precio_total + " €");

		rdbtnGratis = new JCheckBox("Gratís");
		rdbtnGratis.setEnabled(false);
		rdbtnGratis.setBounds(350, 140, 75, 23);
		pnContenido.add(rdbtnGratis);

		lblNombreCircuito = new JLabel(nombreCircuito);
		lblNombreCircuito.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreCircuito.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblNombreCircuito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombreCircuito.setBounds(152, 11, 160, 16);
		pnContenido.add(lblNombreCircuito);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 47, 217, 155);
		pnContenido.add(scrollPane_1);

		list = new JList();
		list.setEnabled(false);
		scrollPane_1.setViewportView(list);
		
		if(es_gratis(precio_total)) {
			textField.setEditable(false);
			rdbtnGratis.setEnabled(true);
			rdbtnGratis.setSelected(true);
		}

	}

	public JFrame getFrmPasarelaDePago() {
		return frmPasarelaDePago;
	}

	public void setFrmPasarelaDePago(JFrame frmPasarelaDePago) {
		this.frmPasarelaDePago = frmPasarelaDePago;
	}

	public boolean es_gratis(String precio_total) {
		boolean gratis = false;
		int precio = (int) Double.parseDouble(precio_total);
		if (precio == 0) {
			gratis = true;
		}
		return gratis;
	}

	private class PnPrincipalBtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String mensaje = ("Pago de '" + lblNombreCircuito.getText() + "' realizado correctamente.");
			JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.INFORMATION_MESSAGE);
			contratar.setEnabled(false);
			contratado.setSelected(true);
			getFrmPasarelaDePago().dispose();

		}
	}
}
