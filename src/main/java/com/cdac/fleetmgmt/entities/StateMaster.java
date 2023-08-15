package com.cdac.fleetmgmt.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class StateMaster {
	
	@Id
	public long stateId;
	
	public String stateName;

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	
	

}
