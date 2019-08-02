package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.Activite;
import com.test.entities.Bailleur;
import com.test.entities.FE;
import com.test.entities.STADE_PROJET;
import com.test.entities.Structure;


@Service
public interface FeService {
	public FE AddFe(FE fe);
	public List<FE>  getAllFE();
	public List<FE>findBycodefe(FE fe);
	/*public Optional<FE>findBycodeBailleur(String Code_Bf);*/
	public Optional<FE> FEByIntituler(String Des_Fe);
	public List<FE> getFEByBailleur(Bailleur bailleur);

	

}
