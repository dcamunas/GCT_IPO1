package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Guia {
	private static int id;
	private String nombre;
	private String apellidos;
	private String correo;
	private long telefono;
	private double precio_hora;
	private double puntuacion;
	private boolean disponibilidad;
	private String historial;
	private List<String> idiomas;
	private ImageIcon imagen;
	
	public Guia(String nombre, String apellidos, String correo, long telefono, double precio_hora, double puntuacion,
			boolean disponibilidad, List<String> idiomas, ImageIcon imagen) {
		
		this.id++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
		this.precio_hora = precio_hora;
		this.puntuacion = puntuacion;
		this.disponibilidad = disponibilidad;
		this.idiomas = idiomas;
		this.historial = null;
		this.imagen = imagen;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public double getPrecio_hora() {
		return precio_hora;
	}
	public void setPrecio_hora(double precio_hora) {
		this.precio_hora = precio_hora;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getHistorial() {
		return historial;
	}
	public void setHistorial(String historial) {
		this.historial = historial;
	}
	public List<String> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}
	public int getId() {
		return id;
	}
	public ImageIcon getImagen() {
		return imagen;
	}
	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}
	
	
	
}
