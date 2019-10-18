package com.hcl.HibernateIntegration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Calls {
	@Id
	@Column(name="call_id")
	private Long callId;
	private double duration;
	private Date date= new Date();
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="phone_id")
	 public Phones phoness;
	public Long getCallId() {
		return callId;
	}
	public void setCallId(Long callId) {
		this.callId = callId;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Phones getPhoness() {
		return phoness;
	}
	public void setPhoness(Phones phoness) {
		this.phoness = phoness;
	}
	
	
	
}
