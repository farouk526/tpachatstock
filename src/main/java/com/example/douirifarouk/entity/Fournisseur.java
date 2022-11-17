package com.example.douirifarouk.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    @ManyToMany(mappedBy = "fournisseurs")
    List<Produit> produits;
}
