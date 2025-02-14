package com.hodor;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        for (int i = 0; i < 10; i++) {
            String message = "Notification sent at " + System.currentTimeMillis();
            Future<RecordMetadata> future = producer.send(new ProducerRecord<>("notifications", message));

            try {
                System.out.println("Notification sent : " + message);
                Thread.sleep(5000); // Attendre 5 secondes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        producer.close();
    }
}