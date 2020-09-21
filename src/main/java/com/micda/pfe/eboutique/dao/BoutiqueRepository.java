package com.micda.pfe.eboutique.dao;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.micda.pfe.eboutique.entity.Boutique;
import com.micda.pfe.eboutique.entity.Vente;




@CrossOrigin("http://localhost:4200")
public interface BoutiqueRepository extends JpaRepository<Boutique, Integer> {
	
	Page<Boutique> findById(@RequestParam("id") Integer id, Pageable pageable);
	
	Page<Boutique> findByVilleId(@RequestParam("id") Integer villeId, Pageable pageable);
	
	Page<Boutique> findByUtilisateurId(@RequestParam("id") Integer utilisateurId, Pageable pageable);

	//find by keyword
	Page<Boutique> findByNomBoutiqueContaining(@RequestParam("nom_boutique") String nomBoutique ,Pageable pageable);
	
	
	
	
	@Modifying
	@Query(
	  value = 
	    "insert into boutique (id_utilisateur,id_ville,nom_boutique,adresse_boutique,description,tel1,tel2,url_cover,date_creation,date_modification) values "
	    + "(:id_utilisateur,:id_ville,:nom_boutique,:adresse_boutique,:description,:tel1,:tel2,:url_cover,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)",
	  nativeQuery = true)
	@Transactional
	int insertBoutique(@Param("id_utilisateur") int id_utilisateur,@Param("id_ville") int id_ville,
			@Param("nom_boutique") String nom_boutique,@Param("adresse_boutique") String adresse_boutique,
			@Param("description") String description,@Param("tel1") String tel1,
			@Param("tel2") String tel2,@Param("url_cover") String url_cover);
}
