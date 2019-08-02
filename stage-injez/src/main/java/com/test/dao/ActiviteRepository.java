package com.test.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Activite;
import com.test.entities.Projet;
import com.test.entities.STADE_PROJET;
import com.test.entities.Structure;

public interface ActiviteRepository extends JpaRepository<Activite, String>{
	
	@Query("select a from Activite a where a.Act_Code_Activite =:activite ")
	List<Activite> findByCode_Activite(@Param("activite") Activite activite);

	@Query("select a from Activite a where a.Des =:Des ")
	Optional<Activite> ActiviteByDes(@Param("Des") String Des);
	
	@Query("select a from Activite a where a.CodeStade =:CodeStade ")
	List<Activite> getActiviteByStade(@Param("CodeStade") STADE_PROJET stadeprojet);

}
