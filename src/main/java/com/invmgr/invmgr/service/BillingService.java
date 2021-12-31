package com.invmgr.invmgr.service;

import com.invmgr.invmgr.domain.Inventory;
import com.invmgr.invmgr.domain.Invoice;
import com.invmgr.invmgr.repository.HistoricalRepository;
import com.invmgr.invmgr.repository.InventoryRepository;
import com.invmgr.invmgr.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class BillingService {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    InventoryRepository inventoryRepository;

    public boolean save(Invoice invoice) {
        return invoiceRepository.save(invoice).invoiceNo > 0 ? true : false;
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public List<Inventory> getInventory() {
        return inventoryRepository.findAll();
    }
}
