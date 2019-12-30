package dominio;

import java.util.*;

public class Circuito {

	private static int id; 
	private String nombre_circuito;
	private int personas_realizado;
	private double precio;
	private List<String> incidencias;
	private List<String> puntos_interes;
	private List<String> sugerencias;
	private List<Lugar> lugares;
	private boolean contratado;

	public Circuito(String nombre_circuito, int personas_realizado, double precio, List<String> incidencias,
			List<String> puntos_interes, List<String> sugerencias, List<Lugar> lugares,
			boolean contratado) {

		this.id++;
		this.nombre_circuito = nombre_circuito;
		this.personas_realizado = personas_realizado;
		this.precio = precio;
		this.incidencias = incidencias;
		this.puntos_interes = puntos_interes;
		this.sugerencias = sugerencias;
		this.lugares = lugares;
		this.contratado = contratado;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	public String getNombre_circuito() {
		return nombre_circuito;
	}

	public int getPersonas_realizado() {
		return personas_realizado;
	}

	public void setPersonas_realizado(int personas_realizado) {
		this.personas_realizado = personas_realizado;
	}

	public double getPrecio() {
		return precio;
	}

	public List<String> getIncidencias() {
		return incidencias;
	}

	public void setIncidencias_lista(List<String> incidencias_lista) {
		this.incidencias = incidencias_lista;
	}

	public List<String> getPuntos_interes() {
		return puntos_interes;
	}

	public void setPuntos_interes(List<String> puntos_interes) {
		this.puntos_interes = puntos_interes;
	}

	public List<String> getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(List<String> sugerencias) {
		this.sugerencias = sugerencias;
	}

	public List<Lugar> getLugares() {
		return lugares;
	}

	public void setLugares(List<Lugar> lugares) {
		this.lugares = lugares;
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}

	public void setNombre_circuito(String nombre_circuito) {
		this.nombre_circuito = nombre_circuito;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setIncidencias(List<String> incidencias) {
		this.incidencias = incidencias;
	}


}
