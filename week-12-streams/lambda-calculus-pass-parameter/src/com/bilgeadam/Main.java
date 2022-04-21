package com.bilgeadam;

public class Main {

    static String changeStr(StringFunc stringChanger, String value){
        return stringChanger.func(value);
    }

    public static void main(String[] args) {

        StringFunc reverse = (s -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        });

        System.out.println(reverse.func("Burak"));

        System.out.println(changeStr((s) -> s.replace("k","a"),"Burak"));

        System.out.println(changeStr(reverse,"Burak"));
    }
}
