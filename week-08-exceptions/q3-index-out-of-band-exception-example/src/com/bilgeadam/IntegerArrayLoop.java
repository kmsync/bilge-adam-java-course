package com.bilgeadam;

public class IntegerArrayLoop {
    public void loopDefinedArray(int[] array){
        for(int index = 0; index < 7 ; index++){
            try{
                System.out.println(array[index]);
            }catch (IndexOutOfBoundsException e){
                System.out.println(index +" "+ e.getMessage());
            }

        }
    }
}
