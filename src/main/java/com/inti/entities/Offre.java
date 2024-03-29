package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Offre implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_offre;
	private double prix;
	@Temporal(TemporalType.DATE)
	private Date datePublication;
	@Lob
	private byte[] image;
	
	@Enumerated(EnumType.STRING)
	private TypeOffre typeOffre;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "Offre_Evaluation", joinColumns = {
			@JoinColumn(name = "offre_id", referencedColumnName = "id_offre") }, inverseJoinColumns = {
					@JoinColumn(name = "id_evaluation", table = "evaluation", referencedColumnName = "id_evaluation") })
	private List<Evaluation> evaluation;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="logement_id", referencedColumnName = "id_logement")
	private Logement logement;

}
