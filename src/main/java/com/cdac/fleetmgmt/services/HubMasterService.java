package com.cdac.fleetmgmt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.fleetmgmt.entities.CityMaster;
import com.cdac.fleetmgmt.entities.HubMaster;
import com.cdac.fleetmgmt.repository.HubMasterRepository;

@Service
public class HubMasterService {

	@Autowired
	HubMasterRepository hubMasterRepository;

	public List<HubMaster> getAllHub() {
		List<HubMaster> hublist = new ArrayList<>();
		hublist = hubMasterRepository.findAll();
		return hublist;
	}

	public String addHub(HubMaster hub) {
		HubMaster ahub = hubMasterRepository.save(hub);
		if (ahub == null) {
			return "Error";
		} else {
			return "Success";
		}
	}

	public String updateHub(HubMaster hub) {
		Optional<HubMaster> hubfound = hubMasterRepository.findById(hub.getHubId());
		if (hubfound.isPresent()) {
			HubMaster foundhub = hubfound.get();
			foundhub.setCityId(hub.getCityId());
			foundhub.setClosingTime(hub.getClosingTime());
			foundhub.setHubAddress(hub.getHubAddress());
			foundhub.setHubName(hub.getHubName());
			foundhub.setHubPhoneNo(hub.getHubPhoneNo());
			foundhub.setOpeningTime(hub.getOpeningTime());
			foundhub.setStateId(hub.getStateId());
			foundhub.setWeekDay(hub.getWeekDay());

			HubMaster hubs = hubMasterRepository.save(foundhub);
			return "Hub Updated Successfully";
		} else {
			return "Hub with given id not found";
		}

	}

	public String deleteHubById(Long id) {
		Optional<HubMaster> hubfound = hubMasterRepository.findById(id);
		if(hubfound==null) {
			return "Error";
		}
		else {
			hubMasterRepository.delete(hubfound.get());
			return "Successfully Deleted";
		}
		
	}

	public List<HubMaster> getHubByCityId(Long cityId) {
		List<HubMaster> hubfound = hubMasterRepository.getHubByCityId(cityId);
			return hubfound;
		
	}
	
	

}
