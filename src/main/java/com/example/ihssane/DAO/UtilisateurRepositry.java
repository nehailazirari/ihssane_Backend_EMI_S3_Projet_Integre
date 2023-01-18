package com.example.ihssane.DAO;

import com.example.ihssane.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepositry extends JpaRepository<Utilisateur,Long> {
}
