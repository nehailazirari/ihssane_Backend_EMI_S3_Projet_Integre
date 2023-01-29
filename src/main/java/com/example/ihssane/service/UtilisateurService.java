
package com.example.ihssane.service;


import com.example.ihssane.dao.DonRepository;
import com.example.ihssane.dao.UtilisateurRepository;
import com.example.ihssane.model.Don;
import com.example.ihssane.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {




    @Autowired
    private UtilisateurRepository donorRepository;
    @Autowired
    private DonRepository donRepository;

    public List<Don> getDonorDons(Long id) {
        Optional<Utilisateur> donor = donorRepository.findById(id);
        return donRepository.findDonByDonneur(donor);
    }
    public Utilisateur save(Utilisateur user) {
        return donorRepository.save(user);
    }


    public Utilisateur findUser(String email, String password) {
        return donorRepository.findUser(email, password);

    }

    public Optional<Utilisateur> getUserById(Long id){
        return donorRepository.findById(id);
    }

    public void delete(Long id) {
        donorRepository.deleteById(id);
    }

    public void update(Long id, Utilisateur user) {

        Utilisateur existingUser = donorRepository.findById(id).get();

        existingUser.setNom(user.getNom());
        existingUser.setPassword(user.getPassword());
        existingUser.setEmail(user.getEmail());

        donorRepository.save(existingUser);

    }

    public Utilisateur emailExists(String email) {

        return donorRepository.findByEmail(email);

    }

    //Section de favories
    public List<Long> getFavorie_User(Long userId) {
        return donorRepository.findDon_ofUser(userId);
    }

    public void addFavorie(Utilisateur idUser, Don don){

    }
}

