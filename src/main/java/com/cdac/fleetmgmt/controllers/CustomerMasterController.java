package com.cdac.fleetmgmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.fleetmgmt.entities.CustomerMaster;
import com.cdac.fleetmgmt.services.CustomerMasterService;

@RestController
@RequestMapping("customer")
public class CustomerMasterController {
	
	@Autowired
	CustomerMasterService customerMasterService;
	
	@GetMapping("/getAllCustomer")
	public List<CustomerMaster> getAllCustomers() {
		return customerMasterService.getAllCustomer();
	}
	
	@GetMapping("/{id}")
	public CustomerMaster getCustomerById(@PathVariable Long id) {
		System.out.println(id);
		return customerMasterService.getCustomerById(id);
	}
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody CustomerMaster customer) {
		return customerMasterService.addCustomer(customer);
	}
	
	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody CustomerMaster customer) {
		return customerMasterService.updateCustomer(customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return customerMasterService.deleteCustomerById(id);
	}
			
}
