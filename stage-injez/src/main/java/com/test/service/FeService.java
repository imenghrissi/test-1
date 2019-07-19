package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.FE;


@Service
public interface FeService {
	public FE AddFe(FE fe);
	public List<FE>  getAllFE();
	public Optional<FE>findBycodefe(String Code_Fe);

}
