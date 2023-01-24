package com.example.ihssane.service;


import com.example.ihssane.DAO.IPanierBDRepositry;
import com.example.ihssane.DAO.IPanierRepository;
import com.example.ihssane.autres.EtatDemande;
import com.example.ihssane.model.Don;
import com.example.ihssane.model.Panier;
import com.example.ihssane.model.PanierBD;
import com.example.ihssane.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PanierService {

    @Autowired
    private IPanierRepository panierRepository;
    @Autowired
    private DonService donService;
    @Autowired
    private IPanierBDRepositry panierBDRepositry;

    public Panier addShoppingCartFirstTime(Long id, Utilisateur utilisateur) {
        Panier panier = new Panier();
        panier.setUtilisateur(utilisateur);
        PanierBD panierBD = new PanierBD();
        panierBD.setEtatDemande(EtatDemande._____);
        panierBD.setDon(donService.getDonById(id));
        panier.getPanierBD().add(panierBD);

        return panierRepository.save(panier);

    }

    public Panier addToExistingShoppingCart(Long id, Utilisateur utilisateur) {

        Panier panier = panierRepository.findByUtilisateur(utilisateur.getId());
        Don don = donService.getDonById(id);

        if(panier != null)
        {
            PanierBD panierBD = new PanierBD();
            panierBD.setEtatDemande(EtatDemande._____);
            panierBD.setDon(don);
            panier.getPanierBD().add(panierBD);

            return panierRepository.saveAndFlush(panier);
        }

        return this.addShoppingCartFirstTime(id, utilisateur);

    }

    public Panier getPanierByUtilisateur(Long id) {

        return  panierRepository.findByUtilisateur(id);
    }


    public PanierBD updatePanierBD(Long id, EtatDemande etatDemande) {
        PanierBD panierBD;
        panierBD = panierBDRepositry.findById(id).get();
        panierBD.setEtatDemande(etatDemande);
        return panierBDRepositry.saveAndFlush(panierBD);

    }


    public Panier removePanierBDFromPanier(Long idPanierBD, Long idUtilisateur) {
        Panier panier = panierRepository.findByUtilisateur(idUtilisateur);
        Set<PanierBD> panierBDS = panier.getPanierBD();
        PanierBD unPanierBD = null;
        for(PanierBD pd : panierBDS) {
            if(pd.getId()==idPanierBD) {
                unPanierBD = pd;
            }
        }
        panierBDS.remove(unPanierBD);
        panierBDRepositry.delete(unPanierBD);
        panier.setPanierBD(panierBDS);
        return panierRepository.save(panier);
    }

    public void clearShoppingCart(Long id) {
        Panier panier = panierRepository.findByUtilisateur(id);
        panierRepository.delete(panier);

    }

}
