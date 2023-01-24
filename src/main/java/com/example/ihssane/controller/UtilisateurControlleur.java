package com.example.ihssane.controller;

import com.example.ihssane.model.Utilisateur;
import com.example.ihssane.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@CrossOrigin(origins="*")
@RestController
public class UtilisateurControlleur {

	@Autowired
	UtilisateurService userservice;


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
	@GetMapping("/users/{userId}")
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

	@GetMapping("/favorie/{id}")
	public List<Long> AfficherFavorie(@PathVariable("id") Long id) {
		return userservice.getFavorie_User(id);

	}


}


