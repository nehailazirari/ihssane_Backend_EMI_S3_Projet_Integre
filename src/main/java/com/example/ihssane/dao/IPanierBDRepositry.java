package com.example.ihssane.dao;

import com.example.ihssane.model.PanierBD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPanierBDRepositry extends JpaRepository<PanierBD, Long> {



}
