package Entidades;

import java.util.ArrayList;
import java.util.Comparator;

public class Produccion {

    private ArrayList<Musical> musicales;
    private ArrayList<Coach> jurado;
    private Comparator<ElementoAbs> modoBatalla;

	public Produccion(Comparator<ElementoAbs> modoBatalla) {
		this.musicales = new ArrayList<>();
		this.jurado = new ArrayList<>();
		this.modoBatalla = modoBatalla;
	}
	

	/*Los anteriores son algunos ejemplos de batallas entre dos participantes, puede ser incluso que haya
		más de dos formas encadenadas, es decir que si las dos primeras dan empate se decide por una
		tercera forma. Se debe proveer un mecanismo que permita que en el concurso se enfrenten dos
		participantes y se determine el ganador acorde a la forma de la batalla que se esté utilizando en ese
		momento.*/
	
	public ElementoAbs batallar(ElementoAbs p1, ElementoAbs p2) {
		ElementoAbs ganador = null;
		
		if(modoBatalla.compare(p1, p2) > 0) {
			ganador = p1;
			return ganador;
		}else if(modoBatalla.compare(p1, p2) < 0) {
			ganador = p2;
			return ganador;
		}else { //si es igual a cero es empate, devuelvo null
			return ganador;
		}
	}
	
	
	
	
	
	
	
	
	
	//getters y setters
	public ArrayList<Musical> getMusicales() {
		return new ArrayList<Musical>(musicales);
	}

	public ArrayList<Coach> getJurado() {
		return new ArrayList<Coach>(jurado);
	}


	public Comparator<ElementoAbs> getModoBatalla() {
		return modoBatalla;
	}


	public void setModoBatalla(Comparator<ElementoAbs> modoBatalla) {
		this.modoBatalla = modoBatalla;
	}

    
    

}
