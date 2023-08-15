package com.cdac.fleetmgmt.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarMaster {

	@Id
	public long carId;
	public long carTypeId;
	public double carFuelCapacity;
	public long hubId;
	public boolean isAvailable;
	public Date maintenanceDueDate;
	public double carCurrentFuleStatus;
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public long getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(long carTypeId) {
		this.carTypeId = carTypeId;
	}
	public double getCarFuelCapacity() {
		return carFuelCapacity;
	}
	public void setCarFuelCapacity(double carFuelCapacity) {
		this.carFuelCapacity = carFuelCapacity;
	}
	public long getHubId() {
		return hubId;
	}
	public void setHubId(long hubId) {
		this.hubId = hubId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Date getMaintenanceDueDate() {
		return maintenanceDueDate;
	}
	public void setMaintenanceDueDate(Date maintenanceDueDate) {
		this.maintenanceDueDate = maintenanceDueDate;
	}
	public double getCarCurrentFuleStatus() {
		return carCurrentFuleStatus;
	}
	public void setCarCurrentFuleStatus(double carCurrentFuleStatus) {
		this.carCurrentFuleStatus = carCurrentFuleStatus;
	}
	@Override
	public String toString() {
		return "CarMaster [carId=" + carId + ", carTypeId=" + carTypeId + ", carFuelCapacity=" + carFuelCapacity
				+ ", hubId=" + hubId + ", isAvailable=" + isAvailable + ", maintenanceDueDate=" + maintenanceDueDate
				+ ", carCurrentFuleStatus=" + carCurrentFuleStatus + "]";
	}
	
}
