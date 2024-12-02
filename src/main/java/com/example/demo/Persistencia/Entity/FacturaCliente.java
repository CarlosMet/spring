package com.example.demo.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="factura_compra")
public class FacturaCliente implements Serializable {
    @Id
    @Column(name="cod_factura")
    private String CodFctura;

    @Column(name="fecha")
    private LocalDateTime fecha;

    @Column(name="ident_cliente")
    private String IdentCliente;

    @Column(name="ident_vendedor")
    private String IdentVendedor;

    @Column(name="activo")
    private Boolean Activo;

    @ManyToOne
    @JoinColumn(name="ident_cliente", insertable = false, updatable = false)
    private Cliente cliente;
    private List<FacturaCliente> facturaClientes;

    public String getCodFctura() {
        return CodFctura;
    }

    public void setCodFctura(String codFctura) {
        CodFctura = codFctura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getIdentCliente() {
        return IdentCliente;
    }

    public void setIdentCliente(String identCliente) {
        IdentCliente = identCliente;
    }

    public String getIdentVendedor() {
        return IdentVendedor;
    }

    public void setIdentVendedor(String identVendedor) {
        IdentVendedor = identVendedor;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean activo) {
        Activo = activo;
    }
}
