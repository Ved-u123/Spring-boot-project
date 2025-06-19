package com.app.hospital.Repository;

import com.app.hospital.Entity.Billing;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepo extends JpaRepository<Billing, Long> {

}
