package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.FE;

public interface FeRepository extends JpaRepository<FE, String> {

}
