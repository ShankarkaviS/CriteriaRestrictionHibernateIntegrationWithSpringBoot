package com.hcl.HibernateIntegration.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.HibernateIntegration.model.Phones;

@Repository
public interface PhonesRepository  extends JpaRepository<Phones,Long>{

}
