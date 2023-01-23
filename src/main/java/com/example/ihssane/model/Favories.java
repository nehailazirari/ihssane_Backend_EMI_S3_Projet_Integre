package com.example.ihssane.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Favories")
public class Favories implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFavorites")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "IdUtilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "IdDon")
    private Don don_Favorie;
}
