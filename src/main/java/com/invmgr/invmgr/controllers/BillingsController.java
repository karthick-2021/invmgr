package com.invmgr.invmgr.controllers;

import com.invmgr.invmgr.domain.Inventory;
import com.invmgr.invmgr.domain.Invoice;
import com.invmgr.invmgr.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillingsController {

    @Autowired
    BillingService billingService;
    @PostMapping("/api/greet")
    public String greet(@RequestBody String name) {
        return "வணக்கம் " + name;
    }

    @PostMapping("/api/getHistorical")
    public List<Invoice> getHistorical() {
        return billingService.getAllInvoices();
    }

    @PostMapping("/api/getInventory")
    public List<Inventory> getInventory() {
        return billingService.getInventory();
    }

    @PostMapping("/api/saveBilling")
    public String saveBilling(@RequestBody Invoice invoice) {
        return billingService.save(invoice) ? "Success" : "Failure";
    }

    @GetMapping("/api/test")
    public String test() {
        return "Hello world";
    }
}
