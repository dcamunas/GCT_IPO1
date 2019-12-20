package dominio;

public class Usuario {
	
	private int id = -1;
	private String usuario;
	private String nombre;
	private String correo;
	private String contrasenia;
	private String ultima_conexion;
	private String imagen;
	//private UsuarioDAO gestor;
	
	public Usuario(String usuario, String contrasenia) {
		
		this.id++;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = "David";
		this.correo = "david@alu.com";
		this.ultima_conexion = "Ayer a las 18:00";
		this.imagen ="presentacion/imagenes/perfiles/Mou.png";
	}
	
	

	public int getId() {
		return id;
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



	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	
	

}
