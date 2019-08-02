package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.BailleurRepository;
import com.test.entities.Bailleur;

@Service
public class BailleurServiceImlp implements BailleurService {

	@Autowired
	private BailleurRepository bailleurRepository;
	@Override
	public Bailleur AddBailleur(Bailleur bailleur) {
		// TODO Auto-generated method stub
		return bailleurRepository.save(bailleur);
	}

	@Override
	public List<Bailleur> getAllBailleur() {
		// TODO Auto-generated method stub
		return (List<Bailleur>)bailleurRepository.findAll();
	}



	@Override
	public Optional<Bailleur> BailleurByIntituler(String Des_Bf) {
		// TODO Auto-generated method stub
		return (Optional<Bailleur>)bailleurRepository.findById(Des_Bf);
	}

}
