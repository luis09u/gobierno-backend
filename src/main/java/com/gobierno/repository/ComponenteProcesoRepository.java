package com.gobierno.repository;

import com.gobierno.model.ComponenteProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponenteProcesoRepository extends JpaRepository<ComponenteProceso, Long> {
}