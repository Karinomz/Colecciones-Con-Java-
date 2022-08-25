/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class ListaDePerros {
    Scanner leer = new Scanner(System.in);
    String nombre;
    ArrayList<String> perros = new ArrayList();

    public ListaDePerros() {
    }

    public ArrayList<String> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<String> perros) {
        this.perros = perros;
    }
    
    
    public void razaPerro(){
        String salida;
        do{
            System.out.println("Ingrese una raza de perros");
            nombre = leer.next();
            perros.add(nombre);
            System.out.println("Quiere agregar otra raza S/N");
            salida = leer.next();
            salida = salida.toUpperCase();
        }while (salida.equals("S"));
    }
    
    public void mostrarPerros() {
        for(String aux : perros) {
            System.out.println(aux);
        }
        System.out.println("Cantidad = " + perros.size());
        Collections.sort(perros); //Ordena la Lista
    }
    
        public void buscarEliminarPerro(String nombre) {
        Iterator<String> it = perros.iterator(); // hay 3 formas de recorrer la lista con un interator, fori, .forEach
        
        int h = 0;
        while (it.hasNext()) { // .hasNext revisa si el siguiente elemento existe en caso contrario lo vuelve false
            String aux = it.next(); // toma el nombre de la lista
            if (aux.equals(nombre)) {
                it.remove();
                System.out.println("Se a removido exitosamente: " + nombre);
                h++;
            }
        }
        if (h == 0) {

            System.out.println("El nombre no esta en la lista");

            
        }
    }
    
    
    
    
    
}
