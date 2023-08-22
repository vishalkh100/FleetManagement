package com.cdac.fleetmgmt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.fleetmgmt.entities.CarTypeMaster;
import com.cdac.fleetmgmt.entities.CityMaster;
import com.cdac.fleetmgmt.repository.CarTypeMasterRepository;
@Service
public class CarTypeMasterServiceImpl implements CarTypeMasterServiceInterface {
	
	@Autowired
	private CarTypeMasterRepository carTypeMasterRepository;

	@Override
	public List<CarTypeMaster>getAllCarTypesByHubId(Long hubId) {
		return carTypeMasterRepository.findAllByHubId(hubId);
	}

	@Override
	public String addCarType(CarTypeMaster carType) {
		CarTypeMaster carType1;
		try {
			carType1 = carTypeMasterRepository.save(carType);
		} catch (Exception e) {
			return e.getCause().toString();
		}
		
		if(carType1==null) {
			return "Error";
		} else {
			 return "Success";
		}

	}
}
