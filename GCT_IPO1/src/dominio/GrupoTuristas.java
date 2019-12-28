package dominio;

import java.util.ArrayList;

public class GrupoTuristas {
	
	private static int id = -1;
	private String nombre;
	private String pais;
	private String alojamiento;
	private String tipologia;
	private Guia guia;
	private boolean restricciones;					// true: se activa lista restricciones | false: se deja desactiva lista de restricciones
	private ArrayList<String> restricciones_lista;
	private ArrayList<String> intereses;
	
	public GrupoTuristas(String nombre, String pais, String alojamiento, String tipologia, Guia guia, ArrayList<String> restricciones_lista, ArrayList<String> intereses, boolean restricciones) {
		
		this.id++;
		this.nombre = nombre;
		this.pais = pais;
		this.alojamiento = alojamiento;
		this.tipologia = tipologia;
		this.guia = guia;
		this.restricciones_lista = restricciones_lista;
		this.restricciones = restricciones;
		this.intereses = intereses;	
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(String alojamiento) {
		this.alojamiento = alojamiento;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public Guia getGuia() {
		return guia;
	}

	public void setGuia(Guia guia) {
		this.guia = guia;
	}

	public boolean isRestricciones() {
		return restricciones;
	}

	public void setRestricciones(boolean restricciones) {
		this.restricciones = restricciones;
	}

	public ArrayList<String> getRestricciones_lista() {
		return restricciones_lista;
	}

	public void setRestricciones_lista(ArrayList<String> restricciones_lista) {
		this.restricciones_lista = restricciones_lista;
	}

	public ArrayList<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(ArrayList<String> intereses) {
		this.intereses = intereses;
	}

	public static int getId() {
		return id;
	}
	
	
	
	
	
	
	
	
	
	

}
