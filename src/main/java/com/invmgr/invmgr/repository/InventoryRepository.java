package com.invmgr.invmgr.repository;

import com.invmgr.invmgr.domain.Inventory;
import com.invmgr.invmgr.domain.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, Integer> {
}
