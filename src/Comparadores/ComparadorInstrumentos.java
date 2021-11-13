package Comparadores;

import java.util.Comparator;

import Entidades.ElementoAbs;

public class ComparadorInstrumentos implements Comparator<ElementoAbs>{

	@Override
	public int compare(ElementoAbs o1, ElementoAbs o2) {
		return o1.getCantidadInstrumentos() - o2.getCantidadInstrumentos();
	}

}
