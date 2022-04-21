package com.bilgeadam.thread3;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                /*try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }*/
                for(int index = 0 ; index < 10000 ; index++){
                    System.out.println("thread1 index: "+index);
                }
                System.out.println("thread1 sonlandı.");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int index = 0 ; index < 10000 ; index++){
                    System.out.println("thread2 index: "+index);
                }
                System.out.println("thread2 sonlandı.");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException);
        }

       /* try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        /*do{
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (thread1.isAlive() || thread2.isAlive());*/
        System.out.println("Main thread sonlandı.");
    }
}
