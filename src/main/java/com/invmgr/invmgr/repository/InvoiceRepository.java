package com.invmgr.invmgr.repository;

import com.invmgr.invmgr.domain.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<Invoice, Integer> {
}
