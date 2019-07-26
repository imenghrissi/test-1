package com.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Activite;


public interface ActiviteRepository extends JpaRepository<Activite, String>{
	@Query("select p from Activite p where p.Act_Code_Activite =:activite ")
	List<Activite> findByCode_Activite(@Param("activite") Activite activite);

}
