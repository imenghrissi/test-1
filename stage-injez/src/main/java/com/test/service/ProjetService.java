package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.Projet;

@Service
public interface ProjetService {
	
	public Projet AddProjet(Projet projet);
	public Projet ModifProjet(Projet projet);
	public List<Projet>  getAllProjet();
	public Optional<Projet> findById(Integer Id_projet);
	
	public List<Projet> getProjByStructure(Integer Id_Structure);
	public List<Projet> getProjByStade(String Code_Stade);
	public List<Projet> getProjBydifficulte(Integer Flag_En_Difficulte);

}
