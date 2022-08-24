package edu.pe.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.pe.idat.model.login.LoginForm;
import edu.pe.idat.model.login.LoginModel;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String iniciarSesion(Model model){
        model.addAttribute("loginform", new LoginModel());
        return "login";
    }

    @PostMapping("/login")
    public String autenticacion(@ModelAttribute("loginform") LoginForm login, Model model) {
        if (login.getUsuario().equals("admin") && login.getPassword().equals("admin")) {
            return "layout";
        } else {
            return "login";
        }
    }
}
