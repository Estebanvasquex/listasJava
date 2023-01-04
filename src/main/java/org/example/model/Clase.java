package org.example.model;

public class Clase {

    private String nombre;

    public Clase(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Esto es una prueba de javadoc
     * @return
     */
    @Override
    public String toString() {
        return nombre;
    }
}
