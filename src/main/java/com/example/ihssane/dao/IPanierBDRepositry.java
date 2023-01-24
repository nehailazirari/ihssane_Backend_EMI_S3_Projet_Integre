package com.example.ihssane.DAO;

import com.example.ihssane.model.Panier;
import com.example.ihssane.model.PanierBD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPanierBDRepositry extends JpaRepository<PanierBD, Long> {



}
