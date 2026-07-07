package com.gobierno.repository;

import com.gobierno.model.ProcesoCobit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcesoCobitRepository extends JpaRepository<ProcesoCobit, String> {
    // Te permite buscar todos los procesos de un dominio (Ej: Todos los "EDM")
    List<ProcesoCobit> findByDominio(String dominio);
}