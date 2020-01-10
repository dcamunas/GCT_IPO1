package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;

import com.sun.scenario.effect.impl.prism.sw.PSWDrawable;

import dominio.Usuario;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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
	private final String pass = "ipo1";
	private Usuario user;
	private JButton btnIdioma;
	private DialogoSeleccionIdioma dsi;
	private boolean ingles;
	private JLabel lblNewLabel;

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
		frmAccesoManchatours.setBounds(100, 100, 442, 263);
		// frmAccesoManchatours.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		frmAccesoManchatours.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		btnAyuda = new JButton("");
		btnAyuda.addActionListener(new BtnAyudaActionListener());
		btnAyuda.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/imagenes/iconos/info-32.png")));
		btnAyuda.setBorderPainted(false);
		btnAyuda.setContentAreaFilled(false);
		btnAyuda.setBounds(383, 11, 41, 35);
		panel.add(btnAyuda);

		lblUsuario = new JLabel("Usuario / User:");
		lblUsuario.setBounds(151, 22, 120, 14);
		panel.add(lblUsuario);

		tfUsuario = new JTextField();
		tfUsuario.addActionListener(new TfUsuarioActionListener());
		tfUsuario.setBounds(151, 46, 137, 20);
		panel.add(tfUsuario);
		tfUsuario.setColumns(10);

		lblContrasenia = new JLabel("Contraseña / Password:");
		lblContrasenia.setEnabled(true);
		lblContrasenia.setBounds(151, 91, 179, 14);
		panel.add(lblContrasenia);

		pwdContrasenia = new JPasswordField();
		pwdContrasenia.addKeyListener(new PwdContraseniaKeyListener());
		pwdContrasenia.addActionListener(new PwdContraseniaActionListener());
		pwdContrasenia.setEnabled(false);
		pwdContrasenia.setBounds(151, 116, 137, 20);
		panel.add(pwdContrasenia);

		btnEntrar = new JButton("OK");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setBounds(178, 160, 86, 23);
		panel.add(btnEntrar);

		btnIdioma = new JButton("");
		btnIdioma.addActionListener(new BtnIdiomaActionListener());
		btnIdioma.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/imagenes/iconos/worldwide.png")));
		btnIdioma.setContentAreaFilled(false);
		btnIdioma.setBorderPainted(false);
		btnIdioma.setBounds(383, 159, 41, 35);
		panel.add(btnIdioma);

		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new LblNewLabelMouseListener());
		lblNewLabel.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/imagenes/iconos/map (1).png")));
		lblNewLabel.setBounds(25, 11, 64, 64);
		panel.add(lblNewLabel);

		lblAviso = new JLabel("");
		lblAviso.setPreferredSize(new Dimension(0, 25));
		lblAviso.setOpaque(true);
		frmAccesoManchatours.getContentPane().add(lblAviso, BorderLayout.SOUTH);
	}

	private class TfUsuarioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Se activa los campos de contraseña
			pwdContrasenia.setEnabled(true);
			// Se pasa el foco al campo de la contraseña
			pwdContrasenia.requestFocus();
			btnEntrar.setEnabled(true);

		}
	}

	private class PwdContraseniaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Se obtiene la contraseña introducida

			if (String.valueOf(pwdContrasenia.getPassword()).equals(pass)) {
				lblAviso.setBackground(Color.GREEN);
				lblAviso.setText("Verificación correcta. Puede entrar.");
				lblAviso.setVisible(true);
				pwdContrasenia.setEnabled(false);
				tfUsuario.setEnabled(false);
				// Creacion del usuario a pasar a ventana principal
			} else {
				lblAviso.setBackground(Color.RED);
				lblAviso.setText("Contraseña o usuario incorrecto. Vuelva a intentarlo.");
				lblAviso.setVisible(true);
				pwdContrasenia.setText(null);
				pwdContrasenia.setEnabled(false);
				btnEntrar.setEnabled(false);
				tfUsuario.setText(null);
				tfUsuario.requestFocus();

			}
		}

	}

	private String obtener_contrasenia(char[] pass) {
		String contrasenia = null;
		;
		for (int i = 0; i < pass.length; i++)
			contrasenia += pass[i];
		return contrasenia;
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblAviso.setVisible(true);
			if (String.valueOf(pwdContrasenia.getPassword()).equals(pass)) {
				// Se crea una instancia de la ventana principal (JFrame)
				user = new Usuario(tfUsuario.getText(), obtener_contrasenia(pwdContrasenia.getPassword()));

				VentanaPrincipal ventana_principal = new VentanaPrincipal(tfUsuario.getText(), pass);
				// Se hace visible la VentanaPrincipal
				ventana_principal.getFrame().setVisible(true);
				// Se elimina la ventana actual (atributo a nivel de clase)
				frmAccesoManchatours.dispose();
			}
		}
	}

	private class PwdContraseniaKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			lblAviso.setVisible(true);
			if (String.valueOf(pwdContrasenia.getPassword()).equals(pass)) {
				// Se crea una instancia de la ventana principal (JFrame)
				VentanaPrincipal ventana_principal = new VentanaPrincipal(tfUsuario.getText(), pass);
				// Se hace visible la VentanaPrincipal
				ventana_principal.getFrame().setVisible(true);
				// Se elimina la ventana actual (atributo a nivel de clase)

				frmAccesoManchatours.dispose();
			}

		}
	}

	private class BtnIdiomaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dsi = new DialogoSeleccionIdioma();
			dsi.setVisible(true);

		}
	}

	private class LblNewLabelMouseListener extends MouseAdapter {
		@Override
		public void mouseExited(MouseEvent e) {
			lblNewLabel.setVisible(true);

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			lblNewLabel.setVisible(false);
		}
	}
	private class BtnAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Desktop enlace = Desktop.getDesktop();
			try {
				enlace.browse(new URI(
						"https://github.com/dcamunas/GCT_IPO1"));
			} catch (IOException | URISyntaxException e) {
				e.getMessage();
			}

		}
	}

	public JFrame getFrmAccesoManchatours() {
		return frmAccesoManchatours;
	}

	public boolean isIngles() {
		return ingles;
	}
}
