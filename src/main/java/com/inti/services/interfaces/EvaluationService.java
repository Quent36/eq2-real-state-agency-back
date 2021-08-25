package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Evaluation;

public interface EvaluationService {
	
	Evaluation saveEvaluation(Evaluation evaluation);

	List<Evaluation> findAllEvaluation();

	Evaluation findEvaluationById(Long id);

	void deleteEvaluation(Long id);

}
