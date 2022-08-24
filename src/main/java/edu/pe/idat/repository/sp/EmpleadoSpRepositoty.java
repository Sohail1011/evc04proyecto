package edu.pe.idat.repository.sp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.sp.EmpleadoSp;

@Repository
public interface EmpleadoSpRepositoty extends JpaRepository<EmpleadoSp, Integer> {
    
    @Query(value = "{call sp_MantListarEmpleado()}",
        nativeQuery = true)
    public List<EmpleadoSp> listarEmpleados();
}
