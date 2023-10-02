package com.example.simple.service;

import com.example.simple.model.Client;
import com.example.simple.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    ClientService(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }

    public void addClient(Client client) {
        clientRepository.save(client);
    }

    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    public void deleteClientId(Long id) {
        clientRepository.deleteById(id);

    }

}
