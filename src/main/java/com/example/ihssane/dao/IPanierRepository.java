/*package com.example.ihssane.dao;

import com.example.ihssane.model.Panier;
import com.example.ihssane.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPanierRepository extends JpaRepository<Panier, Long> {
    Optional<Panier> findById(Long Id);

    @Query(value = "select p from Panier p where p.utilisateur.id= :id ")
    Panier findByUtilisateur(@Param("id") Long  id);

}*/
