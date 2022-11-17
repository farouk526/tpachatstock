package com.example.douirifarouk.services;

import com.example.douirifarouk.entity.Client;
import com.example.douirifarouk.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImp implements ClientServiceInt{
    @Autowired
    ClientRepository clientRepository;
    @Override

    public List<Client> retrieveAllClients() {
        return null;
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        Client client=clientRepository.findById(id).orElse(null);
        clientRepository.delete(client);



    }

    @Override
    public Client updateClient(Client c) {
        return  clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }
}
