package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Evaluation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_evaluation;
	private String commentaire;
	
	@OneToMany
	@JoinTable(name="Evaluation_Note", joinColumns = {
			@JoinColumn(name="evaluation_id",referencedColumnName = "id_evaluation")},inverseJoinColumns = {
					@JoinColumn(name="id_note", table ="note",referencedColumnName = "id_note")	})
	private List<Note> note;
}
