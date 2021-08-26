package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.UtilisateurService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionUtilisateurs")
public class UtilisateurController {
	@Autowired
	UtilisateurService utilisateurService;
	
//	@Autowired
//	PasswordEncoder passwordEncoder;

	@PostMapping("/utilisateurs")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
//		Utilisateur user = new Utilisateur();
//		user.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
//		user.setUsername(utilisateur.getUsername());
//		user.setNomUtilisateur(utilisateur.getNomUtilisateur());
//		user.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
//		user.setRoles(utilisateur.getRoles());
//		return utilisateurService.saveUtilisateur(user);
		return utilisateurService.saveUtilisateur(utilisateur);
	}

	@GetMapping("/utilisateurs")
	public List<Utilisateur> findAllUtilisateur() {
		return utilisateurService.findAllUtilisateur();
	}

	@RequestMapping(value = "/utilisateurs/{idUtilisateurs}", method = RequestMethod.GET)
	public Utilisateur findUtilisateursById(@PathVariable("idUtilisateurs") Long id) {
		return utilisateurService.findUtilisateurById(id);
	}
	
	@RequestMapping(value = "/utilisateurs/username/{username}", method = RequestMethod.GET)
	public Utilisateur findUtilisateursByUsername(@PathVariable("username") String username) {
		return utilisateurService.findByUsername(username);
	}

	@DeleteMapping("/utilisateurs/{idUtilisateurs}")
	public void deleteUtilisateur(@PathVariable("idUtilisateurs") Long id) {
		utilisateurService.deleteUtilisateur(id);
	}

	@PutMapping("/users/{idUsers}")
	public Utilisateur updateUtilisateur(@PathVariable("idUsers") Long id_utilisateur,
			@RequestBody Utilisateur utilisateur) {

		Utilisateur currentUser = utilisateurService.findUtilisateurById(id_utilisateur);

		currentUser.setNom(utilisateur.getNom());
		currentUser.setPrenom(utilisateur.getPrenom());
		currentUser.setAge(utilisateur.getAge());
		currentUser.setRole(utilisateur.getRole());
		currentUser.setUsername(utilisateur.getUsername());
		currentUser.setAdresseMail(utilisateur.getAdresseMail());
		currentUser.setPassword(utilisateur.getPassword());

		return utilisateurService.saveUtilisateur(currentUser);

	}

}
