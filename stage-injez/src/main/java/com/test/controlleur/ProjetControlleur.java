package com.test.controlleur;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

	/*
	 * @Autowired //@Qualifier("projetService") public void
	 * setProjetService(ProjetService projetService){
	 * this.projetService=projetService; }
	 */
	@RequestMapping(value="/Addprojet", method=RequestMethod.POST)
	public Projet  saveProjet(@RequestBody Projet projet) {
		return projetService.AddProjet(projet);
		
	}
	@RequestMapping(value="/Listprojet", method=RequestMethod.GET)
	public List<Projet> listProjet() {
		return projetService.getAllProjet();	
		}

	@RequestMapping(value="/Modifprojet", method=RequestMethod.POST)
	public Projet modifProjet(Projet projet) {
		return projetService.ModifProjet(projet);
	}
	
	@RequestMapping("/Project/{id}")
	public Optional<Projet> findById(Integer id) {
		return projetService.findById(id);
	}
	
	@RequestMapping("/ProjByStructure/{id}")
	public List<Projet> getProjByStructureid(Integer structuresid_id) {
		return projetService.getProjByStructure(structuresid_id);
	}
	

	
	@RequestMapping("/projetdiffic/{}")
	  public List<Projet>getProjBydifficulte(Integer FLAG_EN_DIFFICULTE) {
		  return projetService.getProjBydifficulte(FLAG_EN_DIFFICULTE); 
		  }
	 
	
}
