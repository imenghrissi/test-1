package com.test.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.test.entities.ZONE;

public interface ZoneRepository extends JpaRepository<ZONE, String> {
	@Query("select z from ZONE z where z.Des =:Des ")
	Optional<ZONE> ZONEByIntituler(@Param("Des") String Des);
	
	@Query("select z from ZONE z where z.Code_Zone =:zone ")
	List<ZONE> findBycodezone(@Param("zone") ZONE zone);

}
