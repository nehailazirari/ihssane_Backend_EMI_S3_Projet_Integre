package com.example.ihssane.model;

import com.example.ihssane.autres.EtatDemande;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.CascadeType.REFRESH;

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
    }


    public Panier() {

    }
}
