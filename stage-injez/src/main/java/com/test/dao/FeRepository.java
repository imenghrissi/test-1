package com.test.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Activite;
import com.test.entities.Bailleur;
import com.test.entities.FE;
import com.test.entities.Projet;
import com.test.entities.STADE_PROJET;


public interface FeRepository extends JpaRepository<FE, String> {

	//@Query("select f from FE f where f.Code_Bf =:Code_Bf ")
	//List<FE> findBycodeBailleur(@Param("Code_Bf") FE Code_Bf);
	
	@Query("select f from FE f where f.Code_Fe =:fe ")
		List<FE> findBycodefe(@Param("fe") FE fe);
	
	@Query("select p from FE p where p.Des_Fe =:Des_Fe ")
	Optional<FE> FEByIntituler(@Param("Des_Fe") String Des_Fe);
	
	@Query("select f from FE f where f.bailleur =:bailleur ")
	List<FE> getFEByBailleur(@Param("bailleur") Bailleur bailleur);

}
