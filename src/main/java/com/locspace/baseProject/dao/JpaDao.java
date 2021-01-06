package com.locspace.baseProject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locspace.baseProject.bean.JpaData;

@Repository
public interface JpaDao extends JpaRepository<JpaData, Long>{
	
	Optional<JpaData> findByName(String name);
	
	

}
