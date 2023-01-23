package com.example.ihssane.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "Utilisateur")
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUtilisateur")
    private Long id ;
    @Column(name = "email",unique=true)
    private String email;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "password")
    private String password;


    @Column(name = "ville")
    private String ville;



    @Column(name = "adresse")
    private String adresse;

    @Column(name = "telephone")
    private String tel;

    @Column(name = "Date_de_Naissance")
    private String date_de_naissance;

    @Column(name = "photo")
    private String photo;

    @Column(name = "points")
    private int points;


    //Dons de l'utilisateur
   @OneToMany(mappedBy = "donneur")
    List<Don> dons;

   //Favories
   @OneToMany(mappedBy = "utilisateur")
    private List<Favories> favories;





    public Utilisateur ( String nom, String prenom, String password, String gmail, String ville,String naissance, String telephone,String photo,int points ){

        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.ville = ville;
        this.tel = tel;
        this.date_de_naissance = date_de_naissance;
        this.adresse=adresse;
        this.photo=photo;
        this.points=points;
    }

    public Utilisateur() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Don> getDons() {
        return dons;
    }

    public void setDons(List<Don> dons) {
        this.dons = dons;
    }

    public List<Favories> getFavories() {
        return favories;
    }

    public void setFavories(List<Favories> favories) {
        this.favories = favories;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

