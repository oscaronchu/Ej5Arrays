/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5arrays;

import Fecha.Fecha;

/**
 *
 * @author dam
 */
public class Cliente {
    String cif;
    String nombre;
    Fecha fechaFra;
    int diasVen;
    Float importe;

    public Cliente(String cif, String nombre, Fecha fechaFra, int diasVen, Float importe) {
        this.cif = cif;
        this.nombre = nombre;
        this.fechaFra = fechaFra;
        this.diasVen = diasVen;
        this.importe = importe;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaFra() {
        return fechaFra;
    }

    public int getDiasVen() {
        return diasVen;
    }

    public Float getImporte() {
        return importe;
    }
    public void grabar(String cif, String nombre, Fecha fechaFra, int diasVen, Float importe){
        this.cif = cif;
        this.nombre = nombre;
        this.fechaFra = fechaFra;
        this.diasVen = diasVen;
        this.importe = importe;
    }
}
