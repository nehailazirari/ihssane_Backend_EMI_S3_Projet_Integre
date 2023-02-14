package com.example.ihssane.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Utilisateur")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Utilisateur {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String ville;

    @Column(nullable = false)
    private Date naissance;

    @Column(name = "tel")
    private String telephone;

    public Utilisateur(Long id, String nom, String prenom, String password, String gmail, String ville, Date naissance, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.email = gmail;
        this.ville = ville;
        this.naissance = naissance;
        this.telephone = telephone;
    }

    public Utilisateur() {

    }

    public Utilisateur(Long idutilisateur) {
        this.id=idutilisateur;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String gmail) {
        this.email = gmail;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", password='" + password + '\'' +
                ", gmail='" + email + '\'' +
                ", ville='" + ville + '\'' +
                ", naissance=" + naissance +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}