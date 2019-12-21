package dominio;

import java.util.ArrayList;

public class GrupoTuristas {
	
	private static int id = -1;
	private String nombre;
	private String pais;
	private String alojamiento;
	private String tipologia;
	private Guia guia;
	//private boolean restricciones;					// true: se activa lista restricciones | false: se deja desactiva lista de restricciones
	private ArrayList<String> restricciones;
	private ArrayList<String> intereses;
	
	public GrupoTuristas(String nombre, String pais, String alojamiento, String tipologia, Guia guia, ArrayList<String> restricciones, ArrayList<String> intereses) {
		
		this.id++;
		this.nombre = nombre;
		this.pais = pais;
		this.alojamiento = alojamiento;
		this.tipologia = tipologia;
		this.guia = guia;
		this.restricciones = restricciones;
		this.intereses = intereses;	
	}
	
	
	
	
	
	

}
