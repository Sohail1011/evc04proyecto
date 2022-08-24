package edu.pe.idat.repository.sp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.sp.ProductoSp;

@Repository
public interface ProductoSpRepository extends JpaRepository<ProductoSp, Integer> {
    
    @Query(value = "{call sp_MantListarProducto()}",
    nativeQuery = true)
    public List<ProductoSp> listarProductos();
}
