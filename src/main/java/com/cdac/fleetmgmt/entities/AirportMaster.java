package com.cdac.fleetmgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AirportMaster  {
	@Id
	public long AirporId;
	public String airportName;
	public long cityId;
	public long stateId;
	public long hubId;
	public int airportCode;
	public long getAirporId() {
		return AirporId;
	}
	public void setAirporId(long airporId) {
		AirporId = airporId;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public long getStateId() {
		return stateId;
	}
	public void setStateId(long stateId) {
		this.stateId = stateId;
	}
	public long getHubId() {
		return hubId;
	}
	public void setHubId(long hubId) {
		this.hubId = hubId;
	}
	public int getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(int airportCode) {
		this.airportCode = airportCode;
	}


}
