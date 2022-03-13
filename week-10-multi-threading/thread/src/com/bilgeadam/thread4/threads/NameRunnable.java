package com.bilgeadam.thread4.threads;

import java.util.Scanner;

public class NameRunnable implements Runnable{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınız: ");
        String name = scanner.nextLine();
        System.out.println("Bu satır ad bilgisi girilmeden çalışmaz.");
        System.out.println(name);
    }
}
