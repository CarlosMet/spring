package com.example.demo.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    @Column(name = "cod_producto")
    private String codProducto;

    @Column(name = "nom_producto")
    private String NomProducto;

    @Column(name = "existencias")
    private Integer existencias;

    @Column(name = "valor_actual")
    private Float valorActual;

    @Column(name = "activo")
    private Boolean activo;

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getOmProducto() {
        return NomProducto;
    }

    public void setOmProducto(String omProducto) {
        this.NomProducto = omProducto;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }

    public Float getValorActual() {
        return valorActual;
    }

    public void setValorActual(Float valorActual) {
        this.valorActual = valorActual;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}

