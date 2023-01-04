package org.example;

import org.example.model.Curso;

import java.util.ArrayList;

public class ListaObjetos {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometría",30);
        Curso curso2 = new Curso("Historia",20);
        Curso curso3 = new Curso("Religión",10);
        Curso curso4 = new Curso("Ética",50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        //Se debe crear el metodo toString para que muestre los datos del objeto y no el identificador en memoria
        System.out.println(cursos);

    }




}
