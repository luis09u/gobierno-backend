package com.gobierno.controller;

import com.gobierno.model.FactorDiseno;
import com.gobierno.repository.FactorDisenoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cobit")
@CrossOrigin(origins = "*")
public class FactorController {

    private final FactorDisenoRepository factorRepository;

    public FactorController(FactorDisenoRepository factorRepository) {
        this.factorRepository = factorRepository;
    }

    @GetMapping("/factores")
    public List<FactorDiseno> obtenerFactores() {
        return factorRepository.findAll();
    }
}