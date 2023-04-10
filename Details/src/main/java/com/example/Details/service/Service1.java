package com.example.Details.service;

import java.util.*;

import com.example.Details.Employee.EmpDetails;


public interface Service1 {
	
List<EmpDetails> findAllMethods();
Optional<EmpDetails> findById(int id);
EmpDetails saveEmploye(EmpDetails empDetails);
EmpDetails updateEmploye(EmpDetails empDetails);
void deleteEmp(int id);



}
