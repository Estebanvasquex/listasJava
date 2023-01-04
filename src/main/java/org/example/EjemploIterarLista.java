package org.example;

import java.util.ArrayList;

public class EjemploIterarLista {
    public static void main(String[] args) {

        String var1 = "Perro";
        String var2 = "Gato";
        String var3 = "Cababallo";
        String var4 = "Elefante";


        ArrayList<String> listaString = new ArrayList<>();
        listaString.add(var1);
        listaString.add(var2);
        listaString.add(var3);
        listaString.add(var4);

        System.out.println(listaString);

        //Como leer una lista con for

        for(int i = 0; i <listaString.size(); i++){
            System.out.println(listaString.get(i));
        }

        //Como leer una lista con foreach
        for(String animal: listaString){
            System.out.println(animal);

        }

        //Como leer una lista con lambdas esto es apartir de java 8

        listaString.forEach(animal ->{
            System.out.println(animal);
        });



        }




    }
