package com.finanzas.recibohonorarios.domain.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "plazos")
public class Plazo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ccodigo;
    private int numdiasporanho;
    private int tplazotasa;
    private int numtasaefectiva;
    private Date ddescuento;

    public Plazo() {
    }

    public Plazo(long ccodigo, int numdiasporanho, int tplazotasa, int numtasaefectiva, Date ddescuento) {
        this.ccodigo = ccodigo;
        this.numdiasporanho = numdiasporanho;
        this.tplazotasa = tplazotasa;
        this.numtasaefectiva = numtasaefectiva;
        this.ddescuento = ddescuento;
    }

    public long getCcodigo() {
        return ccodigo;
    }

    public Plazo setCcodigo(long ccodigo) {
        this.ccodigo = ccodigo;
        return this;
    }

    public int getNumdiasporanho() {
        return numdiasporanho;
    }

    public Plazo setNumdiasporanho(int numdiasporanho) {
        this.numdiasporanho = numdiasporanho;
        return this;
    }

    public int getTplazotasa() {
        return tplazotasa;
    }

    public Plazo setTplazotasa(int tplazotasa) {
        this.tplazotasa = tplazotasa;
        return this;
    }

    public int getNumtasaefectiva() {
        return numtasaefectiva;
    }

    public Plazo setNumtasaefectiva(int numtasaefectiva) {
        this.numtasaefectiva = numtasaefectiva;
        return this;
    }

    public Date getDdescuento() {
        return ddescuento;
    }

    public Plazo setDdescuento(Date ddescuento) {
        this.ddescuento = ddescuento;
        return this;
    }
}
