package com.example.douirifarouk.controller;

import com.example.douirifarouk.entity.Client;
import com.example.douirifarouk.services.ClientServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/client")

public class ClientController {
    @Autowired
    ClientServiceInt clientServiceInt;

    @GetMapping("/retrieveAllClients")
    public List<Client> retrieveAllClients()
    {
        return clientServiceInt.retrieveAllClients();
    }

    @PostMapping("/AddClient")
    public Client AddClient( @RequestBody Client c )
    {
        return clientServiceInt.addClient(c) ;
    }


    @PutMapping("/UpdateClient")
    public Client UpdateClient(@RequestBody Client c)
    {
        return clientServiceInt.updateClient(c);
    }

    @DeleteMapping("/delete-client/{client-id}")
    public void deleteClient(@PathVariable("client-id") Long id) {
        clientServiceInt.deleteClient(id);
    }

    @GetMapping("/retrieveClient")
    public Client retrieveClient(@PathParam("id") Long id){
        return clientServiceInt.retrieveClient(id);
    }
}
