package com.example.ihssane.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.transaction.TransactionScoped;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Dons")


@Data  @AllArgsConstructor  @ToString @NoArgsConstructor
public  class Don implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String categorie;
    private String dateCreation;
    private String description;
    private String photo;


    @ManyToOne
    @JoinColumn(name = "Iddonneur")
    private Utilisateur donneur;



}
