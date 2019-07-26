package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.FE;
import com.test.entities.Structure;


@Service
public interface FeService {
	public FE AddFe(FE fe);
	public List<FE>  getAllFE();
	public Optional<FE>findBycodefe(String Code_Fe);
	public Optional<FE>getProjBycodebf(String Code_Bf);
	public Optional<FE> FEByIntituler(String Des_Fe);

	

}
