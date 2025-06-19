package com.app.hospital.Service;

import com.app.hospital.Entity.Billing;
import com.app.hospital.Repository.BillingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private BillingRepo billingRepo;

    public Billing saveBilling(Billing billing) {
        return billingRepo.save(billing);
    }

    public List<Billing> getAllBillings() {
        return billingRepo.findAll();
    }

    public Billing getBillingById(Long id) {
        return billingRepo.findById(id).orElse(null);
    }

    public void deleteBilling(Long id) {
        billingRepo.deleteById(id);
    }
}
