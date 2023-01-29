package com.example.ihssane.controller;

import com.example.ihssane.dao.DonRepository;
import com.example.ihssane.model.Don;
//import com.example.ihssane.model.Donneur;
//import com.example.ihssane.repository.DonRepository;
import com.example.ihssane.model.Utilisateur;
import com.example.ihssane.service.ServiceProduit;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/Dons")
public class DonControlleur {

    @Autowired
    ServiceProduit serviceProduit;
    @Autowired
    private DonRepository donRepository;

    @GetMapping("/afficherTousDons/{idDonneur}")
    public List<Don> tousDons(@PathVariable Long idDonneur){
        List<Don> dons= serviceProduit.afficherListDon(idDonneur);
        //dons.forEach(p->{p.ge});
        return dons;
    }

    @GetMapping("/afficherUnDon/{id}")
    public Don UnDons(@PathVariable Long id){
        /*Don don = serviceProduit.afficherUnDon(id);
        return ResponseEntity.ok(don);*/
        return serviceProduit.afficherUnDon( id);
    }

    /*@PostMapping("/ajouterUnDon/{T}")
    public String ajouterUnDon(@RequestBody Don don, @PathVariable char T)  {
        return serviceProduit.ajouterDon(don,T);
    }*/

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
    /*public String supprimerDon(@PathVariable Long id){

        serviceProduit.supprimerDon(id);
        return "Don avec l'id "+id+" a été supprimé avec succès";
    }*/

    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        try {
            donRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*@PostMapping("/donate")
    public ResponseEntity<Don> createDonation(@RequestBody Don donation, @RequestParam Long userId, @RequestParam String category) {
        Donneur user = serviceProduit.findById(userId).get();
        if (user!=null){
            donation.setDonneur(user);
            donation.setCategory(category);
            donation = serviceProduit.createDonation(donation);

        }
        return new ResponseEntity<>(donation, HttpStatus.CREATED);
    }
*/

    @PostMapping("/donate")
    public ResponseEntity<Don> createDonation(@RequestBody Don don) {
        Utilisateur user = don.getDonneur();
        if (user!=null){
            don = serviceProduit.createDonation(don);
        }
        return new ResponseEntity<>(don, HttpStatus.CREATED);
    }
    @GetMapping("/{userId}/{category}")
    public ResponseEntity<List<Don>> getDonationsByUserIdAndCategory(@PathVariable Long userId, @PathVariable String category) {
        List<Don> donations = serviceProduit.findDonationsByUserIdAndCategory(userId,category);
        return new ResponseEntity<>(donations, HttpStatus.OK);
    }

    @DeleteMapping("/{donationId}")
    public ResponseEntity<Void> deleteDonation(@PathVariable Long donationId) {
        serviceProduit.deleteDonation(donationId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/donations/{donorId}")
    public ResponseEntity<List<Don> >getAllDonationsByDonorId(@PathVariable Long donorId) {
        List<Don> dons=serviceProduit.findAllByDonorId(donorId);
        return new ResponseEntity<>(dons,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/category/{id}/{designation}")
    public ResponseEntity<List<Don> >getDonationsByCategory(@PathVariable Long id,@PathVariable String designation) {
        List<Don> dons=serviceProduit.findDonationsByUserIdAndCategory(id,designation);
        return new ResponseEntity<>(dons,HttpStatus.OK);
    }

    @GetMapping("/search/{key}")
    public ResponseEntity<List<Don>> getByKey( @PathVariable String key) {
        // Use the key parameter to search for data in the database
        // For example, using a JPA repository
        List<Don> result = donRepository.findByNomContainingIgnoreCase(key);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Don> updateDonation(@PathVariable(value = "id") Long donationId,
                              @Valid @RequestBody Don donationDetails) {
        try {
            Don donation = donRepository.findById(donationId)
                    .orElseThrow((null));
            donation.setPhoto(donationDetails.getPhoto());
            donation.setNom(donationDetails.getNom());
            donation.setDescription(donationDetails.getDescription());
            donation.setCategory(donationDetails.getCategory());
            // Code pour mettre à jour la donation ici
            // Exemple : donation.setName(donationDetails.getName());
            donRepository.save(donation);
            return ResponseEntity.ok().body(donation);
            //return donation;
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.notFound().build();
            //return null;
        }
    }


}
