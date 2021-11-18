package Criterios;

import Entidades.ElementoAbs;

public class CriterioTemaFinal extends Criterio {
	private int cantMiembros;
	private Criterio c;
	
	
	
	
	public CriterioTemaFinal(int cant, Criterio criterio) {
		this.cantMiembros = cant;
		this.c = criterio;
	}


	@Override
	public boolean cumple(ElementoAbs p) {
		return p.getCantidadMiembros(c) == this.cantMiembros;
	}

}
