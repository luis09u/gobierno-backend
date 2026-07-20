package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "proceso_cobit")
public class ProcesoCobit {

    @Id
    @Column(name = "id_proceso", length = 10)
    private String idProceso;

    private String dominio;
    private String areaPrioritaria;
    private String nombreProceso;

    @Column(columnDefinition = "TEXT")
    private String descripcionProceso;

    @Column(columnDefinition = "TEXT")
    private String propositoProceso;

    @Column(columnDefinition = "TEXT")
    private String metasAlineamiento;

    @Column(columnDefinition = "TEXT")
    private String metasEmpresariales;

    @Column(columnDefinition = "TEXT")
    private String metricasModelo;

    @OneToMany(mappedBy = "proceso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ComponenteProceso> componenteA_Procesos;

    @OneToMany(mappedBy = "proceso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<MatrizRaci> componenteB_Raci;

    @OneToMany(mappedBy = "proceso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<FlujoInformacion> componenteC_Flujos;

    @OneToMany(mappedBy = "proceso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Habilidad> componenteD_Habilidades;

    @OneToMany(mappedBy = "proceso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Politica> componenteE_Politicas;

    @OneToMany(mappedBy = "proceso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Cultura> componenteF_Cultura;

    @OneToMany(mappedBy = "proceso", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Servicio> componenteG_Servicios;

    public String getAreaPrioritaria() {
        return areaPrioritaria;
    }

    public void setAreaPrioritaria(String areaPrioritaria) {
        this.areaPrioritaria = areaPrioritaria;
    }

    public List<ComponenteProceso> getComponenteA_Procesos() {
        return componenteA_Procesos;
    }

    public void setComponenteA_Procesos(List<ComponenteProceso> componenteA_Procesos) {
        this.componenteA_Procesos = componenteA_Procesos;
    }

    public List<MatrizRaci> getComponenteB_Raci() {
        return componenteB_Raci;
    }

    public void setComponenteB_Raci(List<MatrizRaci> componenteB_Raci) {
        this.componenteB_Raci = componenteB_Raci;
    }

    public List<FlujoInformacion> getComponenteC_Flujos() {
        return componenteC_Flujos;
    }

    public void setComponenteC_Flujos(List<FlujoInformacion> componenteC_Flujos) {
        this.componenteC_Flujos = componenteC_Flujos;
    }

    public List<Habilidad> getComponenteD_Habilidades() {
        return componenteD_Habilidades;
    }

    public void setComponenteD_Habilidades(List<Habilidad> componenteD_Habilidades) {
        this.componenteD_Habilidades = componenteD_Habilidades;
    }

    public List<Politica> getComponenteE_Politicas() {
        return componenteE_Politicas;
    }

    public void setComponenteE_Politicas(List<Politica> componenteE_Politicas) {
        this.componenteE_Politicas = componenteE_Politicas;
    }

    public List<Cultura> getComponenteF_Cultura() {
        return componenteF_Cultura;
    }

    public void setComponenteF_Cultura(List<Cultura> componenteF_Cultura) {
        this.componenteF_Cultura = componenteF_Cultura;
    }

    public List<Servicio> getComponenteG_Servicios() {
        return componenteG_Servicios;
    }

    public void setComponenteG_Servicios(List<Servicio> componenteG_Servicios) {
        this.componenteG_Servicios = componenteG_Servicios;
    }

    public String getDescripcionProceso() {
        return descripcionProceso;
    }

    public void setDescripcionProceso(String descripcionProceso) {
        this.descripcionProceso = descripcionProceso;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(String idProceso) {
        this.idProceso = idProceso;
    }

    public String getMetasAlineamiento() {
        return metasAlineamiento;
    }

    public void setMetasAlineamiento(String metasAlineamiento) {
        this.metasAlineamiento = metasAlineamiento;
    }

    public String getMetasEmpresariales() {
        return metasEmpresariales;
    }

    public void setMetasEmpresariales(String metasEmpresariales) {
        this.metasEmpresariales = metasEmpresariales;
    }

    public String getMetricasModelo() {
        return metricasModelo;
    }

    public void setMetricasModelo(String metricasModelo) {
        this.metricasModelo = metricasModelo;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public String getPropositoProceso() {
        return propositoProceso;
    }

    public void setPropositoProceso(String propositoProceso) {
        this.propositoProceso = propositoProceso;
    }
}