package com.inti.services.interfaces;

import java.util.Date;
import java.util.List;

import com.inti.entities.Evaluation;
import com.inti.entities.Logement;
import com.inti.entities.Offre;
import com.inti.entities.TypeOffre;

public interface OffreService {

	Offre saveOffre(Offre offre);

	List<Offre> findAllOffre();

	Offre findOffreById(Long id);

	void deleteOffre(Long id);

	List<Offre> findOffreByTypeOffre(TypeOffre typeOffre);

	List<Offre> findOffreByDatePublication(Date datePublication);

	List<Offre> findOffreByEvaluation(Evaluation evaluation);

	List<Offre> findOffreByLogement(Logement logement);

	List<Offre> findOffreByPrix(double prix);

}
