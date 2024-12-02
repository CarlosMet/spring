package com.example.demo.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "factura_compra")
public class FacturaCompra implements Serializable {

    @Id
    @Column(name = "cod_factura")
    private String codFactura;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "ident_cliente")
    private String identCliente;

    @Column(name = "ident_vendedor")
    private String identVendedor;

    @Column(name = "activo")
    private Boolean activo;

    @ManyToOne
    @JoinColumn(name="ident_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @JoinColumn(name="ident_vendedor", insertable = false, updatable = false)
    private Vendedor vendedor;

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdentCliente() {
        return identCliente;
    }

    public void setIdentCliente(String identCliente) {
        this.identCliente = identCliente;
    }

    public String getIdentVendedor() {
        return identVendedor;
    }

    public void setIdentVendedor(String identVendedor) {
        this.identVendedor = identVendedor;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
