package com.example.douirifarouk.services;

import com.example.douirifarouk.entity.Produit;

import java.util.List;

public interface ProduitServiceInt {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);
    void assignProduitToStock(Long idProduit, Long idStock);

}
