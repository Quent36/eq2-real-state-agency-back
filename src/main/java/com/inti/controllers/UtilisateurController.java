//package com.inti.controllers;
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.inti.entities.Utilisateur;
//import com.inti.services.interfaces.UtilisateurService;
//
//public class UtilisateurController {
//	
//	
//	@PutMapping("/users/{idUsers}")
//	public Utilisateur updateUtilisateur(@PathVariable("id")Long id_utilisateur,@RequestBody Utilisateur utilisateur) {
//		
//		Utilisateur currentUser = UtilisateurService.findOne(id_utilisateur);
//		
//		currentUser.setNom(utilisateur.getNom());
//		currentUser.setPrenom(utilisateur.getPrenom());
//		
//		return UtilisateurService.saveUtilisateur(currentUser);
//		
//	}
//
//}
