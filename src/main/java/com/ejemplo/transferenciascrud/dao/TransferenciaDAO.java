package com.ejemplo.transferenciascrud.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transferencias")
public class TransferenciaDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "origen")
    private String origen;

    @Column(name = "destino")
    private String destino;

    @Column(name = "monto")
    private double monto;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "procesada")
    private boolean procesada;

}

