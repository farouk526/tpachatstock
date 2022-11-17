package com.example.douirifarouk.services;

import com.example.douirifarouk.entity.Client;

import java.util.List;

public interface ClientServiceInt {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);
}
