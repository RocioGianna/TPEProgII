package Entidades;

import java.util.Comparator;

import Comparadores.ComparadorAnd;
import Comparadores.ComparadorIdiomas;
import Comparadores.ComparadorInstrumentos;
import Criterios.Criterio;
import Criterios.CriterioAnd;
import Criterios.CriterioComun;
import Criterios.CriterioGenero;
import Criterios.CriterioIdioma;
import Criterios.CriterioTemaFinal;

public class Main {

	public static void main(String[] args) {
		
		Criterio idi = new CriterioIdioma("ingles");
		Criterio idi2 = new CriterioIdioma("Español");
		Criterio gen = new CriterioGenero("rock");
		Criterio gen2 = new CriterioGenero("folklore");
		Criterio andIdiomas = new CriterioAnd(idi,idi2);
		Criterio andIdiomasGeneros = new CriterioAnd(andIdiomas, gen);
		Criterio comun = new CriterioComun();
		
		Musical m = new Musical("prueba", "ingles", idi);
		m.addInstrumento("guitarra");
		m.addInstrumento("tambor");
		m.addGenero("folklore");
		
		Criterio tema = new CriterioTemaFinal(1, idi);
		
		Coach c1 = new Coach("Montaner", comun);
		Coach c2 = new Coach("La Sole", gen2);
		
		Participante p1 = new Participante("Pedro", "gonzales", 23);
		Participante p2 = new Participante("Maria", "gonzales", 13);
		Participante p3 = new Participante("Fernanda", "gonzales", 13);
		Participante p4 = new Participante("Gustavo", "Perez", 48);
		
		p1.addIdioma("Español");
		p1.addIdioma("ingles");
		p1.addGenero("pop");
		p1.addInstrumento("flauta");
		
		p2.addIdioma("Español");
		p2.addIdioma("ingles");
		p2.addGenero("rock");
		p2.addGenero("pop");
		p2.addInstrumento("guitarra");
		p2.addInstrumento("tambor");
		
		p3.addIdioma("Español");
		p3.addIdioma("Aleman");
		p3.addGenero("pop");
		p3.addInstrumento("guitarra");
		
		p4.addIdioma("ingles");
		p4.addGenero("folklore");
		p4.addInstrumento("guitarra");
	
	/*	c1.addParticipante(p1); //lo agrega ya que arranca con criterio comun es decir no exige nada
		
		c1.setRequisitos(andIdiomasGeneros); //cambia requisitos
		
		c1.addParticipante(p2); //no la acepta ya que no cumple con los requisitos  */
		
		c2.addParticipante(p1); // no lo agrega porque no cumple con el requisito
		c2.addParticipante(p2); //la agrega cumple con el requsito
		c2.addParticipante(p3); //no la agrega porque tienen mismo nombre y edad es decir es la misma persona

	/*	System.out.println(c1.getEquipo());
		System.out.println(c1.getPromedioEdad()); 
		System.out.println(c2.getEquipo());
		System.out.println(c2.getPromedioEdad());  */
		
		
		/********************************************************COMPOSITE***********************************/
		Conjunto cj = new Conjunto("Jonas Brothers");
		Conjunto cj2 = new Conjunto("Divididos");
		
		cj.addMiembro(p1);
		cj.addMiembro(p3); 
		cj.addMiembro(cj2);
		
		cj2.addMiembro(p2);
		
		c1.addParticipante(cj);
		
		c1.addParticipante(p4);
	
		
		//c1.addParticipante(p2);
		//System.out.println(c1.getPromedioEdad());
		//System.out.println(c1.getEquipo());
		//System.out.println(c1.seleccionarCompetidor(temaFinal));
		System.out.println(cj.getGenerosPreferidos());
		//System.out.println(cj.getIdiomas());
		//System.out.println(cj.getEdad());
		//System.out.println(c1.obtenerInstrumentosEquipo());
		//System.out.println(c1.getPromedioEdad());
		//System.out.println(c1.obtenerIdiomasEquipo());
		System.out.println(c1.obtenerGenerosEquipo()); 
		System.out.println(cj2.getGenerosPreferidos());
	
		System.out.println(c1.seleccionarCompetidor(tema));
		
		/*****************************PRUEBA BATALLA*****************************/
		Comparator<ElementoAbs> comparador = new ComparadorIdiomas();
		Comparator<ElementoAbs> comparador2 = new ComparadorInstrumentos();
		Comparator<ElementoAbs> comparadorAnd = new ComparadorAnd(comparador, comparador2);
		
		Produccion p = new Produccion(comparadorAnd);
		
		System.out.println(p.batallar(p1, p2));

	}

}
