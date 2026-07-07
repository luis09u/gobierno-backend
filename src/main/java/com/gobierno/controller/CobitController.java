package com.gobierno.controller;

import com.gobierno.model.ProcesoCobit;
import com.gobierno.repository.ProcesoCobitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cobit")
@CrossOrigin(origins = "*")
public class CobitController {

    @Autowired
    private ProcesoCobitRepository procesoRepository;


    @GetMapping("/procesos/{idProceso}")
    public ResponseEntity<ProcesoCobit> obtenerDetalleProceso(@PathVariable String idProceso) {
        Optional<ProcesoCobit> proceso = procesoRepository.findById(idProceso.toUpperCase());

        if (proceso.isPresent()) {
            return ResponseEntity.ok(proceso.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}