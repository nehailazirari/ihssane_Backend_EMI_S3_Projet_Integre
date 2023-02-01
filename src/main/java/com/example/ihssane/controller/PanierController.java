/*
package com.example.ihssane.controller;


import com.example.ihssane.autres.EtatDemande;
import com.example.ihssane.model.Panier;
import com.example.ihssane.model.PanierBD;
import com.example.ihssane.model.Utilisateur;
import com.example.ihssane.service.PanierService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping(path = "/api/panier")
public class PanierController {

    @Autowired
    private final PanierService panierService;



    public PanierController(PanierService panierService) {
        this.panierService = panierService;
    }


    @GetMapping(value = "/{id}")
    public Panier getPanier(@PathVariable @NotNull Long id){
        return panierService.getPanierByUtilisateur(id);
    }
    @PostMapping("/Qu/{id}")
    public PanierBD addToCart(@PathVariable("id") Long id, @RequestBody Utilisateur utilisateur){
       return panierService.addToExistingShoppingCart(id,utilisateur);
    }
//    @RequestBody Long id,

    @GetMapping("/inCart/{idDon}")
    public boolean inCart(@PathVariable("idDon") Long idDon){
        return panierService.inCart(idDon);
    }
    @GetMapping("/getByIdDon/{idDon}")
    public Long getIdPanierBD(@PathVariable("idDon") Long idDon){
        return this.panierService.getIdDon(idDon);
    }
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
*/
