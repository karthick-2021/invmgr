package com.invmgr.invmgr.repository;

import com.invmgr.invmgr.domain.Invoice;

import java.util.HashMap;
import java.util.Map;

public class HistoricalRepository {
    public static Map<Integer, Invoice> HISTORICAL_INVOICES = new HashMap<Integer, Invoice>();

    public static Map<Integer, Invoice> getHistoricalInvoices() {
        return HISTORICAL_INVOICES;
    }

    public static void setHistoricalInvoices(Integer invoiceNo, Invoice invoice) {
        System.out.println(HISTORICAL_INVOICES);
        HISTORICAL_INVOICES.put(invoiceNo, invoice);
    }

    public static void clear() {
        HistoricalRepository.clear();
    }
}
