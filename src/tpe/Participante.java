package tpe;

import java.util.ArrayList;

public class Participante {
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String>generosPreferidos;
	private ArrayList<String>idiomas;
	private ArrayList<String>instrumentos;
	private ArrayList<String>instrumentos2;
	
	
	public Participante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generosPreferidos = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}
	
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<String> getGenerosPreferidos() {
		return new ArrayList<String>(generosPreferidos);
	}

	public ArrayList<String> getIdiomas() {
		return new ArrayList<String>(idiomas);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}


}
