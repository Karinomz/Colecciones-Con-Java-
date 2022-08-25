/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Omar
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion()); //ordena de abajo para arriba
        }
    };

    public static Comparator<Pelicula> ordenDesc = new Comparator<Pelicula>() { //ordena de arriba hacia abajo
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator<Pelicula> Alfabeticamente = new Comparator<Pelicula>() { //ordena por director
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
            public static Comparator<Pelicula> alfaTitle= new Comparator<Pelicula>() { //ordena por titulo
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
}
