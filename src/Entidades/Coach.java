package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import Criterios.Criterio;


public class Coach {
	private String nombre;
	private ArrayList<ElementoAbs>equipo;
	private Criterio requisitos; //tipo de jurado exigente, comun para este caso tenemos un Criterio "comun" que retorna true
	
	public Coach(String nombre, Criterio req) {
		this.nombre = nombre;
		this.equipo = new ArrayList<ElementoAbs>();
		this.requisitos = req;
	}
	
	public void addParticipante(ElementoAbs p) {
		if(!equipo.contains(p) && this.requisitos.cumple(p)) {
			this.equipo.add(p);
		} 
	}
	
	public double getPromedioEdad() {
		double total = 0.0;
		
		for(int i =0; i < equipo.size(); i++) {
			total+= equipo.get(i).getEdad();
		}
		return total/equipo.size();
	}
	
	public ArrayList<ElementoAbs> seleccionarCompetidor(Criterio c){
		ArrayList<ElementoAbs> pasan = new ArrayList<>();
		for(ElementoAbs e: equipo) {
			pasan.addAll(e.getConjuntoQueCumple(c));
		}
		return pasan;
	}
	
	
	//Como los jurados no quieren perder una desean poder contar con un mecanismo que les permita
	//dada la forma actual que se va a utilizar para determinar el ganador de una batalla, obtener un listado
	//de sus participantes ordenado de forma tal que los primeros miembros del listado sean los que les
	//ganen o empaten con los siguientes miembros (siempre dentro del mismo equipo del juez).
	
	public ArrayList<ElementoAbs> getEquipoOrdenadoSegun(Comparator<ElementoAbs> comp){
		ArrayList<ElementoAbs> ordenados = new ArrayList<>(this.equipo);
		Collections.sort(ordenados, comp);
		return ordenados;
	}
	
	
	
	//Listado de instrumentos, idiomas y generos de su equipo sin repetidos
	
	public 	ArrayList<String> obtenerIdiomasEquipo(){
		ArrayList<String> idiomas = new ArrayList<>();
		for(ElementoAbs e:equipo) {
			idiomas.addAll(e.getIdiomas());
		}
		return this.quitarRepetidos(idiomas);
	}
	
	public ArrayList<String> obtenerInstrumentosEquipo(){
		ArrayList<String> instrumentos = new ArrayList<>();
		for(ElementoAbs e:equipo) {
			instrumentos.addAll(e.getInstrumentos());
		}
		return this.quitarRepetidos(instrumentos);
	}
	
	public ArrayList<String> obtenerGenerosEquipo(){ //generos sin repetidos ordenados alfabeticamente
		ArrayList<String> generos = new ArrayList<>();
		for(ElementoAbs e:equipo) {
			generos.addAll(e.getGenerosPreferidos());
		}
		ArrayList<String> generosSinRep = this.quitarRepetidos(generos);
		Collections.sort(generosSinRep); 
		return generosSinRep;
	}
	
	private ArrayList<String> quitarRepetidos(ArrayList<String> original){
		Set<String> sinRep = new HashSet<String>(original);
		original.clear();
		original.addAll(sinRep);
		return original;
	}
	
	
	
	
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<ElementoAbs> getEquipo() {
		return new ArrayList<ElementoAbs>(equipo);
	}
	public Criterio getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(Criterio requisitos) {
		this.requisitos = requisitos;
	}

}
