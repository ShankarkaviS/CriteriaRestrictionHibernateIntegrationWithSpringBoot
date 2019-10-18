package com.hcl.HibernateIntegration.service;

import java.util.List;

import javax.persistence.Tuple;

import com.hcl.HibernateIntegration.dto.PhoneDTO;
import com.hcl.HibernateIntegration.dto.TotalDTO;
import com.hcl.HibernateIntegration.model.Employee;
import com.hcl.HibernateIntegration.model.Phones;


public interface StudentService {

	public List<Tuple> getStudent();
	
	public List<Phones> getPhones();
	
	public List<Employee> getEmployee();
	
	public Long totalStudent();
	
	public TotalDTO getValues();
	
	public List<Object> getAllDependency();
	
}
