package com.cdac.fleetmgmt.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AirportMaster implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long AirporId;
	private String airportName;
	private long cityId;
	private long stateId;
	private long hubId;
	private long airportCode;
	private String address;
	private String openingTime;
	private String closingTime;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(AirporId, address, airportCode, airportName, cityId, closingTime, hubId, openingTime,
				stateId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirportMaster other = (AirportMaster) obj;
		return AirporId == other.AirporId && Objects.equals(address, other.address) && airportCode == other.airportCode
				&& Objects.equals(airportName, other.airportName) && cityId == other.cityId
				&& Objects.equals(closingTime, other.closingTime) && hubId == other.hubId
				&& Objects.equals(openingTime, other.openingTime) && stateId == other.stateId;
	}
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
	public long getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(long airportCode) {
		this.airportCode = airportCode;
	}


}
