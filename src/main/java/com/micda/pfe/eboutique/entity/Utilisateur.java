package com.micda.pfe.eboutique.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="utilisateur")
@Getter
@Setter
public class Utilisateur {
	
	//define beans entities using @GeneratedValue,@Id,@Column,@CreationTimestamp,@ManyToOne
		//getters and setters already defined by @Data using Lombok library
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_type",nullable = false)
	private Type utilisateurType;
	
	@ManyToOne
	@JoinColumn(name="id_ville",nullable = false)
	private Ville utilisateurVille;
	
	@Column(name = "nom")
	private String Nom;
	
	@Column(name = "prenom")
	private String Prenom;
	
	@Column(name = "tel")
	private String Tel;
	
	@Column(name = "email")
	private String Email;
	
	@Column(name = "password")
	private String Password;	
	
	@Column(name = "date_creation")
	@CreationTimestamp
	private Date dateCreation;
	
	@Column(name = "date_modification")
	@UpdateTimestamp
	private Date dateModification;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "venteUtilisateur")
	private Set<Vente> ventes;

}
