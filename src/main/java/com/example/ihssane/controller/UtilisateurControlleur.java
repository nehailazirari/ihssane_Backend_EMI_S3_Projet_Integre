package com.example.ihssane.controller;

import com.example.ihssane.model.Favories;
import com.example.ihssane.model.Utilisateur;
import com.example.ihssane.service.FavorieService;
import com.example.ihssane.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping
public class UtilisateurControlleur {

	@Autowired
	UtilisateurService userservice;


	@Autowired
	FavorieService favorieService ;
	@PostMapping("/register")
	void addUser(@RequestBody Utilisateur user) {
		userservice.save(user);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String, Object> input) {

		String email = (String)input.get("email");
		String password = (String)input.get("password");
		Utilisateur bool = userservice.findUser(email,password);
		return ResponseEntity.status(HttpStatus.OK).body(bool);
	}
	@GetMapping("/getUsers/{userId}")
	public Optional<Utilisateur> getUser(@PathVariable Long userId){
		return userservice.getUserById(userId);
	}

	@DeleteMapping("/users/{id}")    //suppimer
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		userservice.delete(id);
		return new ResponseEntity<String>("Expense is deleted successfully.!", HttpStatus.OK);
	}


	@PostMapping("/users/emailcheck")
	public ResponseEntity<?> emailCheck(@RequestBody Map<String, Object> inputData) {

		String email = (String)inputData.get("email");
		Utilisateur user = userservice.emailExists(email);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
		//Favories


	//Favories

	//Favories

	@GetMapping("/favories/{id}")
	public List<Long> AfficherFavorie(@PathVariable("id") Long id) {
		return favorieService.findFavorie_ofUser(id);

	}
	@PostMapping("/addfavorie/{idUser}/{idDon}")
	public void AjouterFavorie(@PathVariable("idUser") Long idUser,@PathVariable("idDon")   Long idDon) {
		favorieService.addFavorie(new Favories(idUser,idDon));

	}
	@DeleteMapping("/deleteFavorie/{idUser}/{idDon}")
	public void SuppimerFavorie(@PathVariable("idUser") Long idUser,@PathVariable("idDon")   Long idDon) {
		Long idFav=favorieService.getIdFavorie(idUser,idDon);
		favorieService.deleteFavorie(idFav);

	}


}


