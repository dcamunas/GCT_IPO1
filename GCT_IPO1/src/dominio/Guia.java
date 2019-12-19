package dominio;

import java.util.ArrayList;

public class Guia {
	private int id = -1;
	private String nombre;
	private String apellidos;
	private String correo;
	private int telefono;
	private double precio_hora;
	private double puntuacion;
	private boolean disponibilidad;
	private ArrayList<Circuito> historial_ruta;
	private ArrayList<String> idiomas;
	public Guia(String nombre, String apellidos, String correo, int telefono, double precio_hora, double puntuacion,
			boolean disponibilidad, ArrayList<Circuito> historial_ruta, ArrayList<String> idiomas) {
		
		this.id++;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
		this.precio_hora = precio_hora;
		this.puntuacion = puntuacion;
		this.disponibilidad = disponibilidad;
		this.historial_ruta = historial_ruta;
		this.idiomas = idiomas;
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
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
	public ArrayList<Circuito> getHistorial_ruta() {
		return historial_ruta;
	}
	public void setHistorial_ruta(ArrayList<Circuito> historial_ruta) {
		this.historial_ruta = historial_ruta;
	}
	public ArrayList<String> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(ArrayList<String> idiomas) {
		this.idiomas = idiomas;
	}
	public int getId() {
		return id;
	}
	
}
