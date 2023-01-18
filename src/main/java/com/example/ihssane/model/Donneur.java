package com.example.ihssane.model;

import lombok.*;
import org.springframework.http.converter.xml.Jaxb2CollectionHttpMessageConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "Donneur")
//@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Donneur extends Utilisateur implements Serializable {
     /*@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nom;
     private String email;*/
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
     /*public Don creerDon(Long id,String nom,Date d,String des,String photo,Donneur donneur){
          Don don=new Vetements(id,nom,d,des,photo,donneur);
          return don;
     }*/
}
