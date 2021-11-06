package com.finanzas.recibohonorarios.domain.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recibos")
public class Recibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long c_codigo;
    private Date fechaemision;
    private int montototal;
    private String tconcepto;
    private boolean retencion;

    public Recibo() {
    }

    public Recibo(long c_codigo, Date fechaemision, int montototal, String tconcepto, boolean retencion) {
        this.c_codigo = c_codigo;
        this.fechaemision = fechaemision;
        this.montototal = montototal;
        this.tconcepto = tconcepto;
        this.retencion = retencion;
    }

    @Id
    @ManyToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "c_dni", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Emisor emisor;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "c_ruc", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Empresa empresa;

    @OneToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tasa_ccodigo", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Tasa tasa;

    @OneToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "plazo_ccodigo", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Plazo plazo;

    public long getC_codigo() {
        return c_codigo;
    }

    public Recibo setC_codigo(long c_codigo) {
        this.c_codigo = c_codigo;
        return this;
    }

    public Date getFechaemision() {
        return fechaemision;
    }

    public Recibo setFechaemision(Date fechaemision) {
        this.fechaemision = fechaemision;
        return this;
    }

    public int getMontototal() {
        return montototal;
    }

    public Recibo setMontototal(int montototal) {
        this.montototal = montototal;
        return this;
    }

    public String getTconcepto() {
        return tconcepto;
    }

    public Recibo setTconcepto(String tconcepto) {
        this.tconcepto = tconcepto;
        return this;
    }

    public boolean isRetencion() {
        return retencion;
    }

    public Recibo setRetencion(boolean retencion) {
        this.retencion = retencion;
        return this;
    }
}
