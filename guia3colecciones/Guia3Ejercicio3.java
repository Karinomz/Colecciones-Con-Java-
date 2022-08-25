/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3colecciones;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Guia3Ejercicio3 {
        
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
            ArrayList<Alumno> Alum = new ArrayList(); //ARRAY LIST DE OBJETOS
            ArrayList<Integer> nota = new ArrayList();
            
            char op;
        do {
            System.out.println("Nombre del Alumno");
            String nombre = leer.next();
            System.out.println("NOTA 1:");
            nota.add(leer.nextInt());
            System.out.println("NOTA 2:");
            nota.add(leer.nextInt());
            System.out.println("NOTA 3:");
            nota.add(leer.nextInt());
            Alum.add(new Alumno(nombre, nota));
            nota.clear();           
            System.out.println("Desea ingresar otro Alumno: S/N");
             op = leer.next().charAt(0);
             op = Character.toUpperCase(op);
        } while (op == 'S');
        
        Alum.forEach((Alumno) -> {
            System.out.println(Alumno.toString());
        });
        for (Alumno alumno : Alum) {
            System.out.println(alumno.toString());
        }
        
        System.out.println("Ingrese el nombre del alumno q desea buscar en la lista");
        String nom = leer.next();
        int h = 0;
        for (Alumno alumno : Alum) {
            if (alumno.getNombre().equals(nom)) {
                System.out.println("La nota del Alumno "+ nom +" es de: "+ alumno.notaFinal());
                h++;
            }
        }
            if (h==0) {
                
                System.out.println("El alumno no se encuentra en al lista");
            }
    }
}
