package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Appartement;

public interface AppartementService {
	
	Appartement saveAppartement(Appartement appartement);

	List<Appartement> findAll();

	Appartement findOne(Long id);

	void deleteAppartement(Long id);

}
