package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.Type_Projet;

@Service
public interface TypeProjetService {
	public Type_Projet AddTypeProjet(Type_Projet typeProjet);
	public List<Type_Projet>  getAllTypeProjet();
	public Optional<Type_Projet>findBycodeTypeProjet(String Code_Type_Prj);
	public Optional<Type_Projet> TypeProjetByIntituler(String Des);

}
