package com.cdac.fleetmgmt.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookingHeaderReservation 
{
	@Id
	public long bookingId;
	
    public Date bookingDate;
	
	public long custId;
	
	public Date bookingStartDate;
	
	public Date bookingEndDate;
	
	public long carTypeId;
	
	public String custDetail;
	
	public double dailyRate;
	
	public double wklyRate;
	
	public double mnthlyRate;
	
	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public Date getBookingStartDate() {
		return bookingStartDate;
	}

	public void setBookingStartDate(Date bookingStartDate) {
		this.bookingStartDate = bookingStartDate;
	}

	public Date getBookingEndDate() {
		return bookingEndDate;
	}

	public void setBookingEndDate(Date bookingEndDate) {
		this.bookingEndDate = bookingEndDate;
	}

	public long getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(long carTypeId) {
		this.carTypeId = carTypeId;
	}

	public String getCustDetail() {
		return custDetail;
	}

	public void setCustDetail(String custDetail) {
		this.custDetail = custDetail;
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

	public double getMnthlyRate() {
		return mnthlyRate;
	}

	public void setMnthlyRate(double mnthlyRate) {
		this.mnthlyRate = mnthlyRate;
	}

	@Override
	public String toString() {
		return "BookingHeaderReservation [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", custId="
				+ custId + ", bookingStartDate=" + bookingStartDate + ", bookingEndDate=" + bookingEndDate
				+ ", carTypeId=" + carTypeId + ", custDetail=" + custDetail + ", dailyRate=" + dailyRate + ", wklyRate="
				+ wklyRate + ", mnthlyRate=" + mnthlyRate + "]";
	}

	

}
