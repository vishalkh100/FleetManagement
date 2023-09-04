package com.cdac.fleetmgmt.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cdac.fleetmgmt.entities.InvoiceHeaderTableHandover;
import com.cdac.fleetmgmt.services.InvoiceReturnService;

@RestController
@RequestMapping("/invoice")
@CrossOrigin(origins=("*"))
public class InvoiceReturnController 
{
	
	@Autowired
    InvoiceReturnService invoice;  	
	
	@GetMapping("/getInvoice/{id}")
 public Optional<InvoiceHeaderTableHandover> getDetails(@PathVariable long id)
 {
	 return invoice.getDetails(id);
 }

}
