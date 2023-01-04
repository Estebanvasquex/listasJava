package org.example;

import java.util.*;

public class Ejem11 {

    //utilizando la interface Set<> para crear las listas
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los Palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Picapiedra";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Esteban Vásquez";

        //HashSet<> es similar al arrayList
        //usando la clase Collection podemos crear listas de tipo Set, List dado que el polimorfismo nos lo permite
        //listas con set no permite registros duplicados y los objetos no tienen un orden
        //Listas con con list permiten parametros duplicados y los objetos tienen un orden se pueden llamar con nombreLista.get()

        Collection<String> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        Collection<String> listaAlumnos2 = new ArrayList<>();
        listaAlumnos2.add(alumno1);
        listaAlumnos2.add(alumno2);
        listaAlumnos2.add(alumno3);
        listaAlumnos2.add(alumno4);
        listaAlumnos2.add(alumno5);
        listaAlumnos2.add(alumno6);





        System.out.println("******Recorre lista con for***********");
        for(String alumno: listaAlumnos){
            System.out.println(alumno);

        }

        System.out.println("******Recorre lista con forEach***********");
        listaAlumnos2.forEach(alumno -> {
            System.out.println(alumno);
        });








    }

}
