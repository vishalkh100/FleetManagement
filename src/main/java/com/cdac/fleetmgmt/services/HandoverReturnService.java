package com.cdac.fleetmgmt.services;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cdac.fleetmgmt.dto.HandoverDTO;
import com.cdac.fleetmgmt.entities.BookingHeaderReservation;
import com.cdac.fleetmgmt.entities.CarMaster;
import com.cdac.fleetmgmt.entities.CarTypeMaster;
import com.cdac.fleetmgmt.entities.InvoiceHeaderTableHandover;
import com.cdac.fleetmgmt.repository.BookingRepository;
import com.cdac.fleetmgmt.repository.CarRepository;
import com.cdac.fleetmgmt.repository.CarTypeMasterRepository;
import com.cdac.fleetmgmt.repository.CustomerMasterRepository;
import com.cdac.fleetmgmt.repository.HandoverRepository;

@Service
public class HandoverReturnService {
	
	@Autowired
	HandoverRepository handoverRepository;
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	CustomerMasterRepository customerRepository;
	
	@Autowired
	CarTypeMasterRepository carTypeRepo;
	
	@Autowired
	CarRepository carRepository;
	
	public ResponseEntity<InvoiceHeaderTableHandover> handover(HandoverDTO handover) {
		InvoiceHeaderTableHandover handoverNew = new InvoiceHeaderTableHandover();
		
		LocalDateTime now = LocalDateTime.now();  
		Instant instant = now.atZone(ZoneId.systemDefault()).toInstant();
		Date date = Date.from(instant);
		
		BookingHeaderReservation booking = bookingRepository.findById(Long.valueOf(handover.getBookingId())).get();
		CarMaster car = carRepository.findById(handover.getCarId()).get();
		CarTypeMaster carType = carTypeRepo.findById(car.getCarTypeId().getCarTypeId()).get();
		
		handoverNew.setBookingId(booking);
		handoverNew.setCarId(car);
		handoverNew.setCustId(booking.getCustomerId());
		handoverNew.setHandoverDate(date);
		handoverNew.setInvoiceDate(date);
		handoverNew.setInvoiceRate(booking.getDailyRate());
		handoverNew.setRentalAmt();
		
		return new ResponseEntity<InvoiceHeaderTableHandover>(handoverNew, HttpStatus.CREATED);
	}
	
}
