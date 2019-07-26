package com.test.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.FE;
import com.test.entities.Projet;


public interface FeRepository extends JpaRepository<FE, String> {
	@Query("select Id_projet  from FE f where f.Code_Bf =:Code_Bf ")
	List<Projet> getProjBycodebf(@Param("Code_Bf") FE Code_Bf);
	
	@Query("select p from FE p where p.Des_Fe =:Des_Fe ")
	Optional<FE> FEByIntituler(@Param("Des_Fe") String Des_Fe);

}
