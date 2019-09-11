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

import com.test.entities.Activite;
import com.test.entities.FE;
import com.test.entities.STADE_PROJET;
import com.test.service.ActiviteService;

@CrossOrigin(origins = "*")
@RequestMapping("/")

@RestController
public class ActiviteControlleur {
	@Autowired
	private ActiviteService activiteService;
	@RequestMapping(value="/AddAtivite", method=RequestMethod.POST)
	public Activite saveActivite(@RequestBody Activite activite) {
		return activiteService.AddActivite(activite);
	
	}
	
	@RequestMapping(value="/Listactivite", method=RequestMethod.GET)
	public List<Activite> listActivites() {
		return activiteService.getAllActivite();	
		}

	
	@RequestMapping(value="/activitee/{activite}",method = RequestMethod.GET)
	public List<Activite> findBycodefe(Activite	 activite) {
		return activiteService.findByCode_Activite(activite);
	}
	
	@RequestMapping(value="/act/{Des}",method = RequestMethod.GET)
	public Optional<Activite> ActiviteByDes(String Des) {
		return (Optional<Activite>)activiteService.ActiviteByDes(Des);
	}
	
	@RequestMapping(value="/actst/{CodeStade}",method = RequestMethod.GET)
	public List<Activite> getActiviteByStade(STADE_PROJET stadeprojet) {
		return (List<Activite>)activiteService.getActiviteByStade(stadeprojet);
	}

}
