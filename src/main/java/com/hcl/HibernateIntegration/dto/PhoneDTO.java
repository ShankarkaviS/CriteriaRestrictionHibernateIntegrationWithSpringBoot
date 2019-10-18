package com.hcl.HibernateIntegration.dto;

import java.util.List;

import com.hcl.HibernateIntegration.model.Calls;
import com.hcl.HibernateIntegration.model.Employee;
import com.hcl.HibernateIntegration.model.Phones;

public class PhoneDTO {
	
	private List<Phones> getPhone;
	private Employee getEmployee;
	private List<Calls> getCalls;
	public PhoneDTO(List<Phones> getPhone, Employee getEmployee, List<Calls> getCalls) {
		super();
		this.getPhone = getPhone;
		this.getEmployee = getEmployee;
		this.getCalls = getCalls;
	}
	public List<Phones> getGetPhone() {
		return getPhone;
	}
	public Employee getGetEmployee() {
		return getEmployee;
	}
	public List<Calls> getGetCalls() {
		return getCalls;
	}
}
