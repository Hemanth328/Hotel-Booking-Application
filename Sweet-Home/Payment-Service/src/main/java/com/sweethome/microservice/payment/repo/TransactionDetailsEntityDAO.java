package com.sweethome.microservice.payment.repo;

import com.sweethome.microservice.payment.entites.TransactionDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailsEntityDAO extends JpaRepository<TransactionDetailsEntity,Integer> {
}
