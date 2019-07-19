package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StadeRepository;

import com.test.entities.STADE_PROJET;
@Service("StadeService")
public class StadeServiceImpl implements StadeService {
@Autowired
private StadeRepository stadeRepository;
	@Override
	public STADE_PROJET AddStade(STADE_PROJET Stade_projet) {
		// TODO Auto-generated method stub
		return stadeRepository.save(Stade_projet);
	}

	@Override
	public List<STADE_PROJET> getAllStade() {
		// TODO Auto-generated method stub
		return (List<STADE_PROJET>) stadeRepository.findAll();
	}

	@Override
	public Optional<STADE_PROJET> findBycode(String Code_Stade) {
		// TODO Auto-generated method stub
		return (Optional<STADE_PROJET>)stadeRepository.findById(Code_Stade);
	}

}
