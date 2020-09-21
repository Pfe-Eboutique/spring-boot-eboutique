package com.micda.pfe.eboutique.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


import com.micda.pfe.eboutique.entity.Modele;

@CrossOrigin("http://localhost:4200")
public interface ModeleRepository extends JpaRepository<Modele, Integer> {
	
	Page<Modele> findByMarqueId(@RequestParam("id") Integer marqueId, Pageable pageable);

}
