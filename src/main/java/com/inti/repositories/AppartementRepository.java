package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Appartement;
import com.inti.entities.Adresse;
import java.util.List;

@Repository
public interface AppartementRepository extends JpaRepository<Appartement, Long>{

}