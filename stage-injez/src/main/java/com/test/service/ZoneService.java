package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.entities.ZONE;

@Service
public interface ZoneService {
	public ZONE AddZone(ZONE zone);
	public List<ZONE>  getAllZone();
	public Optional<ZONE>findBycodezone(String Code_Zone);

}
