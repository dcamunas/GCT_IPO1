package dominio;

import javax.swing.JLabel;

public class Turista {
	
	private int id = -1;
	private String nombre;
	private String apellidos;
	private int edad;
	private int numero_telefono;
	private JLabel foto;
	
	public Turista(String nombre, String apellidos, int edad, int numero_telefono, JLabel foto) {
		
		this.id++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.numero_telefono = numero_telefono;
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(int numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

	public JLabel getFoto() {
		return foto;
	}

	public void setFoto(JLabel foto) {
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

}
