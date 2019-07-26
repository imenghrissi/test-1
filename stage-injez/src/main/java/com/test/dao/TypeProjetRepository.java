package com.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Type_Projet;

public interface TypeProjetRepository extends JpaRepository<Type_Projet, String> {
	@Query("select p from Type_Projet p where p.Des =:Des ")
	List<Type_Projet> TypeProjetByIntituler(@Param("Des") String Des);

}
