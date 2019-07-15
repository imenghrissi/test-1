package com.test.controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Structure;

import com.test.service.StructureService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")

@RestController
public class StructureControlleur {
	@Autowired
	private StructureService structureService;
	@RequestMapping(value="/addstructure", method=RequestMethod.POST)
	public Structure  saveProjet(@RequestBody Structure structure) {
		return structureService.AddStructure(structure);
		
	}
	@RequestMapping(value="/liststructure", method=RequestMethod.GET)
	public List<Structure> liststructure() {
		return structureService.getAllStructure();	
		}


	
	@GetMapping("/structure/{id}")
	public Optional<Structure> findByStructure(Integer ID) {
		return structureService.findByStructure(ID);
	}

}
