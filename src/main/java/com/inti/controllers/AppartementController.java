package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Appartement;
import com.inti.services.interfaces.AppartementService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionApparts")
public class AppartementController {
	
	@Autowired
	AppartementService appartementService;

	// @RequestMapping(value = "/apparts", method = RequestMethod.POST)
	@PostMapping("/apparts")
	public Appartement saveAppartement(@RequestBody Appartement appartement) {
		return appartementService.saveAppartement(appartement);
	}

	// @RequestMapping(value = "/apparts", method = RequestMethod.GET)
	@GetMapping("/users")
	public List<Appartement> findAll() {
		return appartementService.findAll();
	}

	@RequestMapping(value = "/apparts/{idApparts}", method = RequestMethod.GET)
	public Appartement findOne(@PathVariable("idApparts") Long id) {
		return appartementService.findOne(id);
	}

	@DeleteMapping("/apparts/{idApparts}")
	public void deleteAppartement(@PathVariable("idApparts") Long id) {
		appartementService.deleteAppartement(id);
	}
}
