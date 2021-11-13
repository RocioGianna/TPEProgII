package Criterios;

import Entidades.ElementoAbs;
import Entidades.Musical;

public class CriterioTemaMusical extends Criterio {
	private Musical tema;
	
	
	public CriterioTemaMusical(Musical tema) {
		this.tema = tema;
	}


	@Override
	public boolean cumple(ElementoAbs p) {
		return tema.puedeInterpretrar(p);
	}

}
