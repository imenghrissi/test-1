package com.test.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Projet;


public interface ProjetRepository extends JpaRepository<Projet, Integer> {
	
	
@Query("select p from Projet p where p.ID =:ID" + "AND COALESCE(DATE_FIN_A ,DATE_FIN")
	List<Projet> getProjByStructure(@Param("ID") Integer ID,@Param("ID") Date DATE_FIN_A  ,@Param("ID")Date DATE_FIN);


//@Query("select p from Projet p , STADE_PROJET s where s.cODE_STADE =:p.stadeid")
	//List<Projet> getProjByStade(@Param("cODE_STADE")String cODE_STADE);



}
