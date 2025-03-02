package com.query.projeto_query.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.query.projeto_query.entity.Clients;
import com.query.projeto_query.repositories.ClientRepository;


@RestController()
@RequestMapping("api/clients")
public class ClientController {
    
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping()
    public List<Clients> getAllClients()
    {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Clients getClientsById(@PathVariable Long id) {
        return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    @PutMapping("/{id}")
    public Clients updateClients(@PathVariable Long id, @RequestBody Clients clientsDetails) {
        Clients clients = clientRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Não foi possível atualizar"));
    
        clients.getDatasPessoal().setName(clientsDetails.getDatasPessoal().getName());
        clients.getDatasPessoal().setCpf(clientsDetails.getDatasPessoal().getCpf());
    
        clientRepository.save(clients);
    
        return clients;
    }
    
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id)
    {
        clientRepository.deleteById(id);
    }
}
