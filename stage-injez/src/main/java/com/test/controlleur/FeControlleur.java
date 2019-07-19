package com.test.controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.FE;
import com.test.service.FeService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")

@RestController
public class FeControlleur {
	@Autowired
	private FeService feservice;
	@RequestMapping(value="/Addfe", method=RequestMethod.POST)
	public FE saveFe(@RequestBody FE fe) {
		return feservice.AddFe(fe);
	
	}
	
	@RequestMapping(value="/Listfe", method=RequestMethod.GET)
	public List<FE> listFe() {
		return feservice.getAllFE();	
		}

	
	@RequestMapping(value="/fe/{Code_Fe}",method = RequestMethod.GET)
	public Optional<FE> findBycodefe(String Code_Fe) {
		return feservice.findBycodefe(Code_Fe);
	}
}
	
