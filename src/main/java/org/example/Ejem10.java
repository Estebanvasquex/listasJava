package org.example;

import java.util.HashSet;
import java.util.Set;

public class Ejem10 {

    //utilizando la interface Set<> para crear las listas
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los Palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Picapiedra";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Esteban Vásquez";

        //HashSet<> es similar al arrayList

        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        for(String alumno: listaAlumnos){
            System.out.println(alumno);

        }








    }

}
