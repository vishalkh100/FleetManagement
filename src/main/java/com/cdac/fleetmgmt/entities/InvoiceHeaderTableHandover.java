package com.cdac.fleetmgmt.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InvoiceHeaderTableHandover {
	
	@Id
	public long invoiceId;
	
	public Date invoiceDate;
	
	public long bookingId;
	
	public long custId;
	
	public Date handoverDate;
	
	public long carId;
	
	public Date returnDate;
	
	public double rentalAmt;
	
	public double totalAddonAmt;
	
	public double totalAmt;
	
	public String customerDetails;
	
	public double invoiceRate;

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public Date getHandoverDate() {
		return handoverDate;
	}

	public void setHandoverDate(Date handoverDate) {
		this.handoverDate = handoverDate;
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public double getRentalAmt() {
		return rentalAmt;
	}

	public void setRentalAmt(double rentalAmt) {
		this.rentalAmt = rentalAmt;
	}

	public double getTotalAddonAmt() {
		return totalAddonAmt;
	}

	public void setTotalAddonAmt(double totalAddonAmt) {
		this.totalAddonAmt = totalAddonAmt;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(String customerDetails) {
		this.customerDetails = customerDetails;
	}

	public double getInvoiceRate() {
		return invoiceRate;
	}

	public void setInvoiceRate(double invoiceRate) {
		this.invoiceRate = invoiceRate;
	}

	@Override
	public String toString() {
		return "Invoice_Header_Table_Handover [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", bookingId="
				+ bookingId + ", custId=" + custId + ", handoverDate=" + handoverDate + ", carId=" + carId
				+ ", returnDate=" + returnDate + ", rentalAmt=" + rentalAmt + ", totalAddonAmt=" + totalAddonAmt
				+ ", totalAmt=" + totalAmt + ", customerDetails=" + customerDetails + ", invoiceRate=" + invoiceRate
				+ "]";
	}
	

}
