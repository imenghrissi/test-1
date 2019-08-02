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
import com.test.entities.FE;
import com.test.entities.Type_Projet;
import com.test.service.FeService;

@CrossOrigin(origins = "*")
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
	public List<FE> findBycodefe(FE fe) {
		return feservice.findBycodefe(fe);
	}
	
	//@RequestMapping(value="/fe/{Code_Bf}",method = RequestMethod.GET)
	//@RequestMapping(value="/Project/{id}", method=RequestMethod.GET)
	//public Optional<FE> findBycodebailleur(String Code_Bf) {
		//return feservice.findBycodeBailleur(Code_Bf);
	//}
	@RequestMapping(value="/feintiltuler/{Des_Fes}",method = RequestMethod.GET)
	public Optional<FE> findbyintitul(String Des_Fe) {
		return (Optional<FE>)feservice.FEByIntituler(Des_Fe);
	}
	
	@RequestMapping(value="/febail/{bailleur}",method = RequestMethod.GET)
	public List<FE> getFEByBailleur(Bailleur bailleur) {
		return (List<FE>)feservice.getFEByBailleur(bailleur);
	}
}
	
