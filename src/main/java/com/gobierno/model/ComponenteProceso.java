package com.gobierno.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "componente_proceso")
public class ComponenteProceso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompProceso;

    @ManyToOne
    @JoinColumn(name = "id_proceso")
    @JsonBackReference //
    private ProcesoCobit proceso;

    @Column(length = 1)
    private String tipoComponente;

    @Column(columnDefinition = "TEXT")
    private String nombreComponente;

    @Column(columnDefinition = "TEXT")
    private String descripcionComponente;

    @Column(columnDefinition = "TEXT")
    private String documentacionBase;

    @OneToMany(mappedBy = "componente", cascade = CascadeType.ALL)
    @JsonManagedReference // <-- CONTROLA EL BUCLE HACIA ABAJO
    private List<PracticaCobit> practicas;

    // Genera o pega tus Getters y Setters aquí...
    public Long getIdCompProceso() { return idCompProceso; }
    public void setIdCompProceso(Long idCompProceso) { this.idCompProceso = idCompProceso; }
    public ProcesoCobit getProceso() { return proceso; }
    public void setProceso(ProcesoCobit proceso) { this.proceso = proceso; }
    public String getTipoComponente() { return tipoComponente; }
    public void setTipoComponente(String tipoComponente) { this.tipoComponente = tipoComponente; }
    public String getNombreComponente() { return nombreComponente; }
    public void setNombreComponente(String nombreComponente) { this.nombreComponente = nombreComponente; }
    public String getDescripcionComponente() { return descripcionComponente; }
    public void setDescripcionComponente(String descripcionComponente) { this.descripcionComponente = descripcionComponente; }
    public String getDocumentacionBase() { return documentacionBase; }
    public void setDocumentacionBase(String documentacionBase) { this.documentacionBase = documentacionBase; }
    public List<PracticaCobit> getPracticas() { return practicas; }
    public void setPracticas(List<PracticaCobit> practicas) { this.practicas = practicas; }
}