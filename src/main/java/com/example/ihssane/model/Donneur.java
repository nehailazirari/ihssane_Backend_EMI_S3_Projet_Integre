package com.example.ihssane.model;

import com.example.ihssane.model.Don;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/*
@Entity
@Table(name = "Donneur")
//@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Donneur  implements Serializable {
     */
/*@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nom;
     private String email;*//*
*/
/*
     //@Transient
     //@OneToMany(mappedBy = "donneur")
     //private Collection<Don> dons;

     @Builder
     public Donneur(Long id, String nom, String prenom, String pass, String gmail, String ville,  Date date,String tele){
          super(id,nom,prenom,pass,gmail,ville,date,tele);
     }

     public Donneur() {
          super();
     }
     *//*
*/
/*public Don creerDon(Long id,String nom,Date d,String des,String photo,Donneur donneur){
          Don don=new Vetements(id,nom,d,des,photo,donneur);
          return don;
     }*//*


     @Id()
     @GeneratedValue
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

     @OneToMany(mappedBy = "donneur",cascade = CascadeType.ALL)
     //@JsonBackReference
     private Collection<Don> dons;

     public Donneur(Long id, String nom, String prenom, String password, String gmail, String ville, Date naissance, String telephone) {
          this.id = id;
          this.nom = nom;
          this.prenom = prenom;
          this.password = password;
          this.gmail = gmail;
          this.ville = ville;
          this.naissance = naissance;
          this.telephone = telephone;
     }

     public Donneur() {

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

     @Override
     public String toString() {
          return "Utilisateur{" +
                  "id=" + id +
                  ", nom='" + nom + '\'' +
                  ", prenom='" + prenom + '\'' +
                  ", password='" + password + '\'' +
                  ", gmail='" + gmail + '\'' +
                  ", ville='" + ville + '\'' +
                  ", naissance=" + naissance +
                  ", telephone='" + telephone + '\'' +
                  '}';
     }
}
*/
