package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        KeyValuePair<String,Integer> keyValuePair = new KeyValuePair<>("Burak",1);
        System.out.println(keyValuePair.getKey());
        System.out.println(keyValuePair.getValue());
        System.out.println(keyValuePair.displayInfo());

        Thread keyThread = new Thread(new MyRunnable());
        Thread valueThread = new Thread(new MyRunnable());

        KeyValuePair<Thread,Thread> threadThreadKeyValuePair = new KeyValuePair<>();
        threadThreadKeyValuePair.setKey(keyThread);
        threadThreadKeyValuePair.setValue(valueThread);
        threadThreadKeyValuePair.getKey().start();
        threadThreadKeyValuePair.getValue().start();
        System.out.println(threadThreadKeyValuePair.displayInfo());
    }
}
