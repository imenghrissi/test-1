package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ZoneRepository;
import com.test.entities.ZONE;

@Service("ZoneService")
public class ZoneServiceImpl implements ZoneService {

	@Autowired
	private ZoneRepository zoneRepository;
	
	@Override
	public ZONE AddZone(ZONE zone) {
		// TODO Auto-generated method stub
		return zoneRepository.save(zone);
	}

	@Override
	public List<ZONE> getAllZone() {
		// TODO Auto-generated method stub
		return (List<ZONE>)zoneRepository.findAll();
	}



	@Override
	public Optional<ZONE> findBycodezone(String Code_Zone) {
		// TODO Auto-generated method stub
		return (Optional<ZONE>)zoneRepository.findById(Code_Zone);
	}





}
