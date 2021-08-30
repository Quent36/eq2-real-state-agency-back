package com.inti.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_utilisateur;
	private String nom;
	private String prenom;
	private String age;
	private String adresseMail;
	@Column(unique = true)
	private String username;
	private String password;
	@Builder.Default
	private boolean enabled = true;
	
	@ManyToOne()
	@JoinColumn(name="role_id", referencedColumnName = "id_role")
	private Role role;

	public Utilisateur(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
}
