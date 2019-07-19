package com.test.dao;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Projet;


public interface ProjetRepository extends JpaRepository<Projet, Integer> {
	
	
@Query("select p from Projet p where p.Id_projet =:Id_Structure ")
	List<Projet> getProjByStructureid(@Param("Id_Structure") Integer Id_Structure);
//COALESCE(DATE_FIN_A ,DATE_FIN)

@Query("select p from Projet p where p.Id_projet =:Code_Stade")
	List<Projet> getProjByStade(@Param("Code_Stade") String Code_Stade);



@Query("select p from Projet p where p.Flag_En_Difficulte =:Flag_En_Difficulte")
	List<Projet> getProjBydifficulte(@Param("Flag_En_Difficulte") Integer Flag_En_Difficulte);

//@Query("select p from Projet p ")
	//List<Projet> getAllProjets(@Param("Id_projet") Integer Id_projet);
}