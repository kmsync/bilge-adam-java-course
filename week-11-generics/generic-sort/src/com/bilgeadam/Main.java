package com.bilgeadam;

import java.util.AbstractList;
import java.util.ArrayList;

public class Main {

    public static  <T extends AbstractList<E>, E extends Number> T sortList(T arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = 0; j < arraylist.size(); j++) {
                if(arraylist.get(i).doubleValue() < arraylist.get(j).doubleValue()){
                    E tempVariable;
                    tempVariable = arraylist.get(i);
                    arraylist.set(i,arraylist.get(j));
                    arraylist.set(j,tempVariable);
                }
            }
        }
        return arraylist;
    }

    public static <T extends Number> T[] sortArray(T[] tempArr){
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 0; j < tempArr.length; j++) {
                if(Double.parseDouble(tempArr[i]+"") < Double.parseDouble(tempArr[j]+"")){
                    T tmpNumber = tempArr[i];
                    tempArr[i] = tempArr[j];
                    tempArr[j] = tmpNumber;
                }
            }
        }
        return tempArr;
    }

    public static <T extends AbstractList<R>, R extends Number> void printArray(T array){
        for (R element: array){
            System.out.println(element);
        }
    }

    public static <T extends Number> void printArray(T[] array){
        for (T element: array){
            System.out.println(element);
        }
    }

    public <T extends Number> boolean a(T a , T b){
        return a.doubleValue() < b.doubleValue();
    }

    public static void main(String[] args) {
     /*   ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(7);
        printArray(sortList(arrayList));*/

        Integer[] arr1 = {1,4,2,5};
        Double[] arr2 = {1.1,4.4,2.2,5.5};

        arr1 = sortArray(arr1);
        arr2 = sortArray(arr2);
        printArray(arr1);
        printArray(arr2);
    }
}
