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
import com.test.entities.STADE_PROJET;
import com.test.entities.ZONE;
import com.test.service.StadeService;

@CrossOrigin(origins = "*")
@RequestMapping("/")

@Controller
@ResponseBody
public class StadeControlleur {
	@Autowired
	private StadeService stadeService;
	@RequestMapping(value="/addstade", method=RequestMethod.POST)
	public STADE_PROJET  saveProjet(@RequestBody STADE_PROJET stadeProjet) {
		return stadeService.AddStade(stadeProjet);
		
	}
	@RequestMapping(value="/liststade", method=RequestMethod.GET)
	public List<STADE_PROJET> liststade() {
		return stadeService.getAllStade();	
		}


	
	@RequestMapping(value = "/stades/{Code_Stade}", method=RequestMethod.GET)
	public Optional<STADE_PROJET> findBycode(String Code_Stade) {
		return stadeService.findBycode(Code_Stade);
	}
	
	@RequestMapping(value ="/sta/{Des}", method=RequestMethod.GET)
	public Optional<STADE_PROJET> StadeByDes(String Des) {
		return (Optional<STADE_PROJET>)stadeService.StadeByDes(Des);
	}
	

}
