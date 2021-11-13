package Comparadores;

import java.util.Comparator;

import Entidades.ElementoAbs;

public class ComparadorEdad implements Comparator<ElementoAbs>{

	@Override
	public int compare(ElementoAbs o1, ElementoAbs o2) {
		return (int) (o1.getEdad() - o2.getEdad());
	}

}
