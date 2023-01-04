package org.example;

import org.example.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;

public class Ejm8 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Ruby",30);
        Curso curso2 = new Curso("Javascript",20);
        Curso curso3 = new Curso("PHP",10);
        Curso curso4 = new Curso("Java",50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //sumar los tiempos de todos los cursos

        int tiempo = 0;
        for (Curso curso: cursos){
            tiempo += curso.getTiempo();
        }
        System.out.println("LA SUMATORIA DE TIEMPO DE TODOS LOS CURSOS ES: " + tiempo);

        System.out.println("-----------------------------------------------------");

        int tiempoMayor = 0;
        for (Curso curso: cursos){
            if (curso.getTiempo()>tiempoMayor){
                tiempoMayor = curso.getTiempo();
            } ;
        }

        System.out.println("EL MAYOR TIEMPO EN LOS CURSOS ES: " + tiempoMayor);

        System.out.println("-----------------------------------------------------");

        int sumaTiempoFiltro = 0;
        for (Curso curso: cursos){
            if (!curso.getNombre().equalsIgnoreCase("Ruby")){
                sumaTiempoFiltro += curso.getTiempo();
            } ;
        }
        System.out.println("LA SUMA DE TIEMPO SIN CUROS HISTORIA ES: " + sumaTiempoFiltro);

        System.out.println("-----------------------------------------------------");

        cursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println("Organizar el array ascendentemente usando el nombre del objeto para su comparación");
        System.out.println(cursos+"\n");



        cursos.sort(Comparator.comparing(Curso::getNombre).reversed());
        System.out.println("Organizar el array descendentemente usando el nombre del objeto para su comparación ");
        System.out.println(cursos+"\n");

    }

}
