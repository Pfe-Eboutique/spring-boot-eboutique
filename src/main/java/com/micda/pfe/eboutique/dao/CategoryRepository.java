package com.micda.pfe.eboutique.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.micda.pfe.eboutique.entity.Categorie;

@CrossOrigin("http://localhost:4200")
public interface CategoryRepository extends JpaRepository<Categorie, Integer> {

}
	