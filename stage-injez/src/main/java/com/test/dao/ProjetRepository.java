package com.test.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Projet;


public interface ProjetRepository extends JpaRepository<Projet, Integer> {
	
	
@Query("select p from Projet p where p.id =:structuresid_id")
	List<Projet> getProjByStructureid(@Param("structuresid_id") Integer structuresid_id);
//COALESCE(DATE_FIN_A ,DATE_FIN)

@Query("select p from Projet p where p.id like CODE_STADE")
	List<Projet> getProjByStade(@Param("CODE_STADE") String CODE_STADE);



@Query("select p from Projet p where p.FLAG_EN_DIFFICULTE =:FLAG_EN_DIFFICULTE")
	List<Projet> getProjBydifficulte(@Param("FLAG_EN_DIFFICULTE") Integer FLAG_EN_DIFFICULTE);



}