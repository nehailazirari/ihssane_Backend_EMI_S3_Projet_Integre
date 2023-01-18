package com.example.ihssane.model;


import com.example.ihssane.autres.EtatDemande;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class PanierBD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "don_id")
    private Don don;
    private EtatDemande etatDemande;

    public PanierBD( Don don, EtatDemande etatDemande) {
        this.don = don;
        this.etatDemande = etatDemande;
    }

    public PanierBD(Long id, Don don, EtatDemande etatDemande) {
        this.id = id;
        this.don = don;
        this.etatDemande = etatDemande;
    }

    public PanierBD() {
    }
}
