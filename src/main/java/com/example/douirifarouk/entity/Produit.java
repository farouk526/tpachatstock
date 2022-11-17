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

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit; ;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @OneToOne
    private DetailProduit detailProduit ;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private Rayon rayon;

    @ManyToMany
    List<Fournisseur> fournisseurs;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;

}
