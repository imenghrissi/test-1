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
import com.test.entities.Type_Projet;
import com.test.service.TypeProjetService;

@CrossOrigin(origins = "*")
@RequestMapping("/")

@RestController

public class TypeProjetControlleur {
	@Autowired
	private TypeProjetService typeprojetService;
	
	@RequestMapping(value="/Addtypeproj", method=RequestMethod.POST)
	public Type_Projet  saveType_Projet(@RequestBody Type_Projet typeProjet) {
		return typeprojetService.AddTypeProjet(typeProjet);
	
	}
	//@GetMapping(value="/Listtypeproj")
	@RequestMapping(value="/Listtypeproj", method=RequestMethod.GET)
	public List<Type_Projet> listType_Projets() {
		return typeprojetService.getAllTypeProjet();	
		}

	
	@RequestMapping(value="/typeproj/{Code_Type_Prj}",method = RequestMethod.GET)
	//@RequestMapping(value="/Project/{id}", method=RequestMethod.GET)
	public Optional<Type_Projet> findBycodeTypeProjet(String Code_Type_Prj) {
		return typeprojetService.findBycodeTypeProjet(Code_Type_Prj);
	}
	
	@GetMapping("/typeintiltuler/{Des}")
	public Optional<Type_Projet> findbyintitul(String Des) {
		return (Optional<Type_Projet>)typeprojetService.TypeProjetByIntituler(Des);
	}

}
