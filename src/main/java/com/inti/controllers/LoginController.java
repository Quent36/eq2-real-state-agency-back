package com.inti.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.UtilisateurService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	UtilisateurService utilisateurService;

	@CrossOrigin
	@GetMapping("/users")
	public Utilisateur login(Principal principal) {
		System.out.println("Entree dans login back et username " + principal.getName());
		return utilisateurService.findByUsername(principal.getName());
	}

}
