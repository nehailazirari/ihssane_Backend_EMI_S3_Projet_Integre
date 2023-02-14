package com.example.ihssane.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;

@Entity
@Table(name = "Don")

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

//@DiscriminatorColumn(name = "TypeDon")
@AllArgsConstructor  @ToString @NoArgsConstructor
public  class Don  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date dateCreation;
    private String description;
    private String photo;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "categoryDesignation")

    private Category category;


   /* @Column(name="TypeDon", insertable = false, updatable = false)
    protected String TypeDon;

    public String getTypeDon() {
        return TypeDon;
    }*/

    @ManyToOne
    @JoinColumn(name = "donneurId")
    private Utilisateur donneur;

    public Don(Long iddon_favorie) {
        this.id= iddon_favorie;
    }
    //@Transient




    public Utilisateur getDonneur() {
        return donneur;
    }

    public void setDonneur(Utilisateur donneur) {
        this.donneur = donneur;
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
 /*public Don(Long id, String nom, Date dateCreation, String description, String photo, Category category, Donneur donneur) {
        this.id = id;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.description = description;
        this.photo = photo;
        this.category=category;
        this.donneur = donneur;
    }*/

    @Override
    public String toString() {
        return "Don{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateCreation=" + dateCreation +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +

                ", donneur=" + donneur +
                '}';
    }
}
