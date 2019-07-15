package com.test.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.test.entities.Projet;


public interface ProjetService {
	
	public Projet AddProjet(Projet projet);
	public Projet modifProjet(Projet projet);
	public List<Projet>  getAllProjet();
	public Optional<Projet> findById(Integer ID);
	
	public List<Projet> getProjByStructure(Integer ID,Date DATE_FIN_A,Date DATE_FIN);
	public List<Projet> getProjByStade(String CODE_STADE);
	//public List<Projet> getProjBydifficulte(Integer FLAG_EN_DIFFICULTE);

}
