package edu.pe.idat.repository.sp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.sp.ClienteSp;

@Repository
public interface ClienteSpRepository extends JpaRepository<ClienteSp, Integer> {
    
    @Query(value = "{call sp_MantListarCliente()}",
        nativeQuery = true)
    public List<ClienteSp> listarClientes();
}
