package com.bilgeadam;

import com.bilgeadam.threads.ConsumerRunnable;
import com.bilgeadam.threads.ProducerThread;

public class Main {

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread consumer = new Thread(new ConsumerRunnable(producerConsumer));
        Thread producer = new ProducerThread(producerConsumer);

        producer.start();
        consumer.start();

        try{
            producer.join();
            consumer.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

        System.out.println(Thread.currentThread().getName() + " başarılı bir şekilde sonlandı.");
    }
}
