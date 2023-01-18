package com.example.ihssane.service;

import com.example.ihssane.model.Don;
import com.example.ihssane.model.Donneur;
import com.example.ihssane.model.Electromenager;
import com.example.ihssane.model.Vetements;
import com.example.ihssane.repository.DonRepository;
import com.example.ihssane.repository.DonneurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceProduit {

    @Autowired
    private DonRepository donRepository;

    @Autowired
    private DonneurRepository donneurRepository;


    public String ajouterDon(Don don, char T)  {
        if(T=='V'){
            don=new Vetements(don.getId(),don.getNom(),don.getDateCreation(),don.getDescription(),don.getPhoto(),don.getDonneur());
        }
        if(T=='E'){
            don=new Electromenager(don.getId(),don.getNom(),don.getDateCreation(),don.getDescription(),don.getPhoto(),don.getDonneur());
        }
        donRepository.save( don);
        return "Nouveau don ajouté "+don;
    }


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

    public String afficherListDon(Long idDonneur){
        ArrayList<Don> dons= (ArrayList<Don>) donRepository.findAll();
        ArrayList<Don> donDonneur=new ArrayList<>();
        for (Don d:dons){
            if(d.getDonneur().getId()==idDonneur){
                donDonneur.add(d);
            }
        }
        return "La liste des don du donneu num "+idDonneur+" sont "+donDonneur;
    }

    /*public String afficherUnDon(Long id){
        //donRepository.findById(id);
        return "Affichage du don  "+donRepository.findById(id).get();
    }
*/

}
