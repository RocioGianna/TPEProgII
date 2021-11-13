package Criterios;

import Entidades.ElementoAbs;


public class CriterioIdioma extends Criterio {
	
	private String idioma;
	
	
	public CriterioIdioma(String idioma) {
		this.idioma = idioma;
	}


	@Override
	public boolean cumple(ElementoAbs p) {
		return p.contieneIdioma(idioma);
	}

}
