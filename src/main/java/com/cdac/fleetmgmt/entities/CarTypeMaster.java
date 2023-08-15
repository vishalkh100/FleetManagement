package com.cdac.fleetmgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarTypeMaster {

	@Id
	public long carTypeId;
	public String carTyepName;
	public double dailyRate;
	public double wklyRate;
	public double mnthRate;
	public String imagePath;
	public long hubId;
	public long getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(long carTypeId) {
		this.carTypeId = carTypeId;
	}
	public String getCarTyepName() {
		return carTyepName;
	}
	public void setCarTyepName(String carTyepName) {
		this.carTyepName = carTyepName;
	}
	public double getDailyRate() {
		return dailyRate;
	}
	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}
	public double getWklyRate() {
		return wklyRate;
	}
	public void setWklyRate(double wklyRate) {
		this.wklyRate = wklyRate;
	}
	public double getMnthRate() {
		return mnthRate;
	}
	public void setMnthRate(double mnthRate) {
		this.mnthRate = mnthRate;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public long getHubId() {
		return hubId;
	}
	public void setHubId(long hubId) {
		this.hubId = hubId;
	}
	@Override
	public String toString() {
		return "CarTypeMaster [carTypeId=" + carTypeId + ", carTyepName=" + carTyepName + ", dailyRate=" + dailyRate
				+ ", wklyRate=" + wklyRate + ", mnthRate=" + mnthRate + ", imagePath=" + imagePath + ", hubId=" + hubId
				+ "]";
	}
	
	
}
