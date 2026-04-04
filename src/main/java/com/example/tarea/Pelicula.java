package com.example.tarea;

import java.util.List;

public class Pelicula {
    private String nombre;
    private String descripcion;
    private String fechaEstreno;
    private List<String> generos;
    private int duracion;

    public Pelicula(String nombre, String descripcion, String fechaEstreno, List<String> generos, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEstreno = fechaEstreno;
        this.generos = generos;
        this.duracion = duracion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getFechaEstreno() { return fechaEstreno; }
    public List<String> getGeneros() { return generos; }
    public int getDuracion() { return duracion; }
}