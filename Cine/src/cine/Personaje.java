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
public class Personaje {
    
    private String nombreEnPelicula;
    private Actor1 actor;
    private Rol rol;

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Actor1 getActor() {
        return actor;
    }

    public void setActor(Actor1 actor) {
        this.actor = actor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Personaje(String nombreEnPelicula, Actor1 actor, Rol rol) {
        this.nombreEnPelicula = nombreEnPelicula;
        this.actor = actor;
        this.rol = rol;
    }
    
    
    
}
