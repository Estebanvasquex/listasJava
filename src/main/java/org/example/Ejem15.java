package org.example;

import org.example.model.Alumno;
import org.example.model.Curso;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ejem15 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Ruby", 30);

        Alumno alumno1 = new Alumno("Luis Miguel", "123");
        Alumno alumno2 = new Alumno("Pepito los Palotes", "4477");
        Alumno alumno3 = new Alumno("Juan Carlos", "8899");
        Alumno alumno4 = new Alumno("Pedro Picapiedra", "7788");
        Alumno alumno5 = new Alumno("Gustavo Sanchez", "5566");
        Alumno alumno6 = new Alumno("Esteban Vásquez", "2255");
        Alumno alumno7 = new Alumno("Esteban Vásquez", "2255");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        //Recorrer la lista con lambda y forEach
        curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
        System.out.println("************ Iteretor ************");

        //Iteretor se usa cuando queremos usar el while meintras que exista un siguiente registro
        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();

        while (alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next());
        }



    }



}
