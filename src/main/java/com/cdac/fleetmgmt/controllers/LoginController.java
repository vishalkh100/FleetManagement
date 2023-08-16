package com.cdac.fleetmgmt.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.fleetmgmt.dto.UserLoginDTO;

@RestController
@RequestMapping("login")
public class LoginController {
	@PostMapping("/user")
	public String login(@RequestBody UserLoginDTO user) {
		return "";
	}
}
