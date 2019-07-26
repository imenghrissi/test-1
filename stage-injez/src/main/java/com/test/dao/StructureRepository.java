package com.test.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Structure;

public interface StructureRepository extends JpaRepository<Structure, Integer> {
	@Query("select p from Structure p where p.Des =:Des ")
	List<Structure> StructureByIntituler(@Param("Des") String Des);


	



}
