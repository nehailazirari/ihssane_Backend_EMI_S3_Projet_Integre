package com.example.ihssane;

//import com.example.ihssane.Controlleur.DonControlleur;
import com.example.ihssane.controller.DonControlleur;
import com.example.ihssane.dao.CategoryRepository;
import com.example.ihssane.dao.DonRepository;
//import com.example.ihssane.dao.DonneurRepository;
import com.example.ihssane.dao.UtilisateurRepository;
import com.example.ihssane.model.Category;
import com.example.ihssane.model.Don;
//import com.example.ihssane.model.Donneur;
//import com.example.ihssane.repository.CategoryRepository;
//import com.example.ihssane.repository.DonRepository;
//import com.example.ihssane.repository.DonneurRepository;
import com.example.ihssane.model.Utilisateur;
import com.example.ihssane.service.ServiceCategory;
//import com.example.ihssane.service.ServiceDonneur;
import com.example.ihssane.service.ServiceProduit;
import com.example.ihssane.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class IhssaneApplication implements CommandLineRunner, WebMvcConfigurer {

    public static void main(String[] args) {

        SpringApplication.run(IhssaneApplication.class, args);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
    @Autowired
    private UtilisateurRepository donneurRepository;

    @Autowired
    private DonControlleur donControlleur;


    @Autowired
    private DonRepository donRepository;

    @Autowired
    private ServiceProduit serviceProduit;

    @Autowired
    private ServiceCategory serviceCategory;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UtilisateurService serviceDonneur;

    @Override
    public void run(String... args) throws Exception {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        //Ajout des donneurs
        //(Long id, String email, String nom, String prenom, String password, String ville, String adresse, String tel, String date_de_naissance)
        Utilisateur donneur=new Utilisateur(null,"marouni.rania1@gmail.com","marouni","rania","1234","Eljadida","LOT HOUSNA 7 ","0654345654","2001-05-29");
        donneurRepository.save(donneur);
        Utilisateur donneur2=new Utilisateur(null,"marouni.nada1@gmail.com","marouni","nada","1234567","Eljadida","LOT HOUSNA 7 ","065439087","2004-02-22");
        donneurRepository.save(donneur2);

        Category c1=new Category(null,"Electromenager");
        categoryRepository.save(c1);

        Category c2=new Category(null,"Ameublement");
        categoryRepository.save(c2);

        Category c3=new Category(null,"Cuisine");
        categoryRepository.save(c3);

        Category c4=new Category(null,"Vetements");
        categoryRepository.save(c4);
        //Ajout des dons
        Don V1= new Don(null,"frigo", df.parse("2022-12-4"),"Frigo hauteur 1h55m ,bon état général fissure à l'intérieur ","https://cdn.jedonne.fr/large/549ee119-0160-40c4-ab18-30f071bfbcc4.jpg",c1,donneur);
        donRepository.save(V1);
        Don V2= new Don(null,"canapé ikea", df.parse("2022-12-1"),"Donne canapé IKEA 3 places Longueur 1,95 m","https://cdn.jedonne.fr/large/6dadba52-ab82-4b2d-8674-eefe2e3fef5b.jpg",c2,donneur);
        donRepository.save(V2);
        Don E1= new Don(null,"lot de soucoupes", df.parse("2022-11-2"),"Lots de soucoupe de tasses à café","https://cdn.jedonne.fr/medium/0e9fdb71-86fe-42f2-bb98-0298ed08dd98.jpg",c3,donneur2);
        donRepository.save(E1);
        Don E2= new Don(null,"Doudoune", df.parse("2022-11-3"),"rose taille xs","https://cdn.jedonne.fr/large/27760c98-9ee5-4228-9a81-6ab65e724c7c.jpg",c4,donneur);
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

        //System.out.println("couccccccouuuu"+serviceProduit.findDonationsByUserIdAndCategory(1L,"e"));

        //System.out.println("cccccccccccccccc"+serviceProduit.afficherListDon(1L));
        //categoryRepository.findAll().forEach(category -> System.out.println(category.getDesignation()));
        //System.out.println(serviceCategory.findCategoryById(1L));
        //System.out.println("ccccccccccc"+donControlleur.updateDonation(1L,V2));
    }
}
