package com.finanzas.recibohonorarios.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emisores")
public class Emisor {
    @Id
    private long c_dni;
    private String nombre;
    private String apellido;
    private String direccion;

    public Emisor() {
    }

    public Emisor(long c_dni, String nombre, String apellido, String direccion) {
        this.c_dni = c_dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public long getC_dni() {
        return c_dni;
    }

    public Emisor setC_dni(long c_dni) {
        this.c_dni = c_dni;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Emisor setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Emisor setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Emisor setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
}
