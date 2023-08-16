package com.cdac.fleetmgmt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.fleetmgmt.entities.CustomerMaster;
import com.cdac.fleetmgmt.repository.CustomerMasterRepository;

@Service
public class LoginService {
	
	@Autowired
	CustomerMasterRepository customerMasterRepository;
	
	public CustomerMaster findByEmail(String email) {
		CustomerMaster cust = customerMasterRepository.findByEmail(email);
		return cust;
	}
}
