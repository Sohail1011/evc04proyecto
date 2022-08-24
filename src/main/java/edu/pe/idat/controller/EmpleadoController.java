package edu.pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.model.Empleado;
import edu.pe.idat.service.EmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/listEmpleado")
    public String listEmpleado(Model model) {
        model.addAttribute("listempleados", empleadoService.listarEmpleados());
        return "empleado/listEmpleado";
    }

    @GetMapping("/regEmpleado")
    public String regEmpleado(Model model) {
        model.addAttribute("empleados", new Empleado());
        return "empleado/regEmpleado";
    }

    @PostMapping("/regEmpleado")
    public String regEmpleado(@ModelAttribute("empleado") Empleado objempleado, Model model) {
        empleadoService.registrarEmpleado(objempleado);
        model.addAttribute("empleados", new Empleado());
        return "empleado/regEmpleado";
    }
}
