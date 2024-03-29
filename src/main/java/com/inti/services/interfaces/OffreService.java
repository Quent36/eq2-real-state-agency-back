package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Logement;
import com.inti.entities.Offre;
import com.inti.entities.TypeOffre;

public interface OffreService {

	Offre saveOffre(Offre offre);

	List<Offre> findAllOffre();

	Offre findOffreById(Long id);

	void deleteOffre(Long id);

	List<Offre> findByTypeOffre(TypeOffre typeOffre);

	List<Offre> findByLogement(Logement logement);

	List<Offre> findByPrix(double prix);
	
	List<Offre> findByMaison();
	
	List<Offre> findByAppartement();

}
