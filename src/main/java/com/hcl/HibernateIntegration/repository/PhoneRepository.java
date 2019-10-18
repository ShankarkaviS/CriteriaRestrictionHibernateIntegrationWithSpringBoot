package com.hcl.HibernateIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.HibernateIntegration.model.Phone;

@Repository
public interface PhoneRepository  extends JpaRepository<Phone,Long> {

}
