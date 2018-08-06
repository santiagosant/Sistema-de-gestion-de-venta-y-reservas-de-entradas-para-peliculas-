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
public class Actor1 {
    
    private boolean animado;
    private String nombre;
    private String apellido;
    private SexoGenero genero;

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public SexoGenero getGenero() {
        return genero;
    }

    public void setGenero(SexoGenero genero) {
        this.genero = genero;
    }

    public Actor1(boolean animado, String nombre, String apellido, SexoGenero genero) {
        this.animado = animado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }
    
    
    
}
