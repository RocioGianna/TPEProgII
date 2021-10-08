package tpe;

import java.util.ArrayList;

public class Produccion {

    private ArrayList<Musical> musicales;
    private ArrayList<Coach> jurado;
    private ArrayList<Participante> participantes;

	public Produccion() {
		this.musicales = new ArrayList<>();
		this.jurado = new ArrayList<>();
		this.participantes = new ArrayList<>();
	}
	/*

    no se como funciona pero ya esta implementado

    public method(type any){
        return any;
    }

	 */

	
	//getters y setters
	public ArrayList<Musical> getMusicales() {
		return new ArrayList<Musical>(musicales);
	}

	public ArrayList<Coach> getJurado() {
		return new ArrayList<Coach>(jurado);
	}

	public ArrayList<Participante> getParticipantes() {
		return new ArrayList<Participante>(participantes);
	}

    
    

}
