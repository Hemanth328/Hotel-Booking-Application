package com.sweethome.microservice.payment.service;

import com.sweethome.microservice.payment.entites.TransactionDetailsEntity;

public interface PaymentService {

    public TransactionDetailsEntity initiateTransaction(TransactionDetailsEntity transactionDetailsEntity);
    public TransactionDetailsEntity getTransaction(int id);
}
