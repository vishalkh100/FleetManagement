package com.cdac.fleetmgmt.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.fleetmgmt.entities.AirportMaster;
import com.cdac.fleetmgmt.services.AirportMasterService;

@RestController
@RequestMapping("airporthub")
public class AirportMasterController {
   @Autowired
   private AirportMasterService airportMasterService;
   
   @GetMapping("/{airportcode}")
   public Optional<AirportMaster> getAirportByAirportcode(@PathVariable long airportcode)
   {
	return airportMasterService.showAirportlist(airportcode);
   }
   
//   @PostMapping("/addairporthub")
//   public String addairporthub(@RequestBody AirportMaster airportobj)
//   {
//	   return airportMasterService.addAirport(airportobj);
//   }
   
   public  Optional<AirportMaster> getAirportByairportcode(Long airportcode)
   {
	return airportMasterService.showAirportlist(airportcode);
	   
   }
   
   
}
