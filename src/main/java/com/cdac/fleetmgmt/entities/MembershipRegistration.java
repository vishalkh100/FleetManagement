package com.cdac.fleetmgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MembershipRegistration {
	 public long memregId;
     public long custId;
     public long carTypeId;
     public String password;
     
     @Override
	public String toString() {
		return "Membership_Registration_Table [memregId=" + memregId + ", custId=" + custId + ", carTypeId=" + carTypeId
				+ ", password=" + password + "]";
	}
	@Id
	public long getMemregId() {
		return memregId;
	}
	public void setMemregId(long memregId) {
		this.memregId = memregId;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(long carTypeId) {
		this.carTypeId = carTypeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
}
