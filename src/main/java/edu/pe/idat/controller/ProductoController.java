package edu.pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.model.Producto;
import edu.pe.idat.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;

    @GetMapping("/listProducto")
    public String listProducto(Model model) {
        model.addAttribute("listproductos", productoService.listarProductos());
        return "producto/listProducto";
    }

    @GetMapping("/regProducto")
    public String regProducto(Model model) {
        model.addAttribute("regproductos", new Producto());
        return "producto/regProducto";
    }

    @PostMapping("/regProducto")
    public String regProducto(@ModelAttribute("producto") Producto objproducto, Model model) {
        productoService.registrarProducto(objproducto);
        model.addAttribute("regproductos", new Producto());
        return "producto/regProducto";
    }
}
