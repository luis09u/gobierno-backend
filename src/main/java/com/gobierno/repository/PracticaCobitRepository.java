package com.gobierno.repository;

import com.gobierno.model.PracticaCobit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticaCobitRepository extends JpaRepository<PracticaCobit, String> {
}