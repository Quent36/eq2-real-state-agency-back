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

import com.inti.entities.Evaluation;
import com.inti.entities.Logement;
import com.inti.entities.Offre;
import com.inti.entities.TypeOffre;
import com.inti.services.interfaces.EvaluationService;
import com.inti.services.interfaces.OffreService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionOffres")
public class OffreController {

	@Autowired
	OffreService offreService;
	@Autowired
	EvaluationService evaluationService;

	@PostMapping("/offres")
	public Offre saveOffre(@RequestBody Offre offre) {
		return offreService.saveOffre(offre);
	}

	@GetMapping("/offres")
	public List<Offre> findAll() {
		return offreService.findAllOffre();
	}

	@RequestMapping(value = "/offres/{idOffre}", method = RequestMethod.GET)
	public Offre findOffreById(@PathVariable("idOffre") Long id) {
		return offreService.findOffreById(id);
	}

	@RequestMapping(value = "/offres/{typeOffre}", method = RequestMethod.GET)
	public List<Offre> findByTypeOffre(@PathVariable("typeOffre") TypeOffre typeOffre) {
		return offreService.findByTypeOffre(typeOffre);
	}

	@RequestMapping(value = "/offres/{prix}", method = RequestMethod.GET) // prix
	public List<Offre> findByPrix(@PathVariable("prix") double prix) {
		return offreService.findByPrix(prix);
	}
	
	@RequestMapping(value = "/offres/{logement}", method = RequestMethod.GET) 
	public List<Offre> findByLogement(@PathVariable("logement") Logement logement) {
		return offreService.findByLogement(logement);
	}

	@DeleteMapping("/offres/{idOffre}")
	public void deleteOffre(@PathVariable("idOffre") Long id) {
		offreService.deleteOffre(id);
	}

	@PutMapping("/offres/{idOffre}")
	public Offre updateOffre(@PathVariable("id") Long id_offre, @RequestBody Offre offre,
			@RequestBody Evaluation evaluation) {

		Offre currentOffre = offreService.findOffreById(id_offre);
		// Evaluation currentEvaluation =
		// evaluationService.findEvaluationById(evaluation);
		// currentOffre.setLogement(offre.getLogement());
		currentOffre.setPrix(offre.getPrix());
		currentOffre.setTypeOffre(offre.getTypeOffre());
		currentOffre.setImage(offre.getImage());
		currentOffre.getEvaluation().add(evaluation);

		return offreService.saveOffre(currentOffre);

	}

}
