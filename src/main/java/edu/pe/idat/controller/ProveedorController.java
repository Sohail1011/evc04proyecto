package edu.pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.model.Proveedor;
import edu.pe.idat.service.ProveedorService;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {
    
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/listProveedor")
    public String listProveedor(Model model) {
        model.addAttribute("listproveedor", proveedorService.listarProveedores());
        return "proveedor/listProveedor";
    }

    @GetMapping("/regProveedor")
    public String regProveedor(Model model) {
        model.addAttribute("regproveedores", new Proveedor());
        return "proveedor/regProveedor";
    }

    @PostMapping("/regProveedor")
    public String regProveedor(@ModelAttribute("proveedor") Proveedor objproveedor, Model model) {
        proveedorService.registrarProveedor(objproveedor);
        model.addAttribute("regproveedores", new Proveedor());
        return "proveedor/regProveedor";
    }
}
