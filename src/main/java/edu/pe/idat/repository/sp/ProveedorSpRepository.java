package edu.pe.idat.repository.sp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.sp.ProveedorSp;

@Repository
public interface ProveedorSpRepository extends JpaRepository<ProveedorSp, Integer> {
    
    @Query(value = "{call sp_MantListarProveedor()}",
        nativeQuery = true)
    public List<ProveedorSp> listarProveedores();
}
