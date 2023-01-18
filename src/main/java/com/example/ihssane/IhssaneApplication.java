package com.example.ihssane;

import com.example.ihssane.model.Don;
import com.example.ihssane.model.Donneur;
import com.example.ihssane.model.Electromenager;
import com.example.ihssane.model.Vetements;
import com.example.ihssane.repository.DonRepository;
import com.example.ihssane.repository.DonneurRepository;
import com.example.ihssane.service.ServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class IhssaneApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(IhssaneApplication.class, args);
    }
    @Autowired
    private DonneurRepository donneurRepository;

    @Autowired
    private DonRepository donRepository;

    @Autowired
    private ServiceProduit serviceProduit;

    @Override
    public void run(String... args) throws Exception {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        //Ajout des donneurs
        Donneur donneur=new Donneur(null,"rania","marouni","1234","marouni.rania1@gmail.com","Eljadida",df.parse("2001-5-129"),"0654345654");
        donneurRepository.save(donneur);
        Donneur donneur2=new Donneur(null,"nada","marouni","123456","marouni.nada@gmail.com","Rabat",df.parse("2004-2-2"),"0612345678");
        donneurRepository.save(donneur2);

        //Ajout des dons
        //Don V1= new Don(null,"tricot", df.parse("2022-12-4"),"jolie","hhh","vetement",donneur);
        //donRepository.save(V1);
        Don V2= new Vetements(null,"Jupe", df.parse("2022-12-1"),"Rouge","ggg",donneur);
        donRepository.save(V2);
        Don E1= new Electromenager(null,"Pc", df.parse("2022-11-2"),"MacBook","iii",donneur2);
        donRepository.save(E1);
        Don E2= new Electromenager(null,"Imprimante", df.parse("2022-11-3"),"HP","kkk",donneur);
        donRepository.save(E2);
        //System.out.println(V1.getTypeDon());


        //Afficher la premiere page des dons dans la console
        //Page <Don> dons=donRepository.findAll( PageRequest.of(1,1));
        //dons.forEach(e-> System.out.println(e));
        //List<Donneur>donneurs=donneurRepository.findAll();
        //donneurs.forEach(e-> System.out.println(e));
        //System.out.println(serviceProduit.ajouterDon(E2,"E"));
        //donRepository.save(V1);
        //System.out.println(serviceProduit.ajouterListeDon(Arrays.asList(E1,E2)));
        //System.out.println(serviceProduit.ajouterDon(new Don(null,"a",new Date(),"b","c",donneur), 'E'));
        //System.out.println(serviceProduit.afficherListDon(1L));

    }
}
