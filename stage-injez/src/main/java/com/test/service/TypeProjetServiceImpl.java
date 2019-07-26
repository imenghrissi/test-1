package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TypeProjetRepository;
import com.test.entities.Type_Projet;

@Service
public class TypeProjetServiceImpl implements TypeProjetService {

	@Autowired
	private TypeProjetRepository typeprojetRepository;
	@Override
	public Type_Projet AddTypeProjet(Type_Projet typeProjet) {
		// TODO Auto-generated method stub
		return typeprojetRepository.save(typeProjet) ;
	}

	@Override
	public List<Type_Projet> getAllTypeProjet() {
		// TODO Auto-generated method stub
		return (List<Type_Projet>)typeprojetRepository.findAll();
	}

	@Override
	public Optional<Type_Projet> findBycodeTypeProjet(String Code_Type_Prj) {
		// TODO Auto-generated method stub
		return (Optional<Type_Projet>)typeprojetRepository.findById(Code_Type_Prj);
	}

	@Override
	public Optional<Type_Projet> TypeProjetByIntituler(String Des) {
		// TODO Auto-generated method stub
		return (Optional<Type_Projet>)typeprojetRepository.findById(Des);
	}



}
