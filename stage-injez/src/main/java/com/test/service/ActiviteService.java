package com.test.service;

import java.util.List;
import java.util.Optional;

import com.test.entities.Activite;

public interface ActiviteService {
	public Activite AddActivite(Activite activite);
	public List<Activite>  getAllActivite();
	public Optional<Activite>findByCode_Activite(String Code_Activite);

}
