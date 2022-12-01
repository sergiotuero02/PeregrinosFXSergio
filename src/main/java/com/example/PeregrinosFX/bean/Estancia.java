package com.example.PeregrinosFX.bean;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Estancia")
public class Estancia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstancia", updatable = false, nullable = false)
    private long idEstancia;
    private LocalDate fecha;
    private boolean vip = false;

    @ManyToOne()
    @JoinColumn(name = "idPeregrino")
    private Peregrino peregrino;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idParada")
    private Parada parada;

    public Estancia() {
    }


    public Peregrino getPeregrino() {
        return peregrino;
    }

    public void setPeregrino(Peregrino peregrino) {
        this.peregrino = peregrino;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    public long getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(long idEstancia) {
        this.idEstancia = idEstancia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Estancia{" +
                "idEstancia=" + idEstancia +
                ", fecha=" + fecha +
                ", vip=" + vip +
                ", idPeregrino=" + peregrino +
                ", parada=" + parada +
                '}';
    }


}
