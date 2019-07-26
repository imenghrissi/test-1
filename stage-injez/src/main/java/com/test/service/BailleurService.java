package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.Bailleur;
import com.test.entities.Structure;
import com.test.entities.ZONE;
@Service
public interface BailleurService {
	public Bailleur AddBailleur(Bailleur bailleur);
	public List<Bailleur>  getAllBailleur();
	public Optional<Bailleur>findBycodeBailleur(String Code_Bf);
	public Optional<Bailleur> BailleurByIntituler(String Des_Bf);


}
