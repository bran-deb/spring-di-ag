package com.codigof.codigo.models.domain;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @ApplicationScope // Es el default
// @SessionScope //Se destruye cuando se cierra el navegador, timeout o logout
@Component("FacturaBean")
@RequestScope // Crea una instancia por cada http request y luego se destruye
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    private List<ItemFactura> items;

    @PostConstruct // Se ejecuta cuando se crea la instancia
    public void inicializar() {
        cliente.setNombre(cliente.getNombre().concat(" Pedral"));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy // Se ejecuta cuando se destruye la instancia
    public void destruir() {
        System.out.println("Factura destruida".concat(descripcion));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }
}
