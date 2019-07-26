package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.Projet;
import com.test.entities.STADE_PROJET;
import com.test.entities.Structure;
import com.test.entities.Type_Projet;

@Service
public interface ProjetService {
	
	public Projet AddProjet(Projet projet);
	public Projet ModifProjet(Projet projet);
	public List<Projet>  getAllProjet();
	public Optional<Projet> findById(Integer Id);
	
	public List<Projet> getProjByStructure(Structure structure);
	public List<Projet> getProjByStade(STADE_PROJET stadeprojet);
	public List<Projet> getProjBydifficulte(Integer Flag_En_Difficulte);
	public List<Projet> getProjByTypeProj(Type_Projet typeprojet);

}
