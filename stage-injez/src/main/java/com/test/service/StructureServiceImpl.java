package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StructureRepository;
import com.test.entities.Structure;
@Service
public class StructureServiceImpl implements StructureService {
	
	@Autowired
	private StructureRepository structureRepository;
	@Override
	public Structure AddStructure(Structure structure) {
		// TODO Auto-generated method stub
		return structureRepository.save(structure);
	}

	@Override
	public List<Structure> getAllStade() {
		// TODO Auto-generated method stub
		return (List<Structure>)structureRepository.findAll();
	}

	@Override
	public Optional<Structure> findByStructure(Integer ID) {
		// TODO Auto-generated method stub
		return (Optional<Structure>)structureRepository.findById(ID);
	}

}
