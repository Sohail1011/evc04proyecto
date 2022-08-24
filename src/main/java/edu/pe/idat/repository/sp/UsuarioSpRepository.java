package edu.pe.idat.repository.sp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.sp.UsuarioSp;

@Repository
public interface UsuarioSpRepository extends JpaRepository<UsuarioSp, String> {
    
    @Query(value = "{call sp_MantListarUsuario()}",
        nativeQuery = true)
    public List<UsuarioSp> listarUsuarios();
}
