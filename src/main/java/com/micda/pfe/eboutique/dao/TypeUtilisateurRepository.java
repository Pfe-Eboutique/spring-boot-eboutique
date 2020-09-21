package com.micda.pfe.eboutique.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.micda.pfe.eboutique.entity.Type;

//@RepositoryRestResource:manuallyRel collectionResourceRel:name of Json , path: /product_category
@RepositoryRestResource(collectionResourceRel = "typesUtilisateur",path = "type_utilisateur")
@CrossOrigin("http://localhost:4200")
public interface TypeUtilisateurRepository extends JpaRepository<Type, Integer> {

}
