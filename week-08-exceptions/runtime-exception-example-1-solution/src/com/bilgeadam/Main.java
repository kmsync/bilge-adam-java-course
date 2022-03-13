package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        try{
            Runtime runtime = new Runtime();
            runtime.stringList.add("Bu hataya sebep olacak");
        }catch (NullPointerException e){
            System.exit(1);
        }
    }
}
