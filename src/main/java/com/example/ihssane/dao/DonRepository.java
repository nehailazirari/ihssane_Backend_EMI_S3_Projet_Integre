package com.example.ihssane.DAO;

import com.example.ihssane.model.Don;
import com.example.ihssane.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Repository
public interface DonRepository extends JpaRepository<Don,Long> {



    //List<Donation> findByDonorId(Long donorId);
    public List<Don> findByDonneurId(Long userId);
    public List<Don> findByDonneurIdAndCategory(Long userId,String category);


    List<Don> findDonByDonneur(Optional<Utilisateur> donor);

    @Query("select d from Don d where d.category.designation = :designation")
    public List<Don> findAllByCategory(String designation);

    List<Don> findByNomContainingIgnoreCase(String title);
    @Query("SELECT d FROM Don d")
    List<Don> findAllDons();
}
