package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@DiscriminatorColumn(
	    discriminatorType = DiscriminatorType.STRING,
	    name = "logement_type",
	    columnDefinition = "VARCHAR(10)"
	)
public class Logement implements Serializable{
	
	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_logement")
	protected Long idLogement;
	protected double surface;
	protected int nbPiece;
	protected int nbChambre;
	protected boolean garage;
	
	//Association uml
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adresse_id")
	protected Adresse adresse;

}
