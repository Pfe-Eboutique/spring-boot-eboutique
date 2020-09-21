package com.micda.pfe.eboutique.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="vente")
@Data
public class Vente {
	
	//define beans entities using @GeneratedValue,@Id,@Column,@CreationTimestamp 
		//getters and setters already defined by @Data using Lombok library
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur",nullable = false)
	private Utilisateur venteUtilisateur;
	
	
	@ManyToOne
	@JoinColumn(name="id_categorie",nullable = false)
	private Categorie categorie;
	
	
	@ManyToOne
	@JoinColumn(name="id_souscategorie",nullable = false)
	private SousCategorie sousCategorie;
	
	@ManyToOne
	@JoinColumn(name="id_modele",nullable = false)
	private Modele venteModele;
	
	@ManyToOne
	@JoinColumn(name="id_ville",nullable = false)
	private Ville ville;
	
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur_aprouvee",nullable = false)
	private Utilisateur venteUtilisateurAprouv;
	
	@ManyToOne
	@JoinColumn(name="id_boutique",nullable = false)
	private Boutique boutique;
	
	@Column(name = "approuve")
	private boolean Apro;
	
	@Column(name = "titre")
	private String titleVente;
	
	@Column(name = "image")
	private String imageUrl;
	
	@Column(name = "description")
	private String Description;
	
	@Column(name = "prix")
	private BigDecimal Prix;
	
	@Column(name = "vendu")
	private boolean Sold;	
	
	@Column(name = "date_creation")
	@CreationTimestamp
	private Date dateCreation;
	
	@Column(name = "date_modification")
	@UpdateTimestamp
	private Date dateModification;

}
