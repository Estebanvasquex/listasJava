package org.example;

import org.example.model.Alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Ejem13 {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Luis Miguel","123");
        Alumno alumno2 =  new Alumno("Pepito los Palotes","4477");
        Alumno alumno3 = new Alumno("Juan Carlos","8899");
        Alumno alumno4 = new Alumno("Pedro Picapiedra","7788");
        Alumno alumno5 = new Alumno("Gustavo Sanchez","5566");
        Alumno alumno6 = new Alumno("Esteban Vásquez","2255");
        Alumno alumno7 = new Alumno("Esteban Vásquez","2255");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

        System.out.println(listaAlumnos.contains(alumno7));
    }



}
