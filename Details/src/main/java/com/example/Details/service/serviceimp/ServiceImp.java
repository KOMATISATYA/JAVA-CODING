package com.example.Details.service.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Details.Employee.EmpDetails;
import com.example.Details.repository.Repo;
import com.example.Details.service.*;

@Service
public class ServiceImp implements Service1{
	
	private final Repo repo;
	public ServiceImp(Repo repo)
	{
		this.repo=repo;
	}
	@Override
	public List<EmpDetails> findAllMethods()
	{
		return repo.findAll();
	}
	@Override
	public Optional<EmpDetails> findById(@PathVariable int id)
	{
		return repo.findById(id);
	}
	@Override
	public EmpDetails saveEmploye(EmpDetails empDetails)
	{
		return repo.save(empDetails);
	}
	@Override
	public EmpDetails updateEmploye(EmpDetails empDetails)
	{
		return repo.save(empDetails);
	}
	public void deleteEmp(@PathVariable int id)
	{
		repo.deleteById(id);
	}


}
