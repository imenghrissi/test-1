package com.test.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Activite;
import com.test.entities.STADE_PROJET;

public interface StadeRepository extends JpaRepository<STADE_PROJET, String> {
	
	@Query("select s from STADE_PROJET s where s.Des =:Des ")
	Optional<STADE_PROJET> StadeByDes(@Param("Des") String Des);



}
