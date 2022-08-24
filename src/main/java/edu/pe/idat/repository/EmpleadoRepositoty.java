package edu.pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.Empleado;

@Repository
public interface EmpleadoRepositoty extends JpaRepository<Empleado, Integer> {
    
}
