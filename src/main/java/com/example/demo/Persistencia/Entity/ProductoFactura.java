package com.example.demo.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "producto_factura") // Asegúrate de que el nombre de la tabla sea correcto
public class ProductoFactura implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "cod_factura", referencedColumnName = "cod_factura")
    private FacturaCliente facturaCliente;

    @Id
    @ManyToOne
    @JoinColumn(name = "cod_producto", referencedColumnName = "cod_producto")
    private Producto producto;

    @Column(name = "val_unitario")
    private Float valUnitario;

    @Column(name = "cantidad")
    private Integer cantidad;


    @ManyToOne
    @JoinColumn(name="cod_producto", updatable = false, insertable = false)

    // Getters and Setters

    public FacturaCliente getFacturaCliente() {
        return facturaCliente;
    }

    public void setFacturaCliente(FacturaCliente facturaCliente) {
        this.facturaCliente = facturaCliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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

