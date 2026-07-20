package com.gobierno.model;

import jakarta.persistence.Column;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "habilidad")
public class Habilidad {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabilidad;

    @ManyToOne
    @JoinColumn(name = "id_proceso")
    @JsonBackReference
    private ProcesoCobit proceso;

    @Column(columnDefinition = "TEXT")
    private String nombreHabilidad;

    @Column(columnDefinition = "TEXT")
    private String documentacionRelacionada;

    @Column(columnDefinition = "TEXT")
    private String referenciaEspecifica;

    public String getDocumentacionRelacionada() {
        return documentacionRelacionada;
    }

    public void setDocumentacionRelacionada(String documentacionRelacionada) {
        this.documentacionRelacionada = documentacionRelacionada;
    }

    public Long getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(Long idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public ProcesoCobit getProceso() {
        return proceso;
    }

    public void setProceso(ProcesoCobit proceso) {
        this.proceso = proceso;
    }

    public String getReferenciaEspecifica() {
        return referenciaEspecifica;
    }

    public void setReferenciaEspecifica(String referenciaEspecifica) {
        this.referenciaEspecifica = referenciaEspecifica;
    }
}