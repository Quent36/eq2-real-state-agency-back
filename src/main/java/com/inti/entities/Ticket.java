package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Ticket implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ticket;
	private String question;
	private String reponse;
	private boolean traitement;
	
	@OneToOne
	@JoinColumn(name="offre_id", referencedColumnName = "id_offre")
	private Offre offre;
	
	@ManyToOne
	@JoinColumn(name="utilisateur_id", referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
}
