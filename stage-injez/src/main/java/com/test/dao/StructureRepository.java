package com.test.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Structure;

public interface StructureRepository extends JpaRepository<Structure, Integer> {

	

	//List<Structure> getProjByStructure(Integer iD);

}
