package com.locspace.baseProject.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locspace.baseProject.bean.Autochart;

@Repository
public interface AutochartDao extends JpaRepository<Autochart, String>{
	
}
