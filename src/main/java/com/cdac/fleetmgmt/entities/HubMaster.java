package com.cdac.fleetmgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HubMaster 
{
	public long hubId;
	
	public String hubName;
	
	public String hubAddress;
	
	public long cityId;
	
	public long stateId;
	
	public String hubPhoneNo;
	
	public String weekDay;
	
	public String openingTime;
	
	public String closingTime;

	@Id
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
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	@Override
	public String toString() {
		return "HubMaster [hubId=" + hubId + ", hubName=" + hubName + ", hubAddress=" + hubAddress + ", cityId="
				+ cityId + ", stateId=" + stateId + ", hubPhoneNo=" + hubPhoneNo + ", weekDay=" + weekDay
				+ ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
	}
	
	

}
