package com.example.ihssane.controller;

import com.example.ihssane.model.Don;
import com.example.ihssane.service.DonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController


@RequestMapping(value = "/Dons")
public class DonControlleur {

    @Autowired
    DonService servicedon;

    //Catalogue
    @GetMapping("/afficherTousDons")
    public String tousDons(){
        return servicedon.afficherTousDons();
    }


    @GetMapping("/afficherTousDons/{idDonneur}")
    public String tousDons_Donneur(@PathVariable Long idDonneur){
        return servicedon.afficherListDon(idDonneur);
    }



    @PostMapping("/ajouterUnDon/{T}")
    public String ajouterUnDon(@RequestBody Don don, @PathVariable char T)  {
        return servicedon.ajouterDon(don,T);
    }


    @DeleteMapping("/SupprimerDon/{id}")
    public String supprimerDon(@PathVariable Long id){
        return servicedon.supprimerDon(id);
    }


}
