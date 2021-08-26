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

import com.inti.entities.Adresse;
import com.inti.services.interfaces.AdresseService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionAdresses")
public class AdresseController {
	
	@Autowired
	AdresseService adresseService;
	
	@PostMapping("/adresses")
	public Adresse saveAdresse(@RequestBody Adresse adresse) {
		return adresseService.saveAdresse(adresse);
	}

	@GetMapping("/adresses")
	public List<Adresse> findAll() {
		return adresseService.findAll();
	}

	@RequestMapping(value = "/adresses/{idAdresses}", method = RequestMethod.GET)
	public Adresse findOne(@PathVariable("idAdresses") Long id) {
		return adresseService.findOne(id);
	}

	@DeleteMapping("/adresses/{idAdresses}")
	public void deleteAdresse(@PathVariable("idAdresses") Long id) {
		adresseService.deleteAdresse(id);
	}
	
	@PutMapping("/adresses/{idAdresses}")
	public Adresse updateAdresse(@PathVariable("idAdresses") Long id, @RequestBody Adresse adresse) {
		Adresse currentAdresse= adresseService.findOne(id);
		currentAdresse.setCodePostal(adresse.getCodePostal());
		currentAdresse.setComplement(adresse.getComplement());
		currentAdresse.setNumero(adresse.getNumero());
		currentAdresse.setRue(adresse.getRue());
		currentAdresse.setVille(adresse.getVille());
		return adresseService.saveAdresse(currentAdresse);
	}
	
	@GetMapping("/adresses/ville/{ville}")
	public Adresse findByVille(@PathVariable("ville") String ville) {
		return adresseService.findByVille(ville);
	}

}
