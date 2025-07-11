package com.jpmc.midascore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumerService {

    @KafkaListener(
        topics = "${kafka.topic.transactions}",
        groupId = "midas-core-group",
        containerFactory = "kafkaListenerContainerFactory"
    )
    public void receiveTransaction(Transaction transaction) {
        // For now, we'll just log the received transaction
        System.out.println("Received transaction: " + transaction);
        // In a real implementation, we would process the transaction here
    }
}