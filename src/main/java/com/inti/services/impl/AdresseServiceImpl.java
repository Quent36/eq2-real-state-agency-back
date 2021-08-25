package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Adresse;
import com.inti.repositories.AdresseRepository;
import com.inti.services.interfaces.AdresseService;

@Service
public class AdresseServiceImpl implements AdresseService{

	@Autowired
	AdresseRepository adresseRepository;

	@Override
	public Adresse saveAdresse(Adresse adresse) {
		return adresseRepository.save(adresse);
	}

	@Override
	public List<Adresse> findAll() {
		return adresseRepository.findAll();
	}

	@Override
	public Adresse findOne(Long id) {
		return adresseRepository.findById(id).get();
	}

	@Override
	public void deleteAdresse(Long id) {
		adresseRepository.deleteById(id);
	}
}
