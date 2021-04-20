package com.locspace.baseProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locspace.baseProject.bean.Auto;
@Repository
public interface AutoDao extends JpaRepository<Auto	, String>{
	List<Auto> findByMyloc(String myloc);
	}
