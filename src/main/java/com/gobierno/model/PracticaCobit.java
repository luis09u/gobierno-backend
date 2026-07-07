package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "practica_cobit")
public class PracticaCobit {

    @Id
    @Column(name = "id_practica", length = 15)
    private String idPractica;

    @ManyToOne
    @JoinColumn(name = "id_comp_proceso")
    @JsonBackReference // <-- CORTA EL BUCLE
    private ComponenteProceso componente;

    private String nombrePractica;

    @Column(columnDefinition = "TEXT")
    private String descripcionPractica;

    @OneToMany(mappedBy = "practica", cascade = CascadeType.ALL)
    @JsonManagedReference // <-- CONTROLA EL BUCLE HACIA ABAJO
    private List<Actividad> actividades;

    // Genera o pega tus Getters y Setters aquí...
    public String getIdPractica() { return idPractica; }
    public void setIdPractica(String idPractica) { this.idPractica = idPractica; }
    public ComponenteProceso getComponente() { return componente; }
    public void setComponente(ComponenteProceso componente) { this.componente = componente; }
    public String getNombrePractica() { return nombrePractica; }
    public void setNombrePractica(String nombrePractica) { this.nombrePractica = nombrePractica; }
    public String getDescripcionPractica() { return descripcionPractica; }
    public void setDescripcionPractica(String descripcionPractica) { this.descripcionPractica = descripcionPractica; }
    public List<Actividad> getActividades() { return actividades; }
    public void setActividades(List<Actividad> actividades) { this.actividades = actividades; }
}