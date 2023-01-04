package org.example;

import org.example.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EjmOrdenarObjetos {
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

        System.out.println(cursos+"\n");



        cursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println("Organizar el array ascendentemente usando el nombre del objeto para su comparación");
        System.out.println(cursos+"\n");



        cursos.sort(Comparator.comparing(Curso::getNombre).reversed());
        System.out.println("Organizar el array descendentemente usando el nombre del objeto para su comparación ");
        System.out.println(cursos+"\n");



        System.out.println("*********************************************");



        //Organiza el objeto en orden ascendente usando el getNombre, Se requiere implementar el Comparable<Curso> en la clase curso para que funcione este metodo para objetos y sobreescribir el metodo compareTo
        Collections.sort(cursos);
        System.out.println(cursos+"\n");

        //Organiza sin necesidad de agregar la implementación Comparable<Curso> en el curso
        Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
        System.out.println(cursos+"\n");

        System.out.println("***********************");
        System.out.println("Ordena por tiempo");
        //con el metodo stream requiere generar una nueva varible de tipo list, queda como el siguiente ejemplo
        List<Curso>cursoList = cursos.stream().sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList);

        System.out.println("***********************");
        System.out.println("Ordena por tiempo y hacer filtro y sacar este objeto, con .filter y usando lambda");
        List<Curso>cursoList2 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList2);


    }

}
