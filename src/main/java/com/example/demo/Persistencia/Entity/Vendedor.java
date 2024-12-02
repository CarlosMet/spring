package com.example.demo.Persistencia.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable {

    @Id
    @Column(name = "ident_vendedor")
    private String identVendedor;

    @Column(name = "nom_vendedor")
    private String nomVendedor;

    @Column(name = "tel_vendedor")
    private Float TelVendedor;

    @Column(name = "activo")
    private Boolean Activo;


    public String getIdentVendedor() {
        return identVendedor;
    }

    public void setIdentVendedor(String identVendedor) {
        this.identVendedor = identVendedor;
    }

    public String getNomVendedor() {
        return nomVendedor;
    }

    public void setNomVendedor(String nomVendedor) {
        this.nomVendedor = nomVendedor;
    }

    public Float getTelVendedor() {
        return TelVendedor;
    }

    public void setTelVendedor(Float telVendedor) {
        TelVendedor = telVendedor;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean activo) {
        Activo = activo;
    }
}

