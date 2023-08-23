package com.cdac.fleetmgmt.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HubMaster
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long hubId;

	private long hubId1;

	private String hubName;
	
	private String hubAddress;
	
	private CityMaster cityId;
	
	private long stateId;
	
	private String hubPhoneNo;
	
	private String weekDay;

	public String openingTime1;

	public String closingTime1;

	private String openingTime;
	
	private String closingTime;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getHubId() {
		return hubId;
	}

	public void setHubId(long hubId) {
		this.hubId = hubId;
	}

	public String getHubName() {
		return hubName;
	}

	public void setHubName(String hubName) {
		this.hubName = hubName;
	}

	public String getHubAddress() {
		return hubAddress;
	}

	public void setHubAddress(String hubAddress) {
		this.hubAddress = hubAddress;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="city_Id", referencedColumnName="cityId")
	public CityMaster getCityId() {
		return cityId;
	}

	public void setCityId(CityMaster cityId) {
		this.cityId = cityId;
	}

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getHubPhoneNo() {
		return hubPhoneNo;
	}

	public void setHubPhoneNo(String hubPhoneNo) {
		this.hubPhoneNo = hubPhoneNo;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	public String getOpeningTime() {
		return openingTime1;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime1 = openingTime;
	}

	public String getClosingTime() {
		return closingTime1;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime1 = closingTime;
	}

	@Override
	public String toString() {
		return "HubMaster [hubId=" + hubId + ", hubName=" + hubName + ", hubAddress=" + hubAddress + ", cityId="
				+ cityId + ", stateId=" + stateId + ", hubPhoneNo=" + hubPhoneNo + ", weekDay=" + weekDay
				+ ", openingTime=" + openingTime1 + ", closingTime=" + closingTime1 + "]";
	}
	
	

}
