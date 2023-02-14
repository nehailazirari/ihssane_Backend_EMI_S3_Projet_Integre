package com.example.ihssane.DAO;

import com.example.ihssane.model.Don;
import com.example.ihssane.model.Panier;
import com.example.ihssane.model.PanierBD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPanierBDRepositry extends JpaRepository<PanierBD, Long> {


    @Query(value ="select p from PanierBD p where p.don.id =:idDon")
    PanierBD findByDon(@Param("idDon") Long idDon);
}
