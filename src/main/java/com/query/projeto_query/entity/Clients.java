package com.query.projeto_query.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "clients")
public class Clients {
    public static final String DatasPessoal = null;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Embedded
    private DatasPessoal datasPessoal;

    public Clients(String name, String cpf)
    {
        this.datasPessoal = new DatasPessoal(name, cpf);
    }

    public DatasPessoal getDatasPessoal()
    {
        return datasPessoal;
    }

    
}
