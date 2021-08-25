package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Maison;
import com.inti.repositories.MaisonRepository;
import com.inti.services.interfaces.MaisonService;

@Service
public class MaisonServiceImpl implements MaisonService{
	
	@Autowired
	MaisonRepository maisonRepository;

	@Override
	public Maison saveMaison(Maison maison) {
		return maisonRepository.save(maison);
	}

	@Override
	public List<Maison> findAll() {
		return maisonRepository.findAll();
	}

	@Override
	public Maison findOne(Long id) {
		return maisonRepository.findById(id).get();
	}

	@Override
	public void deleteMaison(Long id) {
		maisonRepository.deleteById(id);
	}

}
