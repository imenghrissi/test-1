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

import com.test.entities.Bailleur;
import com.test.entities.Type_Projet;
import com.test.entities.ZONE;
import com.test.service.BailleurService;

@CrossOrigin(origins = "*")
@RequestMapping("/")

@RestController
public class BailleurControlleur {
	@Autowired
	private BailleurService bailleurService;
	
	@RequestMapping(value="/AddBailleur", method=RequestMethod.POST)
	public Bailleur  saveBailleur(@RequestBody Bailleur bailleur) {
		return bailleurService.AddBailleur(bailleur);
	
	}
	//@GetMapping(value="/Listbailleur")
	@RequestMapping(value="/ListBailleur", method=RequestMethod.GET)
	public List<Bailleur> listBailleurs() {
		return bailleurService.getAllBailleur();	
		}

	

	
	@RequestMapping(value="/bailleurintiltuler/{Des_Bf}", method=RequestMethod.GET)
	public Optional<Bailleur> findbyintitul(String Des_Bf) {
		return (Optional<Bailleur>)bailleurService.BailleurByIntituler(Des_Bf);
	}

}
