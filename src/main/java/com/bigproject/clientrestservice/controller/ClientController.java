package com.bigproject.clientrestservice.controller;

import com.bigproject.clientrestservice.dao.ClientRepository;
import com.bigproject.clientrestservice.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @GetMapping("/{clientId}")
    public Client getClientById(@PathVariable(name = "clientId", required = true) long clientId){
        return clientRepository.findById(clientId);
    }

    @PostMapping("/")
    public Client saveAndUpdateClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @DeleteMapping(value = "/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable(name = "clientId", required = true) long clientId){
        Client clientToDelete = clientRepository.findById(clientId);
        clientRepository.delete(clientToDelete);
        return ResponseEntity.accepted().build();
    }

}
