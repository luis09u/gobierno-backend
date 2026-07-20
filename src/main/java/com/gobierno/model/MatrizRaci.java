package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "matriz_raci")
public class MatrizRaci {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRaci;

    @ManyToOne
    @JoinColumn(name = "id_proceso")
    @JsonBackReference
    private ProcesoCobit proceso;

    @Column(columnDefinition = "TEXT")
    private String practicaGestion;

    @Column(columnDefinition = "TEXT")
    private String rolOrganizacional;

    @Column(length = 1)
    private String nivelResponsabilidad;

    public Long getIdRaci() {
        return idRaci;
    }

    public void setIdRaci(Long idRaci) {
        this.idRaci = idRaci;
    }

    public String getNivelResponsabilidad() {
        return nivelResponsabilidad;
    }

    public void setNivelResponsabilidad(String nivelResponsabilidad) {
        this.nivelResponsabilidad = nivelResponsabilidad;
    }

    public String getPracticaGestion() {
        return practicaGestion;
    }

    public void setPracticaGestion(String practicaGestion) {
        this.practicaGestion = practicaGestion;
    }

    public ProcesoCobit getProceso() {
        return proceso;
    }

    public void setProceso(ProcesoCobit proceso) {
        this.proceso = proceso;
    }

    public String getRolOrganizacional() {
        return rolOrganizacional;
    }

    public void setRolOrganizacional(String rolOrganizacional) {
        this.rolOrganizacional = rolOrganizacional;
    }
}