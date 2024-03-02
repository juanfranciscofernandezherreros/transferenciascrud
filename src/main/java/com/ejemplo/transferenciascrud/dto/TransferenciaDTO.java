package com.ejemplo.transferenciascrud.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

public class TransferenciaDTO {

    private Long id;

    @NotBlank(message = "El origen no puede estar en blanco")
    private String origen;

    @NotBlank(message = "El destino no puede estar en blanco")
    private String destino;

    @Positive(message = "El monto debe ser un número positivo")
    private double monto;

    @NotNull(message = "La fecha no puede ser nula")
    private Date fecha;

    private boolean procesada;

    // Constructors, getters, and setters

    public TransferenciaDTO() {
        // Default constructor
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isProcesada() {
        return procesada;
    }

    public void setProcesada(boolean procesada) {
        this.procesada = procesada;
    }
}

