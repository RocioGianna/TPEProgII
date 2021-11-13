package Criterios;

import Entidades.ElementoAbs;
import Entidades.Musical;

public class CriterioTemaFinal extends Criterio {
	private Musical tema;
	private int cantMiembros;
	
	
	
	
	public CriterioTemaFinal(Musical tema, int cant) {
		this.tema = tema;
		this.cantMiembros = cant;
	}


	@Override
	public boolean cumple(ElementoAbs p) {
		for(String i:tema.getInstrumentos()) {
			if(p.getCantidadMiembrosInstrumentos(i) == this.cantMiembros)
				return true;
		}
		return false;
	}

}
