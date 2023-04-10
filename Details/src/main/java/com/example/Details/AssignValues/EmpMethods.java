package com.example.Details.AssignValues;
import java.util.*;
import com.example.Details.Employee.*;
import com.example.Details.service.*;

import org.springframework.web.bind.annotation.*;


@RestController
public class EmpMethods {

private final Service1 s;

public EmpMethods(Service1 s)
{
	this.s=s;
}
@GetMapping("/Employe")
public List<EmpDetails> findAllMethods()
{
	return s.findAllMethods();
}
@GetMapping("/Employe/{id}")
public Optional<EmpDetails> findById(@PathVariable int id)
{
	return s.findById(id);
}
@PostMapping("/Employe")
public EmpDetails saveEmploye(@RequestBody EmpDetails empDetails)
{
	return s.saveEmploye(empDetails);
}
@PutMapping("/Employe")
public EmpDetails updateEmploye(@RequestBody EmpDetails empDetails)
{
	return s.updateEmploye(empDetails);
}
@DeleteMapping("/Employe/{id}")
public void deleteEmp(@PathVariable int id)
{
	s.deleteEmp(id);
}



}
