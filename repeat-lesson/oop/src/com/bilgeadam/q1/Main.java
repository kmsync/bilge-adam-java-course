package com.bilgeadam.q1;

import java.util.Locale;

public class Main {
    public static void main(String[] args){
        UserManager userManager = new UserManager("Burak","GÜL",1000);
        System.out.println(userManager);

        System.out.println(userManager.getUserFullName());
        System.out.println(userManager.calculateAge());

        int x = 5;

        userManager.printXPlusTwo(x);

        System.out.println(x);

        System.out.println("---------------------------------------------");

        printFullName(userManager);
        System.out.println(userManager);

        String s = "Burak";
        String a = s.toUpperCase();
        System.out.println(s);
        System.out.println(a);

    }

    public static void printFullName(UserManager userManager){
        userManager.setName("dahskghdkahs");
        System.out.println(userManager);
    }
}