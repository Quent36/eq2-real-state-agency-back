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

import com.inti.entities.Maison;
import com.inti.entities.Maison;
import com.inti.services.interfaces.MaisonService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionMaisons")
public class MaisonController {

	@Autowired
	MaisonService maisonService;
	
	@PostMapping("/maisons")
	public Maison saveMaison(@RequestBody Maison maison) {
		return maisonService.saveMaison(maison);
	}

	@GetMapping("/maisons")
	public List<Maison> findAll() {
		return maisonService.findAll();
	}

	@RequestMapping(value = "/maisons/{idMaison}", method = RequestMethod.GET)
	public Maison findOne(@PathVariable("idMaison") Long id) {
		return maisonService.findOne(id);
	}

	@DeleteMapping("/maisons/{idMaison}")
	public void deleteMaison(@PathVariable("idMaison") Long id) {
		maisonService.deleteMaison(id);
	}
	
	@PutMapping("/maisons/{idMaisons}")
	public Maison updateMaison(@PathVariable("idMaisons") Long id, @RequestBody Maison maison) {
		Maison currentMaison= maisonService.findOne(id);
		currentMaison.setSurface(maison.getSurface());
		currentMaison.setNbPiece(maison.getNbPiece());
		currentMaison.setNbChambre(maison.getNbChambre());
		currentMaison.setGarage(maison.isGarage());
		currentMaison.setJardin(maison.isJardin());
		currentMaison.setCave(maison.isCave());
		currentMaison.setPiscine(maison.isPiscine());
		return maisonService.saveMaison(currentMaison);
	}
}
