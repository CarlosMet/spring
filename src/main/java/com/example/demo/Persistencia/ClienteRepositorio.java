package com.example.demo.Persistencia;

import com.example.demo.Persistencia.Crud.ClienteCrudRepositorio;
import com.example.demo.Persistencia.Entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class ClienteRepositorio {
    ClienteCrudRepositorio clienteCrudRepositorio;

    public List<Cliente> ConsultaGeneral(){
        return (List<Cliente>) clienteCrudRepositorio.findAll();
    }

    public Optional<Cliente> ConsultarCliente(String id){
        return clienteCrudRepositorio.findById(id);

    }

    public void Eliminar(String id){
        clienteCrudRepositorio.deleteById(id);
    }

    public Cliente guardar(Cliente cliente){
        return clienteCrudRepositorio.save(cliente);
    }

}
