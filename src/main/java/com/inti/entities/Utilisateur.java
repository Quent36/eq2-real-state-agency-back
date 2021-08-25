package com.inti.entities;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
public class Utilisateur {
	
	private Long idUtilisateur;
	private String nom;
	private String prenom;
	private String age;
	private String adresseMail;
	private String username;
	private String password;
	

}
