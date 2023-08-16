package com.cdac.fleetmgmt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.fleetmgmt.entities.HubMaster;
import com.cdac.fleetmgmt.repository.HubMasterRepository;

@Service
public class HubMasterService {

	@Autowired
	HubMasterRepository hubmasterrepository;
	
	public List<HubMaster> getAllHub(){
		List<HubMaster> hublist = new ArrayList<>();
		hublist = hubmasterrepository.findAll();
		return hublist;
	}
}
