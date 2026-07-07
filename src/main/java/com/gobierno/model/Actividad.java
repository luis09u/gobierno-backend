package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "actividad")
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActividad;

    @ManyToOne
    @JoinColumn(name = "id_practica")
    @JsonBackReference // <-- CORTA EL BUCLE FINAL
    private PracticaCobit practica;

    @Column(columnDefinition = "TEXT")
    private String descripcionActividad;

    private int nivelCapacidadEsperado;

    @Column(length = 1, columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private String calificacionActual;

    // Genera o pega tus Getters y Setters aquí...
    public Long getIdActividad() { return idActividad; }
    public void setIdActividad(Long idActividad) { this.idActividad = idActividad; }
    public PracticaCobit getPractica() { return practica; }
    public void setPractica(PracticaCobit practica) { this.practica = practica; }
    public String getDescripcionActividad() { return descripcionActividad; }
    public void setDescripcionActividad(String descripcionActividad) { this.descripcionActividad = descripcionActividad; }
    public int getNivelCapacidadEsperado() { return nivelCapacidadEsperado; }
    public void setNivelCapacidadEsperado(int nivelCapacidadEsperado) { this.nivelCapacidadEsperado = nivelCapacidadEsperado; }
    public String getCalificacionActual() { return calificacionActual; }
    public void setCalificacionActual(String calificacionActual) { this.calificacionActual = calificacionActual; }
}