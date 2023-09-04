package com.cdac.fleetmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.fleetmgmt.entities.InvoiceHeaderTableHandover;

public interface InvoiceReturnRepository extends JpaRepository<InvoiceHeaderTableHandover,Long>
{

}
