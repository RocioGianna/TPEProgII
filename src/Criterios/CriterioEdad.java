package Criterios;

import Entidades.ElementoAbs;

public class CriterioEdad extends Criterio {
	private int edad;
	
	
	
	public CriterioEdad(int edad) {
		super();
		this.edad = edad;
	}



	@Override
	public boolean cumple(ElementoAbs p) {
		return p.getEdad() > this.edad;
	}

}
