package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        ProducerConsumerImpl producerConsumer = new ProducerConsumerImpl();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 1000 ; i++){
                    producerConsumer.produce();
                }

            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 1000 ; i++){
                    producerConsumer.consume();
                }

            }
        });

        producer.start();
        consumer.start();

        try{
            consumer.join();
            producer.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }
}
