package com.micda.pfe.eboutique.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.micda.pfe.eboutique.entity.Marque;

@CrossOrigin("http://localhost:4200")
public interface MarqueRepository extends JpaRepository<Marque, Integer> {
	
	

}
