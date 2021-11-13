package Entidades;

import java.util.ArrayList;

import Criterios.Criterio;

public class Musical {
    private String titulo;
    private String idioma;
    private ArrayList<String> generosMusicales;
    private ArrayList<String> instrumentos;
    private Criterio criterio;
    
    public Musical(String titulo, String idioma, Criterio c) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
		this.criterio = c;
	}
    
    

	public boolean puedeInterpretrar(ElementoAbs p) {
		if(criterio.cumple(p)) {
			return true;
		}
		return false;
	} 

    
    
	
	public void addInstrumento(String i) {
		if(!this.instrumentos.contains(i))
			this.instrumentos.add(i);
	}
	
	public void addGenero(String i) {
		if(!this.generosMusicales.contains(i))
			this.generosMusicales.add(i);
	}
	
	
	
	
	
	//getter y setters
	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<String> getGenerosMusicales() {
        return new ArrayList<String>(generosMusicales);
    }

    public ArrayList<String> getInstrumentos() {
        return new ArrayList<String>(instrumentos);
    }

	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}


}
