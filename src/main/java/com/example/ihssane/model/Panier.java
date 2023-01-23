package com.example.ihssane.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity

@Table(name = "panier")

public class Panier implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//
    @OneToOne(cascade = CascadeType.ALL)

    private Utilisateur utilisateur;//
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<PanierBD> panierBD = new HashSet<>() ;


    public Panier(Long id, Utilisateur utilisateur, Set<PanierBD> panierBD) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.panierBD = panierBD;
    }

    public Panier(Utilisateur utilisateur, Set<PanierBD> panierBD) {

        this.utilisateur = utilisateur;
        this.panierBD = panierBD;
        System.out.println(3);
    }


    public Panier() {

    }
}
