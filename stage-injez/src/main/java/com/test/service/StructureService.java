package com.test.service;

import java.util.List;
import java.util.Optional;
import com.test.entities.Structure;

public interface StructureService {
	public Structure AddStructure(Structure structure);
	public List<Structure>  getAllStructure();
	public Optional<Structure> findByStructure(Integer ID);

}
