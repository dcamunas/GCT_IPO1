package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Dimension;

public class VentanaLogin {

	private JFrame frmAccesoManchatours;
	private JPanel panel;
	private JLabel lblAviso;
	private JButton btnAyuda;
	private JLabel lblUsuario;
	private JTextField tfUsuario;
	private JLabel lblContrasenia;
	private JPasswordField pwdContrasenia;
	private JButton btnEntrar;
	private final String pass = "david";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin ventana_login = new VentanaLogin();
					ventana_login.frmAccesoManchatours.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAccesoManchatours = new JFrame();
		frmAccesoManchatours.setResizable(false);
		frmAccesoManchatours.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaLogin.class.getResource("/presentacion/imagenes/iconos/compass.png")));
		frmAccesoManchatours.setTitle("Acceso Manchatours");
		frmAccesoManchatours.setBounds(100, 100, 450, 300);
		// frmAccesoManchatours.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frmAccesoManchatours.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		btnAyuda = new JButton("");
		btnAyuda.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/imagenes/iconos/info-32.png")));
		btnAyuda.setContentAreaFilled(false);
		btnAyuda.setBorderPainted(false);
		btnAyuda.setBounds(383, 11, 41, 35);
		panel.add(btnAyuda);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(119, 61, 46, 14);
		panel.add(lblUsuario);

		tfUsuario = new JTextField();
		tfUsuario.addActionListener(new TfUsuarioActionListener());
		tfUsuario.setBounds(175, 58, 86, 20);
		panel.add(tfUsuario);
		tfUsuario.setColumns(10);

		lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setEnabled(false);
		lblContrasenia.setBounds(105, 103, 60, 14);
		panel.add(lblContrasenia);

		pwdContrasenia = new JPasswordField();
		pwdContrasenia.addActionListener(new PwdContraseniaActionListener());
		pwdContrasenia.setEnabled(false);
		pwdContrasenia.setBounds(175, 100, 86, 20);
		panel.add(pwdContrasenia);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setEnabled(false);
		btnEntrar.setBounds(175, 157, 89, 23);
		panel.add(btnEntrar);

		lblAviso = new JLabel("");
		lblAviso.setPreferredSize(new Dimension(0, 25));
		lblAviso.setOpaque(true);
		frmAccesoManchatours.getContentPane().add(lblAviso, BorderLayout.SOUTH);
	}

	private class TfUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Se activa los campos de contraseña
			lblContrasenia.setEnabled(true);
			pwdContrasenia.setEnabled(true);
			// Se pasa el foco al campo de la contraseña
			pwdContrasenia.requestFocus();
		}
	}

	private class PwdContraseniaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Se obtiene la contraseña introducida
		
			if (String.valueOf(pwdContrasenia.getPassword()).equals(pass)) {
				lblAviso.setBackground(Color.GREEN);
				lblAviso.setText("Contraseña correcta. Puede entrar");
				lblAviso.setVisible(true);
				btnEntrar.setEnabled(true);
				pwdContrasenia.setEnabled(false);
				pwdContrasenia.setEnabled(false);
			} else {
				lblAviso.setBackground(Color.RED);
				lblAviso.setText("Contraseña incorrecta. Vuelva a intentarlo");
				lblAviso.setVisible(true);
				btnEntrar.setEnabled(false);
			}

		}

	}
	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Se crea una instancia de la ventana principal (JFrame)
			VentanaPrincipal ventana_principal = new VentanaPrincipal();
			//Se hace visible la VentanaPrincipal
			ventana_principal.setVisible(true);
			//Se elimina la ventana actual (atributo a nivel de clase)
			frmAccesoManchatours.dispose();
		}
	}
}
