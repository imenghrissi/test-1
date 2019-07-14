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

import com.test.entities.Projet;
import com.test.service.ProjetService;
import com.test.controlleur.ProjetControlleur;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")

@RestController
public class ProjetControlleur {

	@Autowired
    private ProjetService projetService;

	@RequestMapping(value="/addprojet", method=RequestMethod.POST)
	public Projet  saveProjet(@RequestBody Projet projet) {
		return projetService.AddProjet(projet);
		
	}
	@RequestMapping(value="/listprojet", method=RequestMethod.GET)
	public List<Projet> listProjet() {
		return projetService.getAllProjet();	
		}

	@RequestMapping(value="/modifprojet", method=RequestMethod.POST)
	public Projet modifProjet(Projet projet) {
		return projetService.modifProjet(projet);
	}
	
	@GetMapping("/projets/{id}")
	public Optional<Projet> getProjetById(Integer Id) {
		return projetService.findById(Id);
	}
	

}
