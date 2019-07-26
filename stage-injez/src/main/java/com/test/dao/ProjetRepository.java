package com.test.dao;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entities.Projet;
import com.test.entities.STADE_PROJET;
import com.test.entities.Structure;
import com.test.entities.Type_Projet;


public interface ProjetRepository extends JpaRepository<Projet, Integer> {
	
	
@Query("select p from Projet p where p.structure =:structure ")
	List<Projet> getProjByStructure(@Param("structure") Structure structure);
//COALESCE(DATE_FIN_A ,DATE_FIN)

@Query("select p from Projet p where p.stadeprojet =:stadeprojet")
	List<Projet> getProjByStade(@Param("stadeprojet") STADE_PROJET stadeprojet);



@Query("select p from Projet p where p.Flag_En_Difficulte =:Flag_En_Difficulte")
	List<Projet> getProjBydifficulte(@Param("Flag_En_Difficulte") Integer Flag_En_Difficulte);

@Query("select p from Projet p where p.typeprojet =:typeprojet ")
List<Projet> getProjByTypeProjet(@Param("typeprojet") Type_Projet typeprojet);

//@Query("select p from Projet p ")
	//List<Projet> getAllProjets(@Param("Id_projet") Integer Id_projet);
}