package com.codigof.codigo.models.service;

// import org.springframework.stereotype.Component;

// @Primary
// @Service
// @Component("miServicioComplejo")
public class MiServicioComplejo implements Iservicio {

    public MiServicioComplejo() {
    }

    @Override
    public String operacion() {
        return "Ejecutando un proceso importante complicado...";
    }
}
