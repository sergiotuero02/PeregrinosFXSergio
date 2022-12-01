package com.example.PeregrinosFX.bean;


import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "Peregrino")
public class Peregrino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPeregrino", updatable = false, nullable = false)
    private long idPeregrino;

    private String nombre;

    private String nacionalidad;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCarnet")
    private Carnet carnet;

    @OneToMany(mappedBy = "peregrino")
    private ArrayList<Estancia> estancias;

    @ManyToMany
    @JoinTable(name = "peregrino_parada")
    private ArrayList<Parada> paradas;

    public Peregrino() {

    }

    public long getIdPeregrino() {
        return idPeregrino;
    }

    public void setIdPeregrino(long idPeregrino) {
        this.idPeregrino = idPeregrino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(Carnet carnet) {
        this.carnet = carnet;
    }

    public ArrayList<Estancia> getEstancias() {
        return estancias;
    }

    public void setEstancias(ArrayList<Estancia> estancias) {
        this.estancias = estancias;
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Parada> paradas) {
        this.paradas = paradas;
    }

    @Override
    public String toString() {
        return "Peregrino{" +
                "idPeregrino=" + idPeregrino +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", carnet=" + carnet +
                ", estancias=" + estancias +
                ", paradas=" + paradas +
                '}';
    }
}
