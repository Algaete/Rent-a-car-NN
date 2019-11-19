package com.everis.rentacar.repository;

import com.everis.rentacar.entidades.Clientes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ClienteRepositorio extends MongoRepository<Clientes, Serializable>{
}
