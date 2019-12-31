package dominio;

import java.util.ArrayList;
import java.util.List;

public class GrupoTuristas {
	
	private static int id = -1;
	private String nombre;
	private String pais;
	private String alojamiento;
	private String tipologia;
	private String guia;
	private List<String> restricciones_lista;
	private List<String> intereses;
	
	public GrupoTuristas(String nombre, String pais, String alojamiento, String tipologia, String guia, List<String> restricciones_lista, List<String> intereses) {
		
		this.id++;
		this.nombre = nombre;
		this.pais = pais;
		this.alojamiento = alojamiento;
		this.tipologia = tipologia;
		this.guia = guia;
		this.restricciones_lista = restricciones_lista;
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

	public String getGuia() {
		return guia;
	}

	public void setGuia(String guia) {
		this.guia = guia;
	}

	public List<String> getRestricciones_lista() {
		return restricciones_lista;
	}

	public void setRestricciones_lista(List<String> restricciones_lista) {
		this.restricciones_lista = restricciones_lista;
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(ArrayList<String> intereses) {
		this.intereses = intereses;
	}

	public static int getId() {
		return id;
	}
	
	
	
	
	
	
	
	
	
	

}
