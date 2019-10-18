package com.hcl.HibernateIntegration.controller;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.HibernateIntegration.dto.PhoneDTO;
import com.hcl.HibernateIntegration.dto.TotalDTO;
import com.hcl.HibernateIntegration.model.Employee;
import com.hcl.HibernateIntegration.model.Phones;
import com.hcl.HibernateIntegration.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/getByStudent")
	public List<Tuple> getStudent()
	{
	List<Tuple> studentList=studentService.getStudent();
	return studentList;
	}

	@GetMapping("/getByPhones")
	public ResponseEntity<List<Phones>> getPhones()
	{
    List<Phones> phoneList=studentService.getPhones();
	return new ResponseEntity<>(phoneList,HttpStatus.OK);
	
	}

	@GetMapping("/getByEmployee")
	public ResponseEntity<List<Employee>> getEmployee()
	{
    List<Employee> phoneList=studentService.getEmployee();
	return new ResponseEntity<>(phoneList,HttpStatus.OK);
	
	}
	
	@GetMapping("/getTotalValues")
	public ResponseEntity<TotalDTO> getTotalValues()
	{
	TotalDTO totalDto=	studentService.getValues();
	return new ResponseEntity<>(totalDto,HttpStatus.OK);
	
	}
	
	
	@GetMapping("/getAllDependency")
	public ResponseEntity <List<Object>> getAllDependency()
	{
	 List<Object> dtoList=   studentService.getAllDependency();
	return new ResponseEntity<>(dtoList,HttpStatus.OK);
	
	}
	
	
}
