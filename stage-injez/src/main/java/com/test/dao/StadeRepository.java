package com.test.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.STADE_PROJET;

public interface StadeRepository extends JpaRepository<STADE_PROJET, String> {



}
