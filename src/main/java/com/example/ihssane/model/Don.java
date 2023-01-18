package com.example.ihssane.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "Don")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "TypeDon")
@Data  @AllArgsConstructor  @ToString @NoArgsConstructor
public  class Don  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date dateCreation;
    private String description;
    private String photo;

   /* @Column(name="TypeDon", insertable = false, updatable = false)
    protected String TypeDon;

    public String getTypeDon() {
        return TypeDon;
    }*/
    @ManyToOne
    @JoinColumn(name = "IdDonneur")
    @Transient
    private Donneur donneur;


}
