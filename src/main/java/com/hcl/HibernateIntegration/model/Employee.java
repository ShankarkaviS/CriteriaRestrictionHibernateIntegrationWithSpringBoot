package com.hcl.HibernateIntegration.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	@Column(name="emp_id")
	private Long empId;
	@Column(name="emp_name")
	private String empName;
	private String place;
	private String destination;
	private int experience;
	
	@OneToMany(mappedBy="employee", cascade=CascadeType.ALL)
	 List<Phones> phoneList= new ArrayList<>();
	

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public List<Phones> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phones> phoneList) {
		this.phoneList = phoneList;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", place=" + place + ", destination=" + destination
				+ ", experience=" + experience + "]";
	}
	
	
}
