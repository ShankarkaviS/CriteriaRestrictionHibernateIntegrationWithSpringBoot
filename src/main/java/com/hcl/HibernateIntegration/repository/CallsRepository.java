package com.hcl.HibernateIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.HibernateIntegration.model.Calls;

@Repository
public interface CallsRepository  extends JpaRepository<Calls,Long> {

}
