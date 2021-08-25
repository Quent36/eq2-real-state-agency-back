package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Evaluation;
import com.inti.repositories.EvaluationRepository;
import com.inti.services.interfaces.EvaluationService;
@Service
public class EvaluationServiceImpl implements EvaluationService {
@Autowired
EvaluationRepository evaluationRepository;
	@Override
	public Evaluation saveEvaluation(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@Override
	public List<Evaluation> findAllEvaluation() {
		return evaluationRepository.findAll();
	}

	@Override
	public Evaluation findEvaluationById(Long id) {
		return evaluationRepository.findById(id).get();
	}

	@Override
	public void deleteEvaluation(Long id) {
		evaluationRepository.deleteById(id);
	}

}
