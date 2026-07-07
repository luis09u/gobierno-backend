package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "flujo_informacion")
public class FlujoInformacion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFlujo;

    @ManyToOne
    @JoinColumn(name = "id_proceso")
    @JsonBackReference
    private ProcesoCobit proceso;

    private String practicaGestion; // Ej: "EDM01.01"
    private String tipoFlujo; // "ENTRADA" o "SALIDA"

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    private String origenDestino; // "DE: [Práctica]" o "A: [Práctica/Interna]"

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdFlujo() {
        return idFlujo;
    }

    public void setIdFlujo(Long idFlujo) {
        this.idFlujo = idFlujo;
    }

    public String getOrigenDestino() {
        return origenDestino;
    }

    public void setOrigenDestino(String origenDestino) {
        this.origenDestino = origenDestino;
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

    public String getTipoFlujo() {
        return tipoFlujo;
    }

    public void setTipoFlujo(String tipoFlujo) {
        this.tipoFlujo = tipoFlujo;
    }
}