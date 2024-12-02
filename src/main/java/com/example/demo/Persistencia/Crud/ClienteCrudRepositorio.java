package com.example.demo.Persistencia.Crud;

import com.example.demo.Persistencia.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepositorio extends CrudRepository<Cliente, String> {
}
