package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Logement;
import com.inti.entities.Offre;
import com.inti.entities.TypeOffre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

	List<Offre> findByTypeOffre(TypeOffre typeoffre);

	List<Offre> findByLogement(Logement logement);
	
	List<Offre> findByPrix(double prix);
	
	@Query(nativeQuery = true, value = "SELECT * FROM offre INNER JOIN logement ON logement_id = logement.id_logement WHERE logement.logement_type LIKE 'maison'")
	public List<Offre> findByMaison();
	
	@Query(nativeQuery = true, value = "SELECT * FROM offre INNER JOIN logement ON logement_id = logement.id_logement WHERE logement.logement_type LIKE 'appartement'")
	public List<Offre> findByAppartement();
}

