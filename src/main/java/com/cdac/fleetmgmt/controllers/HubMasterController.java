package com.cdac.fleetmgmt.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.fleetmgmt.entities.HubMaster;
import com.cdac.fleetmgmt.services.HubMasterService;

@RestController
@RequestMapping("hub")
public class HubMasterController {

	@Autowired
	HubMasterService hubmasterService;
	
	@GetMapping("/getAllHub")
	public List<HubMaster> getAllHubs(){
		List<HubMaster> hublist = new ArrayList<>();
		hublist = hubmasterService.getAllHub();
		return hublist;
	}
}
