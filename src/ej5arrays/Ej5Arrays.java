/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5arrays;

import utilidad.newpackage.Utilidad;

/**
 *
 * @author dam
 */
public class Ej5Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa miEmpresa;
        int nclientes;
        nclientes=Utilidad.pedirNumeroEntero("Introduce el numero de clientes",1);
        miEmpresa= new Empresa(nclientes);
        miEmpresa.pedirClientes();
        
    }
    
}
