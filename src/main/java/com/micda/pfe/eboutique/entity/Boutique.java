package com.micda.pfe.eboutique.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="boutique")
@Getter
@Setter
public class Boutique {
	
	//define beans entities using @GeneratedValue,@Id,@Column,@CreationTimestamp 
	//getters and setters already defined by @Data using Lombok library
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	

	@OneToOne()
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	
	@Column(name = "nom_boutique")
	private String nomBoutique;
	
	@ManyToOne
	@JoinColumn(name="id_ville",nullable = false)
	private Ville ville;
	
	@Column(name = "adresse_boutique")
	private String adresseBoutique;
	
	@Column(name = "description")
	private String descriptionBoutique;
	
	@Column(name = "tel1")
	private String tel1Boutique;
	
	@Column(name = "tel2")
	private String tel2Boutique;
	
	@Column(name = "url_cover")
	private String urlCover;
	
	
	@Column(name = "date_creation")
	@CreationTimestamp
	private Date dateCreation;
	
	@Column(name = "date_modification")
	@UpdateTimestamp
	private Date dateModification;
	
		@OneToMany(cascade = CascadeType.ALL,mappedBy = "boutique")
	private Set<Vente> ventes;
	
	
}
