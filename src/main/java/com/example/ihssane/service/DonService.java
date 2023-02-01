package com.example.ihssane.service;

import com.example.ihssane.model.Don;

//import com.example.ihssane.model.Electromenager;
//import com.example.ihssane.model.Vetements;
import com.example.ihssane.model.Utilisateur;
import com.example.ihssane.DAO.DonRepository;
import com.example.ihssane.DAO.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DonService {

    @Autowired
    private DonRepository donRepository;

    @Autowired
    private UtilisateurRepository donneurRepository;


   /* public String ajouterDon(Don don, char T)  {
        if(T=='V'){
            don=new Vetements(don.getId(),don.getNom(),don.getDateCreation(),don.getDescription(),don.getPhoto(),don.getDonneur());
        }
        if(T=='E'){
            don=new Electromenager(don.getId(),don.getNom(),don.getDateCreation(),don.getDescription(),don.getPhoto(),don.getDonneur());
        }
        donRepository.save( don);
        return "Nouveau don ajouté "+don;
    }*/


    /*public String ajouterDon(Don don,String type){
        donRepository.save(don);
        return "Nouveau  ajouté "+don;
    }*/


    /*public String ajouterListeDon(List<Don> dons){
        donRepository.saveAll(dons);
        return "Liste de  dons ajoutés "+dons;
    }*/

    public String supprimerDon(Long id){
        Don don=donRepository.findById(id).get();
        donRepository.delete(don);
        return "Don num "+id+"est supprimé";
    }

   /* public String modifier(Long idDon,Long idDonneur,){
        Don d=donRepository.findById(idDon).get();
        if(d.getDonneur().getId()==idDonneur){


        }
        //donRepository.save(don);
        //return "Le don num "+don.getId()+"a été modifié";
    }*/

    public List<Don> afficherListDon(Long idDonneur){
        ArrayList<Don> dons= (ArrayList<Don>) donRepository.findAll();
        ArrayList<Don> donDonneur=new ArrayList<>();
        for (Don d:dons){
            if(d.getDonneur().getId()==idDonneur){
                donDonneur.add(d);
            }
        }
        //return "La liste des don du donneu num "+idDonneur+" sont "+donDonneur;
        return donDonneur;
    }



    public Don afficherUnDon(Long id){
        donRepository.findById(id);
        return donRepository.findById(id).get();
    }


    /*public List<Don> findDonationsByUserId(Long userId) {
        return donRepository.f(userId);
    }*/

    public List<Don> findDonationsByUserIdAndCategory(Long userId,String category) {
        return donRepository.findByDonneurIdAndCategory(userId,category);
    }

    public Don createDonation(Don donation) {
        Utilisateur user = donneurRepository.findById(donation.getDonneur().getId()).orElse(null);
        //if(user != null) {
        donation.setDonneur(user);
        return donRepository.save(donation);
        //}else {
        // throw new UserNotFoundException();

        //}
    }

    public List<Don> findAllByDonorId(Long donorId) {
        return donRepository.findByDonneurId(donorId);
    }

    public void deleteDonation(Long donationId) {
        donRepository.deleteById(donationId);
    }

    public Optional<Utilisateur> findById(Long userId) {
        return donneurRepository.findById(userId);
    }

    public List<Don> findDonByCategory(String des){
        return donRepository.findAllByCategory(des);
    }

    public Don getDonById(Long id) {

        return donRepository.findById(id).get();
    }
    public List<Don> getAllDon(){
        return donRepository.findAllDons();
    }
}
