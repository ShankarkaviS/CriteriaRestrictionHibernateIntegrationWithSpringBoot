package com.hcl.HibernateIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.HibernateIntegration.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

}
