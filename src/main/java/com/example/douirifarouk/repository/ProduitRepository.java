package com.example.douirifarouk.repository;

import com.example.douirifarouk.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
