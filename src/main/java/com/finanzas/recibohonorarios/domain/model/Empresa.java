package com.finanzas.recibohonorarios.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    private long c_ruc;
    private String nombre;
    private long dni;
    private long telefono;
    private String tdomicilio;

    public Empresa() {
    }

    public Empresa(long c_ruc, String nombre, long dni, long telefono, String tdomicilio) {
        this.c_ruc = c_ruc;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.tdomicilio = tdomicilio;
    }

    public long getC_ruc() {
        return c_ruc;
    }

    public Empresa setC_ruc(long c_ruc) {
        this.c_ruc = c_ruc;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Empresa setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public long getDni() {
        return dni;
    }

    public Empresa setDni(long dni) {
        this.dni = dni;
        return this;
    }

    public long getTelefono() {
        return telefono;
    }

    public Empresa setTelefono(long telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getTdomicilio() {
        return tdomicilio;
    }

    public Empresa setTdomicilio(String tdomicilio) {
        this.tdomicilio = tdomicilio;
        return this;
    }
}
