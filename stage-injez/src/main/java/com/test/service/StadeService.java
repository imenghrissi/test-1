package com.test.service;

import java.util.List;
import java.util.Optional;


import com.test.entities.STADE_PROJET;

public interface StadeService {
	public STADE_PROJET AddStade(STADE_PROJET Stade_projet);
	public List<STADE_PROJET>  getAllStade();
	public Optional<STADE_PROJET> findBycode(String CODE_STADE);
	

}
