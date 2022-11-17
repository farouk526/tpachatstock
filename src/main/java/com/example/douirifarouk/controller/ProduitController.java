package com.example.douirifarouk.controller;

import com.example.douirifarouk.entity.Produit;
import com.example.douirifarouk.services.ProduitServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@RestController
@RequestMapping("/Produit")
public class ProduitController {
    @Autowired
    ProduitServiceInt produitService;

    @GetMapping("/retrieveAllProduits")
    public List<Produit> retrieveAllProduits()
    {
        return produitService.retrieveAllProduits();
    }

    @PostMapping("/addProduit")
    public Produit addProduit(@RequestBody Produit p, @PathVariable Long idRayon, @PathVariable Long idStock)
    {
        return produitService.addProduit(p,idRayon, idStock) ;
    }


    @GetMapping("/retrieveProduit")
    public Produit retrieveProduit(@PathParam("id") Long idProduit){
        return produitService.retrieveProduit(idProduit);
    }

    @PutMapping("/assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit,@PathVariable Long idStock){
        produitService.assignProduitToStock(idProduit,idStock);
    }
}
