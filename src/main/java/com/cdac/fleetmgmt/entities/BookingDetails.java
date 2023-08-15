package com.cdac.fleetmgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class BookingDetails {
	@Id
	public long bookingdtalId;   
	public long bookingId;
	public long addonId;
    public double addonRate;
    
	@Override
	public String toString() {
		return "Booking_Detail_Table [bookingdtalId=" + bookingdtalId + ", bookingId=" + bookingId + ", addonId="
				+ addonId + ", addonRate=" + addonRate + "]";
	}
	
    public long getBookingdtalId() {
		return bookingdtalId;
	}
	public void setBookingdtalId(long bookingdtalId) {
		this.bookingdtalId = bookingdtalId;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public long getAddonId() {
		return addonId;
	}
	public void setAddonId(long addonId) {
		this.addonId = addonId;
	}
	public double getAddonRate() {
		return addonRate;
	}
	public void setAddonRate(double addonRate) {
		this.addonRate = addonRate;
	}
	
}
