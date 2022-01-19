/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5arrays;

import Fecha.Fecha;
import utilidad.newpackage.Utilidad;

/**
 *
 * @author dam
 */
public class Empresa {
    Cliente[]clientes;
    Descuento[]descuentos;

    public Empresa(int nClientes) {
        clientes=new Cliente[nClientes];
        descuentos=new Descuento[]{
            new Descuento(30,0.1f),
            new Descuento(90,0.07f),
            new Descuento(120,0.05f),
            new Descuento(180,0.02f),
            new Descuento(Integer.MAX_VALUE,0f)
        };
    }
    public void pedirClientes(){
        String nombre,cif;
        int dven;
        Fecha fecha;
        Float importe;
        for(int ncliente=0;ncliente<clientes.length;ncliente++){
            cif=Utilidad.pedirString("Dime el cif");
            nombre=Utilidad.pedirString("Dime el nombre");
            dven=Utilidad.pedirNumeroEntero("Dime la fecha de vencimiento",0);
            fecha=Utilidad.pedirFecha("Dime la fecha de la factura:");
            importe=Utilidad.pedirNumero("Dime el importe de la factura:",0f);
            clientes[ncliente]= new Cliente(cif,nombre,fecha,dven,importe);
        }
        
    }
    public void informe(){
        Fecha fhoy=new Fecha();
        System.out.println("\t\t\tInforme de factura");
        System.out.println("Fecha: "+fhoy.fechaCompletaLetra());
        System.out.println("Nueva linea");
    }
}
