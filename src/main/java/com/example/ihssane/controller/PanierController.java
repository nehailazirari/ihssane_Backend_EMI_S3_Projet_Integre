package com.example.ihssane.controller;


import com.example.ihssane.autres.EtatDemande;
import com.example.ihssane.model.*;
import com.example.ihssane.service.PanierService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping(path = "api/panier")
public class PanierController {

    @Autowired
    private final PanierService panierService;




    public PanierController( PanierService panierService) {
        this.panierService = panierService;
    }


    @GetMapping(value = "/{id}")
    public Panier getPanier(@PathVariable @NotNull Long id){
        return panierService.getPanierByUtilisateur(id);
    }
    @PostMapping("/Qu/{id}")
    public void addToCart(@PathVariable("id") Long id,@RequestBody Utilisateur utilisateur){
        panierService.addToExistingShoppingCart(id,utilisateur);
    }
//    @RequestBody Long id,


    @DeleteMapping("/deletePanierBD/{idPanierBD}/{idUtilisateur}")
    public void deletePanierBDFromPanier(@PathVariable("idPanierBD")  Long idPanierBD,@PathVariable("idUtilisateur") Long idUtilisateur){

        panierService.removePanierBDFromPanier(idPanierBD,idUtilisateur);

    }
    @DeleteMapping("/deletePanier/{idUtilisateur}")
    public void deletePanier(@PathVariable("idUtilisateur") Long idUtilisateur){

        panierService.clearShoppingCart(idUtilisateur);
    }


    @PutMapping("/updatePanierBD/{idPanierBD}/{etatDemande}")
    public void updatePanierBD(@PathVariable("idPanierBD")Long idPanierBD,@PathVariable("etatDemande") EtatDemande etatDemande ){

        panierService.updatePanierBD(idPanierBD,etatDemande);
    }

}
