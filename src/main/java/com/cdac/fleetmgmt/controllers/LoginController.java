package com.cdac.fleetmgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.fleetmgmt.dto.UserLoginDTO;
import com.cdac.fleetmgmt.entities.CustomerMaster;
import com.cdac.fleetmgmt.services.LoginService;

@RestController
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/user")
	public String login(@RequestBody UserLoginDTO user) {
		System.out.println(user);
		CustomerMaster foundUser = loginService.findByEmail(user.getUsername());
		if(foundUser!=null) {
			if(foundUser.getPassword().equals(user.getPassword())) {
				return "Success";
			} else {
				return "Wrong Password";
			}
		} else {
			return "Error: User Not Found";
		}
	}
}
