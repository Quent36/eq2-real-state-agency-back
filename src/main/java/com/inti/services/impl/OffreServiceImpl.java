package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public List<Offre> findByTypeOffre(TypeOffre typeOffre) {
		return offreRepository.findByTypeOffre(typeOffre);
	}

	@Override
	public List<Offre> findByLogement(Logement logement) {
		return offreRepository.findByLogement(logement);
	}

	@Override
	public List<Offre> findByPrix(double prix) {
		return offreRepository.findByPrix(prix);
	}

}
