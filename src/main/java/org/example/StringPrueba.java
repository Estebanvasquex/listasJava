package org.example;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class StringPrueba {
    public static void main(String[] args) {

        String nombre = "esteban";

        for(int i=0; i<nombre.length(); i++){

            System.out.println(nombre.charAt(i));

        }

        String s = "Techie Delight";

        CharacterIterator it = new StringCharacterIterator(s);

        while (it.current() != CharacterIterator.DONE)
        {
            System.out.print(it.current());
            it.next();
        }
    }

}
