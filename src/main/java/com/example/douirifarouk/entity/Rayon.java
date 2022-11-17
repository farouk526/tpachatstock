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

public class Rayon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRayon;
    private String codeRayon;
    private String libelleRayon;
    @OneToMany(mappedBy = "rayon")
    List<Produit> produits;

}
