/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Alumno {
        private String nombre;
    private ArrayList<Integer>nota = new ArrayList();
    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer>nota) {
        this.nombre = nombre;
        this.nota.addAll(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public int notaFinal(){
    int total =0 ;
        for (int i = 0; i < nota.size(); i++) {
          total +=  nota.get(i);
        }
    return total/3;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    

  
}
