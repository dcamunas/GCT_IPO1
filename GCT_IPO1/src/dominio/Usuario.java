package dominio;

import javax.swing.ImageIcon;

import presentacion.MessagesGCT;
import presentacion.VentanaPrincipal;

public class Usuario {

	private String usuario;
	private String nombre;
	private String correo;
	private String contrasenia;
	private String ultima_conexion;
	private ImageIcon imagen;
	// private UsuarioDAO gestor;

	public Usuario(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = "Ana Isabel Molina";
		this.correo = "thisuser@gmail.com";
		this.ultima_conexion = MessagesGCT.getString("VentanaPrincipal.lblUltimaConexion2.text");
		this.imagen = new ImageIcon(
				VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/userGirl.png"));;
		mostrar_usuario();

	}

	private void mostrar_usuario() {
		if (usuario.equalsIgnoreCase("david")) {
			this.nombre = "David Camuñas";
			this.ultima_conexion = MessagesGCT.getString("VentanaPrincipal.lblUltimaConexion.text");
			this.imagen = new ImageIcon(
					VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/user.png"));;
		}
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUltima_conexion() {
		return ultima_conexion;
	}

	public void setUltima_conexion(String ultima_conexion) {
		this.ultima_conexion = ultima_conexion;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}
	
	
}
