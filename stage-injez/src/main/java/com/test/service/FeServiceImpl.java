package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.FeRepository;
import com.test.entities.Bailleur;
import com.test.entities.FE;

@Service("FeService")
public class FeServiceImpl implements FeService {

	@Autowired
	private FeRepository feRepository;
	@Override
	public FE AddFe(FE fe) {
		// TODO Auto-generated method stub
		return feRepository.save(fe);
	}

	@Override
	public List<FE> getAllFE() {
		// TODO Auto-generated method stub
		return (List<FE>)feRepository.findAll();
	}

	@Override
	public List<FE> findBycodefe(FE fe) {
		// TODO Auto-generated method stub
		return (List<FE>)feRepository.findBycodefe(fe);
	}

	//@Override
	//public Optional<FE> findBycodeBailleur(String Code_Bf) {
		// TODO Auto-generated method stub
		//return (Optional<FE>)feRepository.findById(Code_Bf);
	//}

	@Override
	public Optional<FE> FEByIntituler(String Des_Fe) {
		// TODO Auto-generated method stub
		return (Optional<FE>)feRepository.findById(Des_Fe);
	}

	@Override
	public List<FE> getFEByBailleur(Bailleur bailleur) {
		// TODO Auto-generated method stub
		return (List<FE>)feRepository.getFEByBailleur(bailleur);
	}

}
