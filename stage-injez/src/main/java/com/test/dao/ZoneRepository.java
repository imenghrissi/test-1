package com.test.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.ZONE;

public interface ZoneRepository extends JpaRepository<ZONE, String> {


}
