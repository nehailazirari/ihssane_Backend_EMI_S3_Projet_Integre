package com.example.ihssane.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "Category")

@NoArgsConstructor
//@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String designation;
    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER)
    //@Transient
    private Collection<Don> dons;

    public Category(Long id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }




    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                '}';
    }
}