package com.cdac.fleetmgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.fleetmgmt.services.HandoverReturnService;

@RestController
@RequestMapping
public class HandoverReturnController {
	
	@Autowired
	private HandoverReturnService handoverReturnService;
	
	
}
