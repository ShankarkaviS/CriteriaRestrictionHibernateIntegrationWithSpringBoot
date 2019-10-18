package com.hcl.HibernateIntegration.dto;

public class TotalDTO {
	
	private Long totalStudent;
	private double avgWeight;
	private int maxWeight;
	private int minAge;
	public TotalDTO(Long totalStudent, double avgWeight, int maxWeight, int minAge) {
		super();
		this.totalStudent = totalStudent;
		this.avgWeight = avgWeight;
		this.maxWeight = maxWeight;
		this.minAge = minAge;
	}
	public Long getTotalStudent() {
		return totalStudent;
	}
	public double getAvgWeight() {
		return avgWeight;
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public int getMinAge() {
		return minAge;
	}
}
