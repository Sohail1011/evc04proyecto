package edu.pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.model.Usuario;
import edu.pe.idat.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listUsuario")
    public String listUsuario(Model model) {
        model.addAttribute("listusuarios", usuarioService.listarEmpleados());
        return "usuario/listUsuario";
    }

    @GetMapping("/regUsuario")
    public String regUsuario(Model model) {
        model.addAttribute("regusuarios", new Usuario());
        return "usuario/regUsuario";
    }

    @PostMapping("/regUsuario")
    public String regUsuario(@ModelAttribute("usuario") Usuario objusuario, Model model) {
        usuarioService.registrarUsuario(objusuario);
        model.addAttribute("regusuarios", new Usuario());
        return "usuario/regUsuario";
    }
}
