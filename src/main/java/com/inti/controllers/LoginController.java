package com.inti.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.UtilisateurService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	UtilisateurService utilisateurService;

	public Utilisateur login(Principal principal) {
		return utilisateurService.findByUsername(principal.getName());
	}

}
