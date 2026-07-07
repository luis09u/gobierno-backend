package com.gobierno.model;

import jakarta.persistence.*;

@Entity
@Table(name = "factor_diseno")
public class FactorDiseno {

    @Id
    @Column(length = 5)
    private String idFactor;

    private String nombreFactor;

    @Column(columnDefinition = "TEXT")
    private String descripcionGeneral;

    private String dimensionSeleccionada;

    @Column(columnDefinition = "TEXT")
    private String impactoProyectoOTA;

    // Getters y Setters
    public String getIdFactor() { return idFactor; }
    public void setIdFactor(String idFactor) { this.idFactor = idFactor; }
    public String getNombreFactor() { return nombreFactor; }
    public void setNombreFactor(String nombreFactor) { this.nombreFactor = nombreFactor; }
    public String getDescripcionGeneral() { return descripcionGeneral; }
    public void setDescripcionGeneral(String descripcionGeneral) { this.descripcionGeneral = descripcionGeneral; }
    public String getDimensionSeleccionada() { return dimensionSeleccionada; }
    public void setDimensionSeleccionada(String dimensionSeleccionada) { this.dimensionSeleccionada = dimensionSeleccionada; }
    public String getImpactoProyectoOTA() { return impactoProyectoOTA; }
    public void setImpactoProyectoOTA(String impactoProyectoOTA) { this.impactoProyectoOTA = impactoProyectoOTA; }
}