/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3colecciones;

import Entidades.Pais;

/**
 *
 * @author Omar
 */
public class Guia3Ejercicio5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Pais pais = new Pais();
        
        pais.ingresePaises();
        pais.mostrarLista();
        System.out.println("-------------");
        pais.eliminarPais("Argentina");
        pais.mostrarLista();

        
    }
    
}
