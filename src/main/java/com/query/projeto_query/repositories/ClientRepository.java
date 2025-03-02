package com.query.projeto_query.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.query.projeto_query.entity.Clients;

public interface ClientRepository extends JpaRepository<Clients, Long>{
    
}
