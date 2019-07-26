package com.test.controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Activite;
import com.test.entities.FE;
import com.test.service.ActiviteService;

@CrossOrigin(origins = "http://localhost:4200")
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

}
