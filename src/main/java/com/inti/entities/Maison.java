package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@DiscriminatorValue(value = "maison")
public class Maison extends Logement implements Serializable{
	
	private boolean jardin;
	private boolean piscine;
	private boolean cave;

}
