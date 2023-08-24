package com.cdac.fleetmgmt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.fleetmgmt.repository.HandoverRepository;

@Service
public class HandoverReturnService {
	
	@Autowired
	HandoverRepository handoverRepository;
	
	
}
