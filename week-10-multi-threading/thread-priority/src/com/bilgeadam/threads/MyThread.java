package com.bilgeadam.threads;

public class MyThread extends Thread{

    private int count = 0;
    private static final int MAX_COUNT = 100_000_000;
    public static boolean counting = true;

    @Override
    public void run(){
        System.out.println(this.getName() + "is starting.");

        do {
            // Aynı anda girdikleri için değerleri aynı anda artırırlar.
            // count = 5;
            // thread 20 ---> 5 ---> 6
            // thread 21 ---> 5 ---> 6
            this.count++;
            if(this.getName().equals("Thread-2")){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(this.count == MAX_COUNT) counting = false;
        }while (counting && this.count < MAX_COUNT);
        System.out.println(this.getName()+" is counting. Count: "+count);
    }

}
