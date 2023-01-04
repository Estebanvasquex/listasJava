package org.example.model;

import java.util.*;

public class Curso implements Comparable<Curso>{

        private String nombre;
        private int tiempo;

        private List<Clase> claseList = new ArrayList<>();

        private Collection<Alumno> alumnos = new HashSet<>();

    public Curso(String nombre, int tiempo, List<Clase> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }
    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public List<Clase> getClaseList() {
        return claseList;
    }

    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Collection<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void addClase(Clase clase){
        this.claseList.add(clase);

    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public boolean verificarAlumno (Alumno alumno){

        return this.alumnos.contains(alumno);
    }



    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }

    @Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
