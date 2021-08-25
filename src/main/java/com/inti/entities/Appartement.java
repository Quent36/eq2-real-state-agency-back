package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@DiscriminatorValue(value = "appartement")
public class Appartement extends Logement implements Serializable{
	
	private int etage;
	private boolean ascenseur;
	private boolean terrasse;

}
