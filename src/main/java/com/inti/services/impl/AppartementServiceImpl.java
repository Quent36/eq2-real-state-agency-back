package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Appartement;
import com.inti.repositories.AppartementRepository;
import com.inti.services.interfaces.AppartementService;

@Service
public class AppartementServiceImpl implements AppartementService{
	
	@Autowired
	AppartementRepository appartementRepository;

	@Override
	public Appartement saveAppartement(Appartement appartement) {
		return appartementRepository.save(appartement);
	}

	@Override
	public List<Appartement> findAll() {
		return appartementRepository.findAll();
	}

	@Override
	public Appartement findOne(Long id) {
		return appartementRepository.findById(id).get();
	}

	@Override
	public void deleteAppartement(Long id) {
		appartementRepository.deleteById(id);
	}

}
