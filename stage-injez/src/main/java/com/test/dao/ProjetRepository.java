package com.test.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Projet;


public interface ProjetRepository extends JpaRepository<Projet, Integer> {
	
	
@Query("select COALESCE(DATE_FIN_A ,DATE_FIN) from Projet p where  p.ID =:ID ")
	List<Projet> getProjByStructure(@Param("ID") Integer ID,@Param("ID") Date DATE_FIN_A  ,@Param("ID")Date DATE_FIN);


@Query("select d from Projet d where d.ID like CODE_STADE")
	List<Projet> getProjByStade(@Param("CODE_STADE") String CODE_STADE);



//@Query("select P.ID from Projet AS P where P.FLAG_EN_DIFFICULTE := FLAG_EN_DIFFICULTE")
	//List<Projet> getProjBydifficulte(@Param(value="FLAG_EN_DIFFICULTE")Integer FLAG_EN_DIFFICULTE);



}
