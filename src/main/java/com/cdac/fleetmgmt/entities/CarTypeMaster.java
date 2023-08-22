package com.cdac.fleetmgmt.entities;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarTypeMaster {

	
	@Id
 	@GeneratedValue(strategy=GenerationType.AUTO)
	private long carTypeId;
	private String carTyepName;
	private double dailyRate;
	private long hubId;
	private double wklyRate;
	private double mnthRate;
	private String imagePath;
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
	public long getHubId() {
		return hubId;
	}
	public void setHubId(long hubId) {
		this.hubId = hubId;
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
	@Override
	public String toString() {
		return "CarTypeMaster [carTypeId=" + carTypeId + ", carTyepName=" + carTyepName + ", dailyRate=" + dailyRate
				+ ", hubId=" + hubId + ", wklyRate=" + wklyRate + ", mnthRate=" + mnthRate + ", imagePath=" + imagePath
				+ "]";
	}
}
	