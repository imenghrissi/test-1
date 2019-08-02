package com.test.service;

import java.util.List;
import java.util.Optional;

import com.test.entities.Activite;
import com.test.entities.Bailleur;
import com.test.entities.Projet;
import com.test.entities.STADE_PROJET;
import com.test.entities.Structure;

public interface ActiviteService {
	public Activite AddActivite(Activite activite);
	public List<Activite>  getAllActivite();
	public List<Activite>findByCode_Activite(Activite activite);
	public Optional<Activite> ActiviteByDes(String Des);
	
	public List<Activite> getActiviteByStade(STADE_PROJET stadeprojet);


}
