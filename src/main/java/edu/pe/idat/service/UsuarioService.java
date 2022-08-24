package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Usuario;
import edu.pe.idat.model.sp.UsuarioSp;
import edu.pe.idat.repository.UsuarioRepository;
import edu.pe.idat.repository.sp.UsuarioSpRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioSpRepository usuarioSpRepository;

    public List<UsuarioSp> listarEmpleados() {
        return usuarioSpRepository.listarUsuarios();
    }

    @Autowired
    UsuarioRepository usuarioRepository;

    public void registrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
