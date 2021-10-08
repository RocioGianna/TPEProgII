package tpe;

import java.util.ArrayList;

public class Coach {
	private String nombre;
	private ArrayList<Participante>equipo;
	
	public Coach(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<Participante>();
	}
	
	public double getPromedioEdad() {
		double total = 0.0;
		for(int i =0; i < equipo.size(); i++) {
			total+= equipo.get(i).getEdad();
		}
		return total/equipo.size();
	}
	//METODOS QUE RETORNEN LISTADOS DE INSTRUMENTOS, IDIOMAS, GENEROS
							//(otro dia )
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Participante> getEquipo() {
		return new ArrayList<Participante>(equipo);
	}
}
