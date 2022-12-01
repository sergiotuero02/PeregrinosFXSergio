package com.example.PeregrinosFX.bean;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Carnet")
public class Carnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCarnet", updatable = false, nullable = false)

    private long idCarnet;

    private LocalDate fechaExpedicion;

    private double distancia = 0.0;

    private int numVips = 0;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idParada")
    private Parada Paradainicial;

    public Carnet() {

    }

    public long getIdCarnet() {
        return idCarnet;
    }

    public void setIdCarnet(long idCarnet) {
        this.idCarnet = idCarnet;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getNumVips() {
        return numVips;
    }

    public void setNumVips(int numVips) {
        this.numVips = numVips;
    }

    public Parada getParadainicial() {
        return Paradainicial;
    }

    public void setParadainicial(Parada paradainicial) {
        Paradainicial = paradainicial;
    }

    @Override
    public String toString() {
        return "Carnet{" +
                "idCarnet=" + idCarnet +
                ", fechaExpedicion=" + fechaExpedicion +
                ", distancia=" + distancia +
                ", numVips=" + numVips +
                ", Paradainicial=" + Paradainicial +
                '}';
    }
}
