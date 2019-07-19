package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Activite;


public interface ActiviteRepository extends JpaRepository<Activite, Integer>{

}
