package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.truck_model;

public interface truck_repo  extends JpaRepository<truck_model, Integer>{

	
	truck_model findById(int id);
}
