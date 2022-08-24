package edu.pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.model.Cliente;
import edu.pe.idat.service.ClienteService;


@Controller
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listCliente")
    public String listCliente(Model model) {
        model.addAttribute("listclientes", clienteService.listarClientes());
        return "cliente/listCliente";
    }

    @GetMapping("/regCliente")
    public String regCliente(Model model) {
        model.addAttribute("regclientes", new Cliente());
        return "cliente/regCliente";
    }

    @PostMapping("/regCliente")
    public String regCliente(@ModelAttribute("cliente") Cliente objcliente, Model model) {
        clienteService.registrarCliente(objcliente);
        model.addAttribute("regclientes", new Cliente());
        return "cliente/regCliente";
    }
}
