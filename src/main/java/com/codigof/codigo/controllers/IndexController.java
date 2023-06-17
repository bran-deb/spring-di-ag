package com.codigof.codigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codigof.codigo.models.service.Iservicio;

@Controller
public class IndexController {
    // private Miservicio servicio = new Miservicio();
    @Autowired
    @Qualifier("miServicioComplejo") // inyecta el servicio especifico por su nombre
    private Iservicio servicio;

    // @Autowired
    // public IndexController(Iservicio servicio) {
    // this.servicio = servicio;
    // }

    @GetMapping({ "", "/", "index" })
    public String index(Model model) {
        model.addAttribute("titulo", "hola desde thymeleaf");
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

    // @Autowired
    // public void setServicio(Iservicio servicio) {
    // this.servicio = servicio;
    // }

}
