package com.cdac.fleetmgmt.entities;
import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class StateMaster implements Serializable {
	private static final long serialVersionUId = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stateId;
	
	private String stateName;

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

	@Override
	public String toString() {
		return "StateMaster [stateId=" + stateId + ", stateName=" + stateName + ", getStateId()=" + getStateId()
				+ ", getStateName()=" + getStateName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(stateId, stateName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateMaster other = (StateMaster) obj;
		return stateId == other.stateId && Objects.equals(stateName, other.stateName);
	}

	
	
	

}
