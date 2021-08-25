package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Maison;

public interface MaisonService {

	Maison saveMaison(Maison maison);

	List<Maison> findAll();

	Maison findOne(Long id);

	void deleteMaison(Long id);
}
