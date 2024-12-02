package com.example.demo.Persistencia.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    @Id()
    @Column(name="ident_cliente")
    private String IdentCliente;

    @Column(name="nom_cliente")
    private String NombreCliente;

    @Column(name="dir_cliente")
    private String DirCliente;

    @Column(name="tel_cliente")
    private String TelCliente;

    @Column(name="activo")
    private Boolean Activo;

    @OneToMany(mappedBy = "cliente")
    private List<FacturaCliente> facturaClientes;


    public String getIdentCliente() {
        return IdentCliente;
    }

    public void setIdentCliente(String identCliente) {
        IdentCliente = identCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getDirCliente() {
        return DirCliente;
    }

    public void setDirCliente(String dirCliente) {
        DirCliente = dirCliente;
    }

    public String getTelCliente() {
        return TelCliente;
    }

    public void setTelCliente(String telCliente) {
        TelCliente = telCliente;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean activo) {
        Activo = activo;
    }
}
