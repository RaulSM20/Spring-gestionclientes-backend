package com.rsandez.gestionclientes.gestionclientes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsandez.gestionclientes.gestionclientes.Entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
