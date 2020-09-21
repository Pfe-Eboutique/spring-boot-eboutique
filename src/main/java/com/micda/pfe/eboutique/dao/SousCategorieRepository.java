package com.micda.pfe.eboutique.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


import com.micda.pfe.eboutique.entity.SousCategorie;

@CrossOrigin("http://localhost:4200")
public interface SousCategorieRepository extends JpaRepository<SousCategorie, Integer> {

	Page<SousCategorie> findByCategorieId(@RequestParam("id") Integer categorieId, Pageable pageable);

	
}
