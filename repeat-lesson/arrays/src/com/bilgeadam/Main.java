package com.bilgeadam;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        int[] arr3 = new int[]{1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
        arr2[8] = 1444;
        printArray(arr2);
        printArray(arr3);

        System.out.println("----------------------------------------------------");

        String[] meyve = {"elma","çilek","kiraz"};
        int arrayLength = meyve.length;
        System.out.format("Bileşen sayısı: %d \n",arrayLength);


        int[] intArray = new int[500];
        int intArrayLength = intArray.length;
        System.out.format("Bileşen sayısı: %d",intArrayLength);

        System.out.println("----------------------------------------------------");

        int[] a = IntStream.range(1,101).toArray();
        int[] b = new int[100];
        Arrays.setAll(b,i -> i+1);

        printArray(a);
        printArray(b);

        sumArrayElements(a);
        sumArrayElements(b);

        System.out.println("----------------------------------------------------");


        int[][] ikiBoyutluArray = new int[][] {{1,2},{2,3},{3,4}};
        int[][] ikiBoyutluArray2 = new int[2][3];
        //printMultipleArrayElement(ikiBoyutluArray2);

        System.out.println("----------------------------------------------------");

        int[][] array2 = new int[2][3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;

        //printMultipleArrayElement(array2);

        System.out.println("----------------------------------------------------");

        int[][] c = new int[][] {
                {50,60,70},
                {80,90,100},
                {110,120,130},
                {140,150,160}
        };

        printMultipleArrayElementWithRowAndColumn(c);

        System.out.println("----------------------------------------------------");

        int[][] juggedArray = new int[][] {
                {50,60,70},
                {80},
                {90,100,110,120,130},
                {140,150,160}
        };

        printMultipleArrayElementWithRowAndColumn(juggedArray);

    }

    public static void printArray(int[] arr){
        for (int arrayElement: arr) {
            System.out.print(
                    arr[arr.length-1] != arrayElement
                    ?
                    arrayElement+","
                    :
                    arrayElement);
        }
        System.out.println();
    }

    public static void sumArrayElements(int[] arr){
        int sum = 0;
        for (int arrayElement: arr) {
            sum += arrayElement;
        }
        System.out.println(sum);
    }

    public static void printMultipleArrayElement(int[][] multipleArray){
        for (int[] array:multipleArray) {
            for (int arrayElements :array) {
                System.out.println(arrayElements);
            }
        }
    }

    public static void printMultipleArrayElementWithRowAndColumn(int[][] multipleArray){
        for(int i = 0 ; i < multipleArray.length; i++){
            for (int j = 0 ; j <multipleArray[i].length ; j++){
                System.out.print(multipleArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
