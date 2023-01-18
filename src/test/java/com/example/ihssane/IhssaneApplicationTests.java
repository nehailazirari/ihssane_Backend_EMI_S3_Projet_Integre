package com.example.ihssane;

import com.example.ihssane.model.Don;
import com.example.ihssane.model.Donneur;
import com.example.ihssane.model.Vetements;
import com.example.ihssane.repository.DonRepository;
import com.example.ihssane.repository.DonneurRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class IhssaneApplicationTests {

    @Autowired
    private DonRepository donRepository;

    @Autowired
    private DonneurRepository donneurRepository;

    @Test
    public void testCreateProduit(){
        //Donneur donneur=new Donneur(null,"rania","marouni","1234","marouni.rania1@gmail.com","Eljadida",new Date(),"0654345654");
        //Don don=new Vetements(null,"tricot",new Date(),"jolie",donneur);
        //Don don= donneur.creerDon(null,"tricot",new Date(),"jolie","hh",donneur);
        //donneurRepository.save(donneur);
        //donRepository.save(don);
    }


}
