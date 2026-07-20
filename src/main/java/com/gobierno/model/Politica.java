package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "politica")
public class Politica {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPolitica;

    @ManyToOne
    @JoinColumn(name = "id_proceso")
    @JsonBackReference
    private ProcesoCobit proceso;

    private String tituloPolitica;

    @Column(columnDefinition = "TEXT")
    private String descripcionPolitica;

    @Column(columnDefinition = "TEXT")
    private String documentacionRelacionada;

    @Column(columnDefinition = "TEXT")
    private String referenciaEspecifica;

    public String getDescripcionPolitica() {
        return descripcionPolitica;
    }

    public void setDescripcionPolitica(String descripcionPolitica) {
        this.descripcionPolitica = descripcionPolitica;
    }

    public String getDocumentacionRelacionada() {
        return documentacionRelacionada;
    }

    public void setDocumentacionRelacionada(String documentacionRelacionada) {
        this.documentacionRelacionada = documentacionRelacionada;
    }

    public Long getIdPolitica() {
        return idPolitica;
    }

    public void setIdPolitica(Long idPolitica) {
        this.idPolitica = idPolitica;
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

    public String getTituloPolitica() {
        return tituloPolitica;
    }

    public void setTituloPolitica(String tituloPolitica) {
        this.tituloPolitica = tituloPolitica;
    }

    // Getters y Setters...
}