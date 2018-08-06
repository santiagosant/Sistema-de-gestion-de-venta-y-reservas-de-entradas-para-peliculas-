/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author santi
 */
public class PaisDeOrigen {
    
    private String nombre;
    private String idioma;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public PaisDeOrigen(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }
    
    
    
}
