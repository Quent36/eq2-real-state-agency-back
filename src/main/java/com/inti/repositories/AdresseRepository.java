package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long>{

	List<Adresse> findByVille(String ville);
	
}
