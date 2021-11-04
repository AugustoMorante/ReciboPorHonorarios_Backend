package com.finanzas.recibohonorarios.domain.model;

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
}
