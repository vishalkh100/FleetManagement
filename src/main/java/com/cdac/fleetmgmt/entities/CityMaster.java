package com.cdac.fleetmgmt.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class CityMaster {
	@Id
	public long cityId;
	
	public String cityName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "state_id", referencedColumnName="stateId")
	public StateMaster stateId;
	
	public long getCityId() {
		return cityId;
	}
	
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public StateMaster getStateId() {
		return stateId;
	}

	public void setStateId(StateMaster stateId) {
		this.stateId = stateId;
	}

	
	
	
	
}


