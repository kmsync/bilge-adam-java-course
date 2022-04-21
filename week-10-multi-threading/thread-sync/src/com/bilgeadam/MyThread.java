package com.bilgeadam;

public class MyThread extends Thread{


    private static final ArrayOperations op = new ArrayOperations();

    @Override
    public void run(){
        System.out.println(this.getName() + " is starting");

        /*
            System.out.println("Toplam: " + op.sum(this.array));
        */
        synchronized (op) {
        for (int i = 0; i< 1000 ; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            op.sum(1);

        }
        }
        System.out.println(this.getName()+ "Toplam: " + op.getSum());
    }
}
