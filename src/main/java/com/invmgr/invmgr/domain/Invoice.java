package com.invmgr.invmgr.domain;

import java.util.Date;
import java.util.List;

public class Invoice {
    public int invoiceNo;
    public int custMobile;
    public String custName;
    public String custEmail;
    public Date date;
    public List<Billings> billings;
    public String amtInWords;
    public int grandTotal;

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public int getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(int custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Billings> getBillings() {
        return billings;
    }

    public void setBillings(List<Billings> billings) {
        this.billings = billings;
    }

    public String getAmtInWords() {
        return amtInWords;
    }

    public void setAmtInWords(String amtInWords) {
        this.amtInWords = amtInWords;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }
}
