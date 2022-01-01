package com.invmgr.invmgr.controllers;

import com.invmgr.invmgr.domain.Inventory;
import com.invmgr.invmgr.domain.Invoice;
import com.invmgr.invmgr.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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

    @PostMapping("/api/saveInventory")
    public String saveInventory(@RequestBody Inventory inventory) {
        return billingService.save(inventory) ? "Success" : "Failure";
    }

    @GetMapping("/api/test")
    public String test() {
        return "Hello world";
    }
}
