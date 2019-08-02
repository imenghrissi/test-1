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

import com.test.entities.FE;
import com.test.entities.Structure;
import com.test.entities.ZONE;
import com.test.service.ZoneService;

@CrossOrigin(origins = "*")
@RequestMapping("/")

@RestController

public class ZoneControlleur  {
	@Autowired
	private ZoneService zoneservice;
	
	@RequestMapping(value="/Addzone", method=RequestMethod.POST)
	public ZONE  savezone(@RequestBody ZONE zone) {
		return zoneservice.AddZone(zone);
	
	}
	//@GetMapping(value="/Listzone")
	@RequestMapping(value="/Listzone", method=RequestMethod.GET)
	public List<ZONE> listZone() {
		return zoneservice.getAllZone();	
		}

	
	@RequestMapping(value="/zone/{Code_Zone}",method = RequestMethod.GET)
	//@RequestMapping(value="/Project/{id}", method=RequestMethod.GET)
	public List<ZONE> findBycodezone(ZONE zone) {
		return zoneservice.findBycodezone(zone);
	}
	
	@RequestMapping(value="/zon/{Des}",method = RequestMethod.GET)
	public Optional<ZONE> findbyintitul(String Des) {
		return (Optional<ZONE>)zoneservice.ZONEByIntituler(Des);
	}
}
