package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class EjmOrdenarLista {
    public static void main(String[] args) {
        String curso1 = "Geometría";
        String curso2 = "Física";
        String curso3 = "Religión";
        String curso4 = "Etica";


        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);
        //Ordena ascendentemente usando la clase Collections
        Collections.sort(cursos);
        System.out.println(cursos);
        //Ordena descendentemente usando la clase Collections
        Collections.reverse(cursos);
        System.out.println(cursos);

        //Ordena descendentemente usando metodos propios de la lista
        cursos.sort(Comparator.reverseOrder());
        System.out.println(cursos);

        //Ordena ascendentemente usando metodos propios de la lista
        cursos.sort(Comparator.naturalOrder());
        System.out.println(cursos);

        //Ordena ascendentemente usando stream con este se crea una lista nueva
        System.out.println("Ordena ascendentemente usando stream");
        List<String> cursos2 = cursos.stream().collect(Collectors.toList());
        System.out.println(cursos2);

    }
}
