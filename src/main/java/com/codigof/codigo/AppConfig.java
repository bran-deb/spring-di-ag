package com.codigof.codigo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.codigof.codigo.models.domain.ItemFactura;
import com.codigof.codigo.models.domain.Producto;
import com.codigof.codigo.models.service.Iservicio;
import com.codigof.codigo.models.service.MiServicioComplejo;
import com.codigof.codigo.models.service.Miservicio;
import java.util.Arrays;

//inyeccion de dependencias de servicios externos
@Configuration
public class AppConfig {

    // @Primary
    @Bean("miServicioSimple")
    Iservicio registrarMiServicio() {
        return new Miservicio();
    }

    // @Primary
    @Bean("miServicioComplejo")
    Iservicio registrarMiServicioComplejo() {
        return new MiServicioComplejo();
    }

    @Primary
    @Bean("itemsFactura")
    List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("Camara Sony", 150);
        Producto producto2 = new Producto("Bicicleta", 100);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
        // return List.of(linea1, linea2);
    };

    // @Primary
    @Bean("ItemFacturaOficina")
    List<ItemFactura> registrarItemsOficina() {

        Producto producto1 = new Producto("Monitor LG", 500);
        Producto producto2 = new Producto("NoteBook", 250);
        Producto producto3 = new Producto("Impresora", 500);
        Producto producto4 = new Producto("NoteBook Asus", 600);

        ItemFactura linea1 = new ItemFactura(producto1, 6);
        ItemFactura linea2 = new ItemFactura(producto2, 2);
        ItemFactura linea3 = new ItemFactura(producto3, 2);
        ItemFactura linea4 = new ItemFactura(producto4, 2);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}
