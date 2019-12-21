package dominio;

import java.util.*;

public class Circuito {
	
	private static int id = -1;					//Usado en la bd
	private String nombre_circuito;
	private int personas_realizado;
	private int precio;					   // Castear a entero
	private boolean incidencia;
	private ArrayList<String> incidencias_lista;
	private ArrayList<String> puntos_interes;
	private ArrayList<String> sugerencias;
	private ArrayList<Lugar> lugares;
	private boolean contratado;
	
	
	
	
	public Circuito(String nombre_circuito, int personas_realizado, int precio, boolean incidencia,
			ArrayList<String> incidencias_lista, ArrayList<String> puntos_interes, ArrayList<String> sugerencias,
			ArrayList<Lugar> lugares, boolean contratado) {
		
		this.id++;
		this.nombre_circuito = nombre_circuito;
		this.personas_realizado = personas_realizado;
		this.precio = precio;
		this.incidencia = incidencia;
		this.incidencias_lista = incidencias_lista;
		this.puntos_interes = puntos_interes;
		this.sugerencias = sugerencias;
		this.lugares = lugares;
		this.contratado = contratado;
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
	public int getPrecio() {
		return precio;
	}

	public boolean getIncidencia() {
		return incidencia;
	}
	public void setIncidencia(boolean incidencia) {
		this.incidencia = incidencia;
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
	public boolean getContratado() {
		return contratado;
	}
	public void setContratado(boolean contratado) {
		this.contratado = contratado;
	}

}
