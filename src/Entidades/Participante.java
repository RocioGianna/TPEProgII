package Entidades;

import java.util.ArrayList;

import Criterios.Criterio;


public class Participante extends ElementoAbs{
	
	private String apellido;
	private int edad;
	private ArrayList<String>generosPreferidos;
	private ArrayList<String>idiomas;
	private ArrayList<String>instrumentos;

	public Participante(String nombre, String apellido, int edad) {
		super(nombre);
		this.edad = edad;
		this.apellido = apellido;
		this.generosPreferidos = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}

	
	@Override
	public boolean equals(Object obj) { //equals redefinido para el contains
		try {
			
			Participante x = (Participante) obj;
			return this.getNombre().equals(x.getNombre()) && this.getApellido().equals(x.getApellido()) && this.getEdad() ==  x.getEdad();
		}
		catch(Exception e) {
			return false;
		}
	}



	@Override
	public double getEdad() {
		return this.edad;
	}


	@Override
	public ArrayList<String> getGenerosPreferidos() {
		return new ArrayList<String>(this.generosPreferidos);
	}


	@Override
	public ArrayList<String> getIdiomas() {
		return new ArrayList<String>(this.idiomas);
	}


	@Override
	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(this.instrumentos);
	}


	@Override
	public String toString() {
		return " " +  this.getNombre()+ " " + this.getApellido() + " Edad " + getEdad();
	}


	@Override
	public ArrayList<ElementoAbs> getConjuntoQueCumple(Criterio c) {
		ArrayList<ElementoAbs> cumplen = new ArrayList<>();
		if(c.cumple(this)) {
			cumplen.add(this);
		}
		return cumplen;
	}
	
	@Override
	public int getCantidadMiembrosInstrumentos(String instrumento) {
		if(this.tocaInstrumentos(instrumento)) {
			return 1;
		}
		return 0;
	}
	
	
	
	//metodos add para cada array sin repetidos
	public void addIdioma(String idioma) {
		if(!this.contieneIdioma(idioma)) {
			this.idiomas.add(idioma);
		}
	}
	public void addGenero(String genero) {
		if(!this.leGustaGenero(genero)) {
			this.generosPreferidos.add(genero);
		}
	}
	public void addInstrumento(String instrumento) {
		if(!this.tocaInstrumentos(instrumento)) {
			this.instrumentos.add(instrumento);
		}
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
