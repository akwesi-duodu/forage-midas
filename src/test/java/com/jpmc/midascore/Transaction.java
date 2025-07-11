package com.jpmc.midascore;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jpmc.midascore.Transaction;

import jakarta.transaction.Transactional;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    private long senderId;
    private long recipientId;
    private float amount;

    public Transaction() {
    }

    public Transaction(long senderId, long recipientId, float amount) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(long recipientId) {
        this.recipientId = recipientId;
    }
        private double incentiveAmount;

    //getter and setter
    public double getIncentiveAmount() { return incentiveAmount; }
    public void setIncentiveAmount(double incentiveAmount) { this.incentiveAmount = incentiveAmount; }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction {senderId=" + senderId + ", recipientId=" + recipientId + ", amount=" + amount + "}";
    }
    @Service
@Transactional
public class TransactionProcessor {

    public TransactionProcessor(UserRepository userRepository, IncentiveService incentiveService) {
       // this.userRepository = userRepository;
        //this.incentiveService = incentiveService;
    }}
}
