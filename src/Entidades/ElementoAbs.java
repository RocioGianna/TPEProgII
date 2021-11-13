package Entidades;

import java.util.ArrayList;

import Criterios.Criterio;



public abstract class ElementoAbs {
	protected String nombre;

	public ElementoAbs(String nombre) {
		this.nombre = nombre;
	}
		
	
	public abstract double getEdad(); //simple retorna su edad... compuesto retorna promedio de edad banda
	public abstract ArrayList<String> getGenerosPreferidos(); // simple retorna copia de su array de fav... compuesto busca una interseccion 
	public abstract ArrayList<String> getIdiomas();//simple retorna copia de su array idiomas... compuesto retorna array sin repetidos
	public abstract ArrayList<String> getInstrumentos();//simple retorna copia de su array instrumentos... compuesto retorna sin repetidos
	public abstract ArrayList<ElementoAbs> getConjuntoQueCumple(Criterio c);//simple retorna un array vacio o con él mismo adentro(si cumple)....compuesto retorna a si mismo o sus miembros
	
	public abstract int getCantidadMiembrosInstrumentos(String instrumento); 
	
	
	//booleanos que utilizan los criterios para las busquedas
	public  boolean leGustaGenero(String genero) {
		return this.getGenerosPreferidos().contains(genero);
	}
	public boolean contieneIdioma(String idioma) {
		return this.getIdiomas().contains(idioma);
	}
	public boolean tocaInstrumentos(String instrumento) {
		return this.getInstrumentos().contains(instrumento);
	}
	//int que utilizan los comparadores para las batallas
	public int getCantidadInstrumentos() {
		return this.getInstrumentos().size();
	}
	public int getCantidadGeneros() {
		return this.getGenerosPreferidos().size();
	}
	public int getCantidadIdioma() {
		return this.getIdiomas().size();
	}

	
	
	
	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}








}
