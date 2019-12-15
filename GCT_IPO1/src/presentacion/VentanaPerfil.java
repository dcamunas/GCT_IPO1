package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VentanaPerfil {

	private JFrame frmPerfil;
	private JPanel pnPrincipal;
	private JLabel lblUltimaConexinAyer;
	private JPanel panel;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblContrasea;
	private JTextField txtContrasea;
	private JLabel lblImagen;


	/**
	 * Create the application.
	 */
	public VentanaPerfil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmPerfil(new JFrame());
		getFrmPerfil().setTitle("Perfil de usuario");
		getFrmPerfil().setBounds(100, 100, 450, 300);
		
		lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(MiJPanel.class.getResource("/presentacion/imagenes/perfiles/user.png")));	
		
		pnPrincipal = new MiJPanel(lblImagen);
		getFrmPerfil().getContentPane().add(pnPrincipal, BorderLayout.CENTER);
		
		lblUltimaConexinAyer = new JLabel(" Última conexión: Ayer a la 18:00");
		pnPrincipal.add(lblUltimaConexinAyer, BorderLayout.NORTH);
		
		panel = new JPanel();
		pnPrincipal.add(panel, BorderLayout.CENTER);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtUsuario = new JTextField();
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario.setEnabled(false);
		txtUsuario.setText("Usuario");
		txtUsuario.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setEnabled(false);
		txtNombre.setText("Nombre");
		txtNombre.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		txtContrasea.setEnabled(false);
		txtContrasea.setText("Contraseña");
		txtContrasea.setColumns(10);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(lblUsuario);
		panel.add(txtUsuario);
		panel.add(lblNombre);
		panel.add(txtNombre);
		
		lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblContrasea);
		panel.add(txtContrasea);
	}

	public JFrame getFrmPerfil() {
		return frmPerfil;
	}

	public void setFrmPerfil(JFrame frmPerfil) {
		this.frmPerfil = frmPerfil;
	}
}
