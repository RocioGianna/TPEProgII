package tpe;

import java.util.ArrayList;

public class Musical {

    //a abstraer algunas cosas
    private String titulo;
    private String idioma;
    private ArrayList<String> generosMusicales;
    private ArrayList<String> instrumentos;

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

}
