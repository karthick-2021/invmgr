package com.invmgr.invmgr.service;

import com.invmgr.invmgr.domain.Invoice;
import com.invmgr.invmgr.repository.HistoricalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class BillingService {

    public boolean save(Invoice invoice) {
        HistoricalRepository.setHistoricalInvoices(invoice.invoiceNo, invoice);
        return true;
    }

    public List<Invoice> getAllInvoices() {
        return HistoricalRepository.getHistoricalInvoices().entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }
}
