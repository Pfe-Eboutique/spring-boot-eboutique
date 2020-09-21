package com.micda.pfe.eboutique.dao;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micda.pfe.eboutique.entity.AuthenticationBean;
import com.micda.pfe.eboutique.entity.Utilisateur;

@CrossOrigin("http://localhost:4200")
@RestController
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	
	@Modifying
	@Query(
	  value = 
	    "insert into utilisateur (id_type,id_ville,nom,prenom,tel,email,password,date_creation,date_modification) values (:id_type,:id_ville,:nom,:prenom,:tel,:email,:password,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)",
	  nativeQuery = true)
	@Transactional
	int insertUserClient(@Param("id_type") int id_type,@Param("id_ville") int id_ville,
			@Param("nom") String nom,@Param("prenom") String prenom,
			@Param("tel") String tel,@Param("email") String email,
			@Param("password") String password);
	
	 

}
