/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Entrada {
    
    private Date fechaHoraFuncion;
    private Date fechaHoraVenta;
    private double precioCobrado;
    private int ticketNro;
    private boolean anulado;

    public Date getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Date fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public double getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(double precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public Entrada(Date fechaHoraFuncion, Date fechaHoraVenta, double precioCobrado, int ticketNro, boolean anulado) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
        this.anulado = anulado;
    }

    
    
    //funciones
    
    public boolean estaAnulado(){
        return this.anulado;
    }    
    
}
