package Criterios;

import Entidades.ElementoAbs;


public class CriterioInstrumento extends Criterio{

	private String instrumento;
	
	
	public CriterioInstrumento(String ins) {
		this.instrumento = ins;
	}
	
	@Override
	public boolean cumple(ElementoAbs p) {
		return p.tocaInstrumentos(this.instrumento);
	}

}
