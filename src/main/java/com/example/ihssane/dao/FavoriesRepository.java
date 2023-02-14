package com.example.ihssane.DAO;

import com.example.ihssane.model.Favories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriesRepository extends JpaRepository<Favories, Long> {

    @Query("SELECT f.id FROM Favories f WHERE f.utilisateur.id =:idUser AND f.don_Favorie.id =:idDon")
    public Long getIdFavorie(Long idUser,Long idDon);


    @Query("SELECT f.don_Favorie.id FROM Favories f WHERE f.utilisateur.id =:idUser ")
    public List<Long> findFavories_ofUser(Long idUser);

}
