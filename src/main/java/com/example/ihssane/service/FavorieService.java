package com.example.ihssane.service;

import com.example.ihssane.DAO.FavoriesRepository;

import com.example.ihssane.model.Favories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavorieService {

    @Autowired
    private FavoriesRepository favrepo;

    public List<Long> findFavorie_ofUser(Long idUser) { //retourne la liste des id des dons favories d'un utilisteur
        return favrepo.findFavories_ofUser(idUser);
    }

    public void  addFavorie(Favories fav){
         favrepo.save(fav);

    }
    public void deleteFavorie(Long idFavorie){
        favrepo.deleteById(idFavorie);
    }

    public Long getIdFavorie(Long idUtilisateur,Long idDon){
        return favrepo.getIdFavorie(idUtilisateur,idDon);
    }
}

