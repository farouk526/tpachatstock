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

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock;
    private int qteStock;
    private int qteMin;
    private String libelleStock;
    @OneToMany(mappedBy = "stock")
    List<Produit> produits;

}
