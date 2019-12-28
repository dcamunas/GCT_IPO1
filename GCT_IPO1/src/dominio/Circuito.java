package dominio;

import java.util.*;

public class Circuito {

	private static int id = -1; // Usado en la bd
	private String nombre_circuito;
	private int personas_realizado;
	private double precio;
	private ArrayList<String> incidencias_lista;
	private ArrayList<String> puntos_interes;
	private ArrayList<String> sugerencias;
	private ArrayList<Lugar> lugares;
	private boolean contratado;
	private boolean incidencia;

	public Circuito(String nombre_circuito, int personas_realizado, double precio, ArrayList<String> incidencias_lista,
			ArrayList<String> puntos_interes, ArrayList<String> sugerencias, ArrayList<Lugar> lugares,
			boolean contratado, boolean incidencia) {

		this.id++;
		this.nombre_circuito = nombre_circuito;
		this.personas_realizado = personas_realizado;
		this.precio = precio;
		//this.incidencias_lista = new ArrayList<String>(incidencias_lista);
		this.puntos_interes = puntos_interes;
		//this.sugerencias = new ArrayList<String>(sugerencias);;
		//this.lugares = new ArrayList<Lugar>(lugares);;
		this.contratado = contratado;
		this.incidencia = incidencia;
	}

	public int getId() {
		return id;
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

	public ArrayList<String> getIncidencias_lista() {
		return incidencias_lista;
	}

	public void setIncidencias_lista(ArrayList<String> incidencias_lista) {
		this.incidencias_lista = incidencias_lista;
	}

	public ArrayList<String> getPuntos_interes() {
		return puntos_interes;
	}

	public void setPuntos_interes(ArrayList<String> puntos_interes) {
		this.puntos_interes = puntos_interes;
	}

	public ArrayList<String> getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(ArrayList<String> sugerencias) {
		this.sugerencias = sugerencias;
	}

	public ArrayList<Lugar> getLugares() {
		return lugares;
	}

	public void setLugares(ArrayList<Lugar> lugares) {
		this.lugares = lugares;
	}

	public boolean isContratado() {
		return contratado;
	}

	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}

	public boolean isIncidencia() {
		return incidencia;
	}

	public void setIncidencia(boolean incidencia) {
		this.incidencia = incidencia;
	}
	
	

}
