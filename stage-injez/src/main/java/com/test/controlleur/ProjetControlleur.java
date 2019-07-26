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
import com.test.entities.STADE_PROJET;
import com.test.entities.Structure;
import com.test.service.ProjetService;
import com.test.controlleur.ProjetControlleur;

@CrossOrigin(origins = "*")
@RequestMapping("/")

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
	//@GetMapping(value="/Listprojet")
	@RequestMapping(value="/Listprojet", method=RequestMethod.GET)
	public List<Projet> listProjet() {
		return projetService.getAllProjet();	
		}

	@RequestMapping(value="/Modifprojet", method=RequestMethod.POST)
	public Projet modifProjet(Projet projet) {
		return projetService.ModifProjet(projet);
	}
	@RequestMapping(value="/Proj/{Id_projet}",method = RequestMethod.GET)
	//@RequestMapping(value="/Project/{id}", method=RequestMethod.GET)
	public Optional<Projet> findById(Integer Id) {
		return projetService.findById(Id);
	}
	
	@RequestMapping(value ="/projbystructure/{structure}", method=RequestMethod.GET)
	public List<Projet> getProjByStructureid(Structure structure) {
		return projetService.getProjByStructure(structure);
	}
	
	@RequestMapping(value ="/projbystade/{stadeprojet}", method=RequestMethod.GET)
	public List<Projet> getProjByStade(STADE_PROJET stadeprojet) {
		return (List<Projet>)projetService.getProjByStade(stadeprojet);
	}

	
	@RequestMapping("/projetdiffic/{}")
	  public List<Projet>getProjBydifficulte(Integer Flag_En_Difficulte) {
		  return projetService.getProjBydifficulte(Flag_En_Difficulte); 
		  }
	 
	
}
