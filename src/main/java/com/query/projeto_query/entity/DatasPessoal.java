package com.query.projeto_query.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class DatasPessoal {
    private String name;
    private String cpf;

    public DatasPessoal(String name, String cpf)
    {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
