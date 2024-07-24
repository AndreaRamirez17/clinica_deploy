package com.clinica.repository;

import com.clinica.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface citaRepository extends JpaRepository<Cita,Long> {
}
