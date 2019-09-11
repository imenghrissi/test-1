package com.test.controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.entities.Structure;

import com.test.service.StructureService;

@CrossOrigin(origins = "*")
@RequestMapping("/houssem")

@Controller
@ResponseBody
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


	
	@RequestMapping(value="/structur/{Id_Structure}", method=RequestMethod.GET)
	public Optional<Structure> findByStructure(Integer Id_Structure) {
		return structureService.findByStructure(Id_Structure);
	}
	@RequestMapping(value="/struct/{Des}", method=RequestMethod.GET)
	public List<Structure> findbyintitul(String Des) {
		return structureService.StructureByIntituler(Des);
	}

}
