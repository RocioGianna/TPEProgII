package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import Criterios.Criterio;



public class Conjunto extends ElementoAbs {
	private ArrayList<ElementoAbs> miembros;

	public Conjunto(String nombre) {
		super(nombre);
		this.miembros = new ArrayList<>();
	}
	
	public int getCantidadMiembrosInstrumentos(String instrumento) {
		int total = 0;
		for(ElementoAbs e:miembros) {
			total+= e.getCantidadMiembrosInstrumentos(instrumento);
		}
		return total;
	}
	
	
	public void addMiembro(ElementoAbs m) { 
		if(!miembros.contains(m)) { //verifica no tener el participante que se quiere unir.
			this.miembros.add(m);
		}
	}
	@Override
	public double getEdad() { //devuelve el promedio de la edad del grupo
		int edad = 0;
		for(ElementoAbs e: miembros) {
			edad += e.getEdad();
		}
		return edad / miembros.size();
	}

	@Override
	public ArrayList<String> getGenerosPreferidos() { //interseccion de generos
		ArrayList<String> generos = new ArrayList<>();
		
		if(!miembros.isEmpty()) {
			//inicializo ambas variables
			int menor = miembros.get(0).getCantidadGeneros(); 
			ElementoAbs auxMenor = miembros.get(0);
		
			//busco dentro de mi equipo el miembro que tenga el arreglo de generos con menor cantidad 
			//con el objetivo de hacer mas rapida la busqueda de la interseccion
			for(ElementoAbs m: miembros) { 
				if(menor > m.getCantidadGeneros()) {
					menor = m.getCantidadGeneros();
					auxMenor = m; 
				}
			}
			
			for(String mi:auxMenor.getGenerosPreferidos()) { //recorro generos de mi menor
				boolean interseccion = true; 
				for(ElementoAbs miembro:miembros){ //recorro todos mis miembros
					if(!miembro.getGenerosPreferidos().contains(mi)) { //me fijo si lo contiene dentro de su arreglo
						interseccion = false;
					}
				}
				if(interseccion) {
					generos.add(mi);
				}
			}
		}
		
		return generos;
	}

	@Override
	public ArrayList<String> getIdiomas() { //idiomas sin repetidos
		ArrayList<String> idiomas = new ArrayList<>();
		for(ElementoAbs m: miembros) {
			idiomas.addAll(m.getIdiomas());
		}
		return this.quitarRepetidos(idiomas);
	}

	@Override
	public ArrayList<String> getInstrumentos() { //instrumentos sin repetidos
		ArrayList<String> instrumentos = new ArrayList<>();
		for(ElementoAbs m: miembros) {
			instrumentos.addAll(m.getInstrumentos());
		}
		return this.quitarRepetidos(instrumentos);
	}
	
	private ArrayList<String> quitarRepetidos(ArrayList<String> original){ //metodo que se encarga de sacar los repetidos
		Set<String> sinRep = new HashSet<String>(original);
		original.clear();
		original.addAll(sinRep);
		return original;
	}

	@Override
	public ArrayList<ElementoAbs> getConjuntoQueCumple(Criterio c) { 
		ArrayList<ElementoAbs> cumplen = new ArrayList<>();
		
		if(c.cumple(this)) {
			cumplen.add(this);
			return cumplen;
		}
		
		for(ElementoAbs e: miembros) {
			cumplen.addAll(e.getConjuntoQueCumple(c));
		}
		
		return cumplen;
	}
	
	@Override
	public boolean equals(Object obj) { //equals redefinido para que funcione el contains
		try {
			Conjunto x = (Conjunto) obj;
			return this.getNombre().equals(x.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		String retorno  = "{ Conjunto " + this.getNombre();
		for(ElementoAbs e: miembros) {
			 retorno+= " -Miembro de  " + this.getNombre() + e.toString();
		}
		return retorno + " }";
	}
	
}
