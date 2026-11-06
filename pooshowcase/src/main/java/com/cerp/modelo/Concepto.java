package com.cerp.modelo;

import java.util.function.Supplier;

public class Concepto {
    private final String clave;
    private final String titulo;
    private final String descripcion;
    private final Supplier<String> ejemplo;

    public Concepto(String clave, String titulo, String descripcion, Supplier<String> ejemplo) {
        this.clave = clave;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ejemplo = ejemplo;
    }

    public String getClave() {
        return clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String ejecutarEjemplo() {
        return ejemplo.get();
    }

    @Override
    public String toString() {
        return titulo;
    }
}
