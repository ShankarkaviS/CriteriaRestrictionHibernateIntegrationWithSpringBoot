package com.hcl.HibernateIntegration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.hcl.HibernateIntegration.myenum.PhoneType;

@Entity
public class Phone {

	@Id
	private Long id;
	@Column(name="phone_number")
	private String phoneNumber;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;

	@Enumerated(EnumType.STRING)
	@Column(name="phone_type")
	private PhoneType phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public PhoneType getPhone() {
		return phone;
	}

	public void setPhone(PhoneType phone) {
		this.phone = phone;
	}

}
