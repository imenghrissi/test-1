package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ActiviteRepository;
import com.test.entities.Activite;

@Service("ActiviteService")
public class ActiviteServiceImpl implements ActiviteService {

	@Autowired
	private ActiviteRepository	activiteRepository;
	@Override
	public Activite AddActivite(Activite activite) {
		// TODO Auto-generated method stub
		return activiteRepository.save(activite);
	}

	@Override
	public List<Activite> getAllActivite() {
		// TODO Auto-generated method stub
		return (List<Activite>)activiteRepository.findAll();
	}

	@Override
	public List<Activite> findByCode_Activite(Activite activite ) {
		// TODO Auto-generated method stub
		return (List<Activite>)activiteRepository.findByCode_Activite(activite);
	}

}
