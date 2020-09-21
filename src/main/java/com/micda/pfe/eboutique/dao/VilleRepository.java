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

import com.micda.pfe.eboutique.entity.Ville;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "http://localhost:4200")
public interface VilleRepository extends JpaRepository<Ville, Integer> {
	
	Page<Ville> findById(@RequestParam("id") Integer id,Pageable pageable);
	
	
	
	@Modifying
	@Query(
	  value = 
	    "insert into ville (nom_ville,date_creation,date_modification) values (:name,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)",
	  nativeQuery = true)
	@Transactional
	void insertuser(@Param("name") String name);
	

}
