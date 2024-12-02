package com.example.demo.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "producto_factura") // Asegúrate de que el nombre de la tabla sea correcto
public class ProductoFactura implements Serializable {

    @EmbeddedId
    private ProductoFacturaPK Id;



    @Column(name = "val_unitario")
    private Float valUnitario;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="cod_factura", insertable = false, updatable = false)
    @JoinColumn(name="cod_producto", insertable = false, updatable = false)



    // Getters and Setters


    public ProductoFacturaPK getId() {
        return Id;
    }

    public void setId(ProductoFacturaPK id) {
        Id = id;
    }

    public Float getValUnitario() {
        return valUnitario;
    }

    public void setValUnitario(Float valUnitario) {
        this.valUnitario = valUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}

