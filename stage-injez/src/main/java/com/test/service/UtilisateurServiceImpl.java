package com.test.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.test.entities.Utilisateur;

public class UtilisateurServiceImpl implements UtilisateurService {

	@Override
	public Optional<Utilisateur> findByLogin(String Login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByLogin(String Login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByEmail(String Mail) {
		// TODO Auto-generated method stub
		return null;
	}



}
