package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       String var1 = "Ejemplo1";
       String var2 = "Ejemplo2";
       String var3 = "Ejemplo3";
       String var4 = "Ejemplo4";

        //Declarar lista
        ArrayList<String> lista = new ArrayList<>();
        //agregar elemento a la lista
        lista.add(var1);
        lista.add(var2);
        lista.add(var3);
        lista.add(var4);

        System.out.println(lista);
        //eliminar elemento por indice
        lista.remove(2);
        System.out.println(lista);
        //Alterar el valor por indice
        lista.set(1, "Ejemplo Alterado");
        System.out.println(lista);
        System.out.println(lista.size());



    }
}