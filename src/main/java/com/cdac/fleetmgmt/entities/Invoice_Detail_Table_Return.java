package com.cdac.fleetmgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Invoice_Detail_Table_Return {
	
	public long invdtlId;
	
	public long invoiceId;
	
	public long addonId;
	
	public double addonAmt;

	public long getInvdtlId() {
		return invdtlId;
	}

	@Override
	public String toString() {
		return "Invoice_Detail_Table_Return [invdtlId=" + invdtlId + ", invoiceId=" + invoiceId + ", addonId=" + addonId
				+ ", addonAmt=" + addonAmt + "]";
	}

		
	
	public void setInvdtlId(long invdtlId) {
		this.invdtlId = invdtlId;
	}

	@Id
	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public long getAddonId() {
		return addonId;
	}

	public void setAddonId(long addonId) {
		this.addonId = addonId;
	}

	public double getAddonAmt() {
		return addonAmt;
	}

	public void setAddonAmt(double addonAmt) {
		this.addonAmt = addonAmt;
	}

}
