package Comparadores;

import java.util.Comparator;

import Entidades.ElementoAbs;

public class ComparadorAnd implements Comparator<ElementoAbs>{
	private Comparator<ElementoAbs> c1, c2;
	
	
	
	public ComparadorAnd(Comparator<ElementoAbs> c1, Comparator<ElementoAbs> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}



	@Override
	public int compare(ElementoAbs o1, ElementoAbs o2) {
		int res = c1.compare(o1, o2);
		
		if(res == 0) {
			return c2.compare(o1, o2);
		}
		
		return res;
	}

}
