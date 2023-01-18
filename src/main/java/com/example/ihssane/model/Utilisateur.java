package com.example.ihssane.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String gmail;

    @Column(nullable = false)
    private String ville;

    @Column(nullable = false)
    private Date naissance;

    @Column(name = "tel")
    private String telephone;

    public Utilisateur(String nom, String prenom, String password, String gmail, String ville, Date naissance, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.gmail = gmail;
        this.ville = ville;
        this.naissance = naissance;
        this.telephone = telephone;
    }

    public Utilisateur(Long id, String nom, String prenom, String password, String gmail, String ville, Date naissance, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.gmail = gmail;
        this.ville = ville;
        this.naissance = naissance;
        this.telephone = telephone;
    }
    public Utilisateur() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
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
}