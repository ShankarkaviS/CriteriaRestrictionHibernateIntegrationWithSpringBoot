package com.hcl.HibernateIntegration.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Persion {
	
	@Id
	@Column(name="persion_id")
	private Long persionId;
	@Column
	private String name;
	@Column
	private String place;
	@Column
	private String job;
	@Column
	private int age;
	@Column
	private int weight;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Long getPersionId() {
		return persionId;
	}
	public void setPersionId(Long persionId) {
		this.persionId = persionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
