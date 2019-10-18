package com.hcl.HibernateIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.HibernateIntegration.model.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner,Long>{

}
