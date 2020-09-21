package com.micda.pfe.eboutique.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="type")
@Data
public class Type {
	
	//define beans entities using @GeneratedValue,@Id,@Column,@CreationTimestamp 
		//getters and setters already defined by @Data using Lombok library
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nom_type")
	private String nomType;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "utilisateurType")
	private Set<Utilisateur> utilisateurs; 
	
	
	@Column(name = "date_creation")
	@CreationTimestamp
	private Date dateCreation;
	
	@Column(name = "date_modification")
	@UpdateTimestamp
	private Date dateModification;

}
