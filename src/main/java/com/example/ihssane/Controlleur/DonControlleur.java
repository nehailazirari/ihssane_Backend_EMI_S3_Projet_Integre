package com.example.ihssane.Controlleur;

import com.example.ihssane.model.Don;
import com.example.ihssane.service.ServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/Dons")
public class DonControlleur {

    @Autowired
    ServiceProduit serviceProduit;

    @GetMapping("/afficherTousDons/{idDonneur}")
    public String tousDons(@PathVariable Long idDonneur){
        return serviceProduit.afficherListDon(idDonneur);
    }

   /* @GetMapping("/afficherUnDon/{id}")
    public String UnDons(@PathVariable Long id){
        return serviceProduit.afficherUnDon( id);
    }
*/
    @PostMapping("/ajouterUnDon/{T}")
    public String ajouterUnDon(@RequestBody Don don, @PathVariable char T)  {
        return serviceProduit.ajouterDon(don,T);
    }

    /*@PostMapping("/ajouterListeDon")
    public String ajouterUnDon(@RequestBody List<Don> dons){
        return serviceProduit.ajouterListeDon(dons);
    }
*/
    //@PutMapping("/ModifierDon")
    //public String modifierDon(@RequestBody Don don){
        //return serviceProduit.modifier(don);
    //}

    @DeleteMapping("/SupprimerDon/{id}")
    public String supprimerDon(@PathVariable Long id){
        return serviceProduit.supprimerDon(id);
    }


}
