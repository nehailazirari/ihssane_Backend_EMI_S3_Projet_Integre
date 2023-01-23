package com.example.ihssane.service;

import com.example.ihssane.model.Don;
import com.example.ihssane.dao.DonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DonService {

    @Autowired
    private DonRepository donRepository;


    public String ajouterDon(Don don, char T)  {

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

    //affichage de don d'un utilisateur
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

    //affichage de tous le dons (catalogue)
    public String afficherTousDons(){
        ArrayList<Don> dons= (ArrayList<Don>) donRepository.findAll();
        return "La liste de tous les donts "+dons;
    }

    public Don getDonById(Long id) {

        return donRepository.findById(id).get();
    }



    /*public String afficherUnDon(Long id){
        //donRepository.findById(id);
        return "Affichage du don  "+donRepository.findById(id).get();
    }
*/

}
