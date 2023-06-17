package com.codigof.codigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.codigof.codigo.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/ver")
    public String listar(Model model) {
        model.addAttribute("titulo", "Ejemplo de factura");
        model.addAttribute("factura", factura);
        return "factura/ver";
    }
    // @GetMapping(value="path")
    // public SomeData getMethodName(@RequestParam String param) {
    // return new SomeData();
    // }

}
