package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Adresse;

public interface AdresseService {
	
	Adresse saveAdresse(Adresse adresse);

	List<Adresse> findAll();

	Adresse findOne(Long id);

	void deleteAdresse(Long id);

}
