package com.example.douirifarouk.services;

import com.example.douirifarouk.entity.Produit;
import com.example.douirifarouk.entity.Stock;
import com.example.douirifarouk.repository.ProduitRepository;
import com.example.douirifarouk.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImp implements ProduitServiceInt{
    @Autowired
    ProduitRepository produitRepository;

    public List<Produit> retrieveAllProduits() {
        return null;
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock)
    {
        return produitRepository.save(p);

    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Autowired
     StockRepository stockRepository;
    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        if(produit!=null && stock!=null){
            produit.setStock(stock);
            produitRepository.save(produit);
        }


    }
}
