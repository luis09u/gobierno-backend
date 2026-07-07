package com.gobierno.repository;

import com.gobierno.model.FactorDiseno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactorDisenoRepository extends JpaRepository<FactorDiseno, String> {
}