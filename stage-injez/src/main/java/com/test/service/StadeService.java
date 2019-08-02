package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.Activite;
import com.test.entities.STADE_PROJET;
@Service
public interface StadeService {
	public STADE_PROJET AddStade(STADE_PROJET Stade_projet);
	public List<STADE_PROJET>  getAllStade();
	public Optional<STADE_PROJET> findBycode(String Code_Stade);
	public Optional<STADE_PROJET> StadeByDes(String Des);

	

}
