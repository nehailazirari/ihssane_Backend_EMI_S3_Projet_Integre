package com.example.ihssane.model;

import com.example.ihssane.autres.EtatDemande;

import javax.persistence.*;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Utilisateur recuperateur;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private PanierBD panierBD;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getRecuperateur() {
        return recuperateur;
    }

    public void setRecuperateur(Utilisateur recuperateur) {
        this.recuperateur = recuperateur;
    }

    public PanierBD getPanierBD() {
        return panierBD;
    }

    public void setPanierBD(PanierBD panierBD) {
        this.panierBD = panierBD;
    }
}
