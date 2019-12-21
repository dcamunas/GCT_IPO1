package dominio;

import javax.swing.JLabel;

public class Lugar {
	
	private static int id;
	private String nombre;
	private String horario_visita;	// Mirar que date si el de sql o el de java.util || poner string menos problema si da error
	private int duracion_visita;
	private String tipologia;
	private double precio;
	private JLabel imagen_lugar;
	
	
	public Lugar(String nombre, String horario_visita, int duracion_visita, String tipologia, double precio,
			JLabel imagen_lugar) {
		
		this.id++;
		this.nombre = nombre;
		this.horario_visita = horario_visita;
		this.duracion_visita = duracion_visita;
		this.tipologia = tipologia;
		this.precio = precio;
		this.imagen_lugar = imagen_lugar;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getHorario_visita() {
		return horario_visita;
	}


	public void setHorario_visita(String horario_visita) {
		this.horario_visita = horario_visita;
	}


	public int getDuracion_visita() {
		return duracion_visita;
	}


	public void setDuracion_visita(int duracion_visita) {
		this.duracion_visita = duracion_visita;
	}


	public String getTipologia() {
		return tipologia;
	}


	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public JLabel getImagen_lugar() {
		return imagen_lugar;
	}


	public void setImagen_lugar(JLabel imagen_lugar) {
		this.imagen_lugar = imagen_lugar;
	}

}
