/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



/**
 *
 * @author Omar
 */
public class Guia3Ejercicio6 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> tienda = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        
        do {
            System.out.println("MENU\n1.Agregar Producto\n2.Eliminar Producto\n3.Modificar Producto\n4.Ver Lista\n5.Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Nombre y Precio del producto a Agregar");
                    System.out.print("Nombre: ");
                    String nombre = leer.next();
                    System.out.print("Precio: ");
                    Integer precio = leer.nextInt();
                    tienda.put(nombre, precio);
                    break;
                case 2:
                    System.out.println("Escriba el nombre para remover el elemento");
                    String elim = leer.next();
                    tienda.remove(elim);
                    break;
                case 3:
                    System.out.println("Escriba el Producto a Modificar");
                    System.out.print("Nombre: ");
                    nombre = leer.next();
                    System.out.print("Nuevo Precio: ");
                    precio = leer.nextInt();
                    tienda.replace(nombre, precio);
                    break;
                case 4:
                    for (Map.Entry<String, Integer> entry : tienda.entrySet()) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        System.out.println("Producto: "+ key+"\nPrecio: "+ value+"$");
                    }

                    break;

            }
        } while (opc != 5);
    }

}
