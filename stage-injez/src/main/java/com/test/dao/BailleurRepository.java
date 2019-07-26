package com.test.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Bailleur;
import com.test.entities.Structure;

public interface BailleurRepository extends JpaRepository<Bailleur,String> {
	@Query("select p from Bailleur p where p.Des_Bf =:Des_Bf ")
	Optional<Structure> BailleurByIntituler(@Param("Des_Bf") String Des_Bf);

}
