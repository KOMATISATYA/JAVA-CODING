package com.example.Details.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Details.Employee.*;
@Repository
public interface Repo extends JpaRepository<EmpDetails,Integer> {

	
	
}
