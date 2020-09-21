package com.micda.pfe.eboutique.dao;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.micda.pfe.eboutique.entity.Vente;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public interface VenteRepository extends JpaRepository<Vente, Integer> {
	
	
	
	
	Page<Vente> findById(@RequestParam("id") Integer id, Pageable pageable);
	
	Page<Vente> findByVilleId(@RequestParam("id") Integer villeId, Pageable pageable);
	
	Page<Vente> findByCategorieId(@RequestParam("id") Integer categorieId, Pageable pageable);
	
	Page<Vente> findByBoutiqueId(@RequestParam("id") Integer boutiqueId, Pageable pageable);
	
	Page<Vente> findByTitleVenteContaining(@RequestParam("titre") String titleVente ,Pageable pageable);
	
	
	@Modifying
	@Query(
	  value = 
	    "insert into vente (id_utilisateur, id_categorie, id_modele, id_ville,id_utilisateur_aprouvee,id_boutique,approuve,titre,image,"
	    + "description,prix,vendu,date_creation,date_modification) values (:id_utilisateur,:id_categorie,"
	    + ":id_modele,:id_ville,:id_utilisateur_aprouvee,:id_boutique,:approuve,:titre,:image,:description,:prix,:vendu,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)",
	  nativeQuery = true)
	@Transactional
	void insertUser(@Param("id_utilisateur") int id_utilisateur,@Param("id_categorie") int id_categorie,
			@Param("id_modele") int id_modele,@Param("id_ville") int id_ville,
			@Param("id_utilisateur_aprouvee") int id_utilisateur_aprouvee,@Param("id_boutique") int id_boutique,
			@Param("approuve") Boolean approuve,@Param("titre") String titre,
			@Param("image") String image,@Param("description") String description,
			@Param("prix") int prix,@Param("vendu") Boolean vendu);
//	//:name, :age, :email, :status
	
	
//	@Modifying
//	@Query(
//	  value = 
//	    "insert into ville (nom_ville,date_creation,date_modification) values (:name,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)",
//	  nativeQuery = true)
//	@Transactional
//	void insertUser(@Param("name") String name);
	
	
	
	
}
 