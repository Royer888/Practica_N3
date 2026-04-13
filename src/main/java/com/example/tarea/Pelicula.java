package com.example.tarea;

import java.util.List;

public class Pelicula {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaEstreno;
    private List<String> generos;
    private int duracion;

    // Constructor sin ID (para mantener compatibilidad)
    public Pelicula(String nombre, String descripcion, String fechaEstreno, List<String> generos, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEstreno = fechaEstreno;
        this.generos = generos;
        this.duracion = duracion;
    }

    // Constructor con ID (para POST, DELETE, PUT)
    public Pelicula(int id, String nombre, String descripcion, String fechaEstreno, List<String> generos, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEstreno = fechaEstreno;
        this.generos = generos;
        this.duracion = duracion;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getFechaEstreno() { return fechaEstreno; }
    public List<String> getGeneros() { return generos; }
    public int getDuracion() { return duracion; }

    // Setters (para PUT)
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setFechaEstreno(String fechaEstreno) { this.fechaEstreno = fechaEstreno; }
    public void setGeneros(List<String> generos) { this.generos = generos; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
}