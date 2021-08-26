package com.inti.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Evaluation;
import com.inti.entities.Logement;
import com.inti.entities.Offre;
import com.inti.entities.TypeOffre;
import com.inti.repositories.OffreRepository;
import com.inti.services.interfaces.OffreService;

@Service
public class OffreServiceImpl implements OffreService {

	@Autowired
	OffreRepository offreRepository;

	@Override
	public Offre saveOffre(Offre offre) {
		return offreRepository.save(offre);
	}

	@Override
	public List<Offre> findAllOffre() {
		return offreRepository.findAll();
	}

	@Override
	public Offre findOffreById(Long id) {
		return offreRepository.findById(id).get();
	}

	@Override
	public void deleteOffre(Long id) {
		offreRepository.deleteById(id);
	}

	@Override
	public List<Offre> findOffreByTypeOffre(TypeOffre typeOffre) {
		return offreRepository.findOffreByTypeOffre(typeOffre);
	}

	@Override
	public List<Offre> findOffreByDatePublication(Date datePublication) {
		return offreRepository.findOffreByDatePublication(datePublication);
	}

	@Override
	public List<Offre> findOffreByEvaluation(Evaluation evaluation) {
		return offreRepository.findOffreByEvaluation(evaluation);
	}

	@Override
	public List<Offre> findOffreByLogement(Logement logement) {
		return offreRepository.findOffreByLogement(logement);
	}

	@Override
	public List<Offre> findOffreByPrix(double prix) {
		return offreRepository.findOffreByPrix(prix);
	}

}