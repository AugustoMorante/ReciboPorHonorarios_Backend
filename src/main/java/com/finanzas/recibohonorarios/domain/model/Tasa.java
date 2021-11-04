package com.finanzas.recibohonorarios.domain.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tasas")
public class Tasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ccodigo;
    private int numbtasa;
    private Date ddescuento;

    public Tasa() {
    }

    public Tasa(long ccodigo, int numbtasa, Date ddescuento) {
        this.ccodigo = ccodigo;
        this.numbtasa = numbtasa;
        this.ddescuento = ddescuento;
    }

    public long getCcodigo() {
        return ccodigo;
    }

    public Tasa setCcodigo(long ccodigo) {
        this.ccodigo = ccodigo;
        return this;
    }

    public int getNumbtasa() {
        return numbtasa;
    }

    public Tasa setNumbtasa(int numbtasa) {
        this.numbtasa = numbtasa;
        return this;
    }

    public Date getDdescuento() {
        return ddescuento;
    }

    public Tasa setDdescuento(Date ddescuento) {
        this.ddescuento = ddescuento;
        return this;
    }
}
