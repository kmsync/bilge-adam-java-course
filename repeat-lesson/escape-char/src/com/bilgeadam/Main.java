package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        String output = "Burak GÜL\'den gelen not.";
        String output2 = "\"\"";
        String output3 = "Burak GÜL\nMeriç Akgül";
        String output4 = "Burak GÜL";
        String output5 = "Meriç Akgül";
        System.out.println(output);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);

        int a = 5;
        Integer b = a;

        long c = 100;
        Long d = c;

        System.out.println(b);
        System.out.println(d);

        Person person = new Person();
        String s = "Burak GÜL";

        Log log = new Log(LogConstants.MAIN_PAGE);
        Log log1 = new Log("Anasayfa");
    }

    public static void accessMainMethodVariable(){
    }
}
