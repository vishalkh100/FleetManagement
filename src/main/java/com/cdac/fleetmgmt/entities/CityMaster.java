package com.cdac.fleetmgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class CityMaster {
	@Id
	public long cityId;
	
	public String cityName;
	public long stateId;
	
	public long getCityId() {
		return cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		cityName = cityName;
	}
	public long getStateId() {
		return stateId;
	}
	public void setStateId(long stateId) {
	stateId = stateId;
	}
	
	
	
}


