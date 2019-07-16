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
	public Optional<Projet> findById(Integer id);
	
	public List<Projet> getProjByStructure(Integer idstructuresid_id);
	public List<Projet> getProjByStade(String CODE_STADE);
	public List<Projet> getProjBydifficulte(Integer FLAG_EN_DIFFICULTE);

}
