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
import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.EvaluationService;

@CrossOrigin
@RestController
@RequestMapping(value="/gestionEvaluations")
public class EvaluationController {
	@Autowired
	EvaluationService evaluationService;

	@PostMapping("/evaluations")
	public Evaluation saveEvaluation(@RequestBody Evaluation evaluation) {
		return evaluationService.saveEvaluation(evaluation);
	}

	@GetMapping("/evaluations")
	public List<Evaluation> findAllEvaluation() {
		return evaluationService.findAllEvaluation();
	}

	@RequestMapping(value = "/evaluations/{idEvaluations}", method = RequestMethod.GET)
	public Evaluation findEvaluationById(@PathVariable("idEvaluations") Long id) {
		return evaluationService.findEvaluationById(id);
	}

	@DeleteMapping("/evaluations/{idEvaluations}")
	public void deleteEvaluation(@PathVariable("idEvaluations") Long id) {
		evaluationService.deleteEvaluation(id);
	}
//	
//	@PutMapping("/evaluations/{idEvaluations}")
//	public Evaluation updateEvaluation(@PathVariable("id") Long id_evaluation,
//			@RequestBody Evaluation evaluation) {
//
//		Evaluation currentEval = evaluationService.findEvaluationById(id_evaluation);
//
//		currentEval.setCommentaire(evaluation.getCommentaire());
//		
//		
//
//		return evaluationService.saveEvaluation(currentEval);
//
//	}

}
