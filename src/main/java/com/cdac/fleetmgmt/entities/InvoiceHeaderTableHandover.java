package com.cdac.fleetmgmt.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class InvoiceHeaderTableHandover {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long invoiceId;
	
	@Temporal(TemporalType.DATE)
	private Date invoiceDate;
	
	private long bookingId;
	
	private long custId;
	
	@Temporal(TemporalType.DATE)
	private Date handoverDate;
	
	private long carId;
	
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	
	private double rentalAmt;
	
	private double totalAddonAmt;
	
	private double totalAmt;
	
	private String customerDetails;
	
	private double invoiceRate;

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
