/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.List;

/**
 *
 * @author santi
 */
public class Sala {
    private int capacidad;
    private int numero;
    private List<Funcion> funciones;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public Sala(int capacidad, int numero, List<Funcion> funciones) {
        this.capacidad = capacidad;
        this.numero = numero;
        this.funciones = funciones;
    }
    
    
    
}
