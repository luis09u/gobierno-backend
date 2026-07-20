package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "cultura")
public class Cultura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCultura;

    @ManyToOne
    @JoinColumn(name = "id_proceso")
    @JsonBackReference
    private ProcesoCobit proceso;

    @Column(columnDefinition = "TEXT")
    private String elementoCultural;

    @Column(columnDefinition = "TEXT") // <-- Faltaba esto
    private String documentacionRelacionada;

    @Column(columnDefinition = "TEXT") // <-- Faltaba esto, este era el causante del error
    private String referenciaEspecifica;


    public String getDocumentacionRelacionada() {
        return documentacionRelacionada;
    }

    public void setDocumentacionRelacionada(String documentacionRelacionada) {
        this.documentacionRelacionada = documentacionRelacionada;
    }

    public String getElementoCultural() {
        return elementoCultural;
    }

    public void setElementoCultural(String elementoCultural) {
        this.elementoCultural = elementoCultural;
    }

    public Long getIdCultura() {
        return idCultura;
    }

    public void setIdCultura(Long idCultura) {
        this.idCultura = idCultura;
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