package com.api.cgapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.api.cgapi.model.Transaction;


public interface TransactionRepository extends MongoRepository<Transaction, String> {
}


