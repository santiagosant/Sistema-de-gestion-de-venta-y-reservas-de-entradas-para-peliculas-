/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Date;
import java.util.List;

/**
 *
 * @author santi
 */
public class Cine {
    
    private String direccion;
    private Date fechaDeInaguraciion;
    private String nombre;
    private double precioEntrada;
    private List<Sala> salas;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaDeInaguraciion() {
        return fechaDeInaguraciion;
    }

    public void setFechaDeInaguraciion(Date fechaDeInaguraciion) {
        this.fechaDeInaguraciion = fechaDeInaguraciion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public Cine(String direccion, Date fechaDeInaguraciion, String nombre, double precioEntrada, List<Sala> salas) {
        this.direccion = direccion;
        this.fechaDeInaguraciion = fechaDeInaguraciion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.salas = salas;
    }
    
    public String mostrarCine(){
        return this.getNombre() +" Inagurado en "+this.getFechaDeInaguraciion()+" ubicado en la calle "+ this.getDireccion()+ " cuenta con "+this.getSalas()+" salas "+ " y una entrada a $"+ this.getPrecioEntrada() ;
    }
    
    Horarios de funcion
}
