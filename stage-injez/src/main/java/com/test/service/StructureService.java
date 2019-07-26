package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.Structure;
@Service
public interface StructureService {
	public Structure AddStructure(Structure structure);
	public List<Structure>  getAllStructure();
	public Optional<Structure> findByStructure(Integer Id_Structure);
	public List<Structure> StructureByIntituler(String Des);

}
