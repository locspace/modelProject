package com.locspace.baseProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locspace.baseProject.bean.ViewS6;

public interface S6Dao extends JpaRepository<ViewS6, Long>{

	List<ViewS6> findByLoadstate(int i);
	
	
	
}
