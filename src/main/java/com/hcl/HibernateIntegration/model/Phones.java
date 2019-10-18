package com.hcl.HibernateIntegration.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.hcl.HibernateIntegration.myenum.PhoneType;

@Entity
public class Phones {
	
	@Id
	@Column(name="phone_id")
	private Long phoneId;
	@Column(name="phone_name")
	private String pName;
	@Column(name="phone_number")
	private String pNumber;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="emp_id")
	private Employee employee;

	@OneToMany(mappedBy="phoness",cascade=CascadeType.ALL)
	public List<Calls> callList= new ArrayList<>();
	
	@Enumerated(EnumType.STRING)
	@Column(name="phone_type")
	public PhoneType phoneType;
	
	public Long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public PhoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	public List<Calls> getCallList() {
		return callList;
	}
	public void setCallList(List<Calls> callList) {
		this.callList = callList;
	}
	
	
}
