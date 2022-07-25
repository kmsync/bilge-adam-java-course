package com.bilgeadam;

import java.util.Arrays;

public class Main {
    public String name = "Burak";

    public static void main(String[] args) {
        /**
         * Alltaki bloklar üstteki blokların değişkenlerine erişebilir.
         * Üstteki bloklar alttaki blokların değişkenlerine erişemez.
         */
        Manager manager = new Manager();
        manager.printManagerSurname();
        Main main = new Main();
        main.name = "Merve";
    }
}
