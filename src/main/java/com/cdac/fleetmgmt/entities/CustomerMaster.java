package com.cdac.fleetmgmt.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long customerId;
	public String firstName;
	public String lastName;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String pin;
	public String phone;
	public String email;
	public String creditCardType;
	public String drivingLicence;
	public String dlIssuedBy;
	public Date dlValidThrough;
	public String passportNumber;
	public String passportIssuedBy;
	public Date passportValidUpto;
	public Date dob;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreditCardType() {
		return creditCardType;
	}
	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public String getDlIssuedBy() {
		return dlIssuedBy;
	}
	public void setDlIssuedBy(String dlIssuedBy) {
		this.dlIssuedBy = dlIssuedBy;
	}
	public Date getDlValidThrough() {
		return dlValidThrough;
	}
	public void setDlValidThrough(Date dlValidThrough) {
		this.dlValidThrough = dlValidThrough;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getPassportIssuedBy() {
		return passportIssuedBy;
	}
	public void setPassportIssuedBy(String passportIssuedBy) {
		this.passportIssuedBy = passportIssuedBy;
	}
	public Date getPassportValidUpto() {
		return passportValidUpto;
	}
	public void setPassportValidUpto(Date passportValidUpto) {
		this.passportValidUpto = passportValidUpto;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "CustomerMaster [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", pin="
				+ pin + ", phone=" + phone + ", email=" + email + ", creditCardType=" + creditCardType
				+ ", drivingLicence=" + drivingLicence + ", dlIssuedBy=" + dlIssuedBy + ", dlValidThrough="
				+ dlValidThrough + ", passportNumber=" + passportNumber + ", passportIssuedBy=" + passportIssuedBy
				+ ", passportValidUpto=" + passportValidUpto + ", dob=" + dob + "]";
	}
	
	
	
}
