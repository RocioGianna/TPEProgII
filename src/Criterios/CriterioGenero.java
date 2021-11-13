package Criterios;

import Entidades.ElementoAbs;


public class CriterioGenero extends Criterio{

	private String genero;
	
	
	public CriterioGenero(String gen) {
		this.genero = gen;
	}
	
	@Override
	public boolean cumple(ElementoAbs p) {
		return p.leGustaGenero(this.genero);
	}

}
