package com.codigof.codigo.models.service;

// import org.springframework.stereotype.Component;

// @Primary //indica que este servicio es el primero que se ejecuta
// @Service
// @Component("miServicioSimple")
public class Miservicio implements Iservicio {

    @Override
    public String operacion() {
        return "Ejecutando un proceso importante...";
    }
}
