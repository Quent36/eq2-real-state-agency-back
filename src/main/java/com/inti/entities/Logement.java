package com.inti.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//import com.inti.controllers.DiscriminatorValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
	    columnDefinition = "VARCHAR(255)"
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
	protected String typeLogement; //= getDiscriminatorValue();
	
	//Association uml
	@OneToOne(cascade=CascadeType.ALL) //fetch = FetchType.LAZY, 
	@JoinColumn(name = "adresse_id")
	protected Adresse adresse;
	
	
	/*
	public String getDiscriminatorValue() {
		return this.getClass().getAnnotation(DiscriminatorValue.class).value();
	}*/
}
