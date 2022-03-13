package com.bilgeadam.thread4.threads;

import java.util.Scanner;

public class SearchThread extends Thread{
    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search edilecek kelime: ");
        String keyword = scanner.nextLine();
        System.out.println("search inputu girildikten sonra çalışacak.");
        System.out.println(keyword);
    }
}
