package com.cdac.fleetmgmt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.fleetmgmt.entities.InvoiceHeaderTableHandover;
import com.cdac.fleetmgmt.repository.InvoiceReturnRepository;

@Service
public class InvoiceReturnService 
{
	
	@Autowired 
	InvoiceReturnRepository invoice;
	
   public Optional<InvoiceHeaderTableHandover> getDetails(Long id)
   {
	   return invoice.findById(id);
   }
	

}
