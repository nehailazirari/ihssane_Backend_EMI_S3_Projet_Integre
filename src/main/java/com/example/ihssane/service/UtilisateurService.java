package com.example.ihssane.service;


import com.example.ihssane.dao.DonRepository;
import com.example.ihssane.dao.UtilisateurRepository;
import com.example.ihssane.model.Don;
import com.example.ihssane.model.Favories;
import com.example.ihssane.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository userepo;

    @Autowired
    private DonRepository donRepository;


    public Utilisateur save(Utilisateur user) {
        return userepo.save(user);
    }


    public Utilisateur findUser(String email, String password) {
        return userepo.findUser(email, password);

    }

    public Optional<Utilisateur> getUserById(Long id){
        return userepo.findById(id);
    }

    public void delete(Long id) {
        userepo.deleteById(id);
    }

    public void update(Long id, Utilisateur user) {

        Utilisateur existingUser = userepo.findById(id).get();

        existingUser.setNom(user.getNom());
        existingUser.setPassword(user.getPassword());
        existingUser.setEmail(user.getEmail());

        userepo.save(existingUser);

    }

    public Utilisateur emailExists(String email) {

        return userepo.findByEmail(email);

    }

    //Section de favories
    public List<Long> getFavorie_User(Long userId) {
        return  userepo.findDon_ofUser(userId);
    }

    public void addFavorie(Utilisateur idUser,Don don){

    }
}
