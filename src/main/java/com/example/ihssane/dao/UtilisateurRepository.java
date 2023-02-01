package com.example.ihssane.DAO;

import com.example.ihssane.model.Don;
import com.example.ihssane.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    //Authentification
    @Query("SELECT p FROM Utilisateur p WHERE p.email =:email"
            + " AND p.password =:password"
    )
    public Utilisateur findUser(String email,String password);

    public Utilisateur findByEmail(String email);

    //Favories
    @Query("SELECT f.don_Favorie.id FROM Favories f WHERE f.utilisateur.id =:id")
    public List<Long> findDon_ofUser(Long id);

}
