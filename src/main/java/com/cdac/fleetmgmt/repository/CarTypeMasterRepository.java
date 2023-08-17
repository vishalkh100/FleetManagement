package com.cdac.fleetmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.fleetmgmt.entities.CarTypeMaster;

public interface CarTypeMasterRepository extends JpaRepository<CarTypeMaster, Long> {

}
