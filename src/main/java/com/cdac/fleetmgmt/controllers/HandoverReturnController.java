package com.cdac.fleetmgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.fleetmgmt.dto.HandoverDTO;
import com.cdac.fleetmgmt.entities.InvoiceHeaderTableHandover;
import com.cdac.fleetmgmt.services.HandoverReturnService;

@RestController
@RequestMapping("handover")
public class HandoverReturnController {
	
	@Autowired
	private HandoverReturnService handoverReturnService;
	
	@PostMapping("/handover")
	public ResponseEntity<InvoiceHeaderTableHandover> handoverCar(HandoverDTO handoverRequest ) {
		return handoverReturnService.handover(handoverRequest);
	}
	
}
