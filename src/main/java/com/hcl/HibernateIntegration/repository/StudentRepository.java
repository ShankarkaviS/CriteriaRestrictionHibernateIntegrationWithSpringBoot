package com.hcl.HibernateIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.HibernateIntegration.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	
}
