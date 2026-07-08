package com.gobierno.controller;

import com.gobierno.model.Actividad;
import com.gobierno.model.ProcesoCobit;
import com.gobierno.repository.ActividadRepository;
import com.gobierno.repository.ProcesoCobitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cobit")
@CrossOrigin(origins = "*")
public class CobitController {

    @Autowired
    private ProcesoCobitRepository procesoRepository;

    @Autowired
    private ActividadRepository actividadRepository;

    @GetMapping("/procesos/{idProceso}")
    public ResponseEntity<ProcesoCobit> obtenerDetalleProceso(@PathVariable String idProceso) {
        Optional<ProcesoCobit> proceso = procesoRepository.findById(idProceso.toUpperCase());

        if (proceso.isPresent()) {
            return ResponseEntity.ok(proceso.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/actividades/{idActividad}/calificar")
    public ResponseEntity<?> calificarActividad(@PathVariable Long idActividad, @RequestParam String valor) {
        Actividad actividad = actividadRepository.findById(idActividad)
                .orElseThrow(() -> new RuntimeException("Actividad no encontrada"));
        actividad.setCalificacionActual(valor);
        actividadRepository.save(actividad);
        return ResponseEntity.ok().body("{\"mensaje\": \"Calificación guardada exitosamente\"}");
    }

    @PostMapping("/procesos/{idProceso}/limpiar")
    public ResponseEntity<?> limpiarAuditoriaProceso(@PathVariable String idProceso) {
        ProcesoCobit proceso = procesoRepository.findById(idProceso)
                .orElseThrow(() -> new RuntimeException("Proceso no encontrado"));

        proceso.getComponenteA_Procesos().forEach(comp ->
                comp.getPracticas().forEach(pract ->
                        pract.getActividades().forEach(act -> act.setCalificacionActual("N"))
                )
        );
        procesoRepository.save(proceso);
        return ResponseEntity.ok().body("{\"mensaje\": \"Proceso reiniciado a 0\"}");
    }

    @PostMapping("/procesos/limpiar-todo")
    public ResponseEntity<?> limpiarAuditoriaGlobal() {
        List<ProcesoCobit> procesos = procesoRepository.findAll();
        for (ProcesoCobit proceso : procesos) {
            proceso.getComponenteA_Procesos().forEach(comp ->
                    comp.getPracticas().forEach(pract ->
                            pract.getActividades().forEach(act -> act.setCalificacionActual("N"))
                    )
            );
        }
        procesoRepository.saveAll(procesos);
        return ResponseEntity.ok().body("{\"mensaje\": \"Auditoría global reiniciada\"}");
    }
}