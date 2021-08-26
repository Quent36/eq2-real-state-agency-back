package com.inti.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Evaluation;
import com.inti.entities.Logement;
import com.inti.entities.Offre;
import com.inti.entities.TypeOffre;
import java.lang.Long;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

	List<Offre> findOffreByTypeOffre(TypeOffre typeOffre);

//	List<Offre> findOffreByDatePublication(Date datePublication);

//	List<Offre> findOffreByEvaluation(Evaluation evaluation);

	//List<Offre> findOffreByLogement(Logement logement);

	List<Offre> findOffreByPrix(double prix);

	List<Offre> findByTypeOffre(TypeOffre typeoffre);

	List<Offre> findByLogement(Logement logement);
	
	List<Offre> findByPrix(double prix);
}
