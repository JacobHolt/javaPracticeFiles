package com.Arrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       int[] myIntegers = getIntegers(5);
       for(int i=0; i<myIntegers.length; i++) {
           System.out.println("Element " + i + ", value is " + myIntegers[i]);
       }
        System.out.println("Average is " + getAverage(myIntegers));
        //Initializing Array

        //int[] myIntArray = new int[25]; //= { 1,2,3,4,5,6,7,8,9,10 }; Second way to initialize

        //First way to initialize
        // myIntArray[0] = 45;
        // myIntArray[1] = 476;
        // myIntArray[5] = 50;

        // double[] myDoubleArray = new double[10];

        //3rd way to initialize. For loop.

        //for (int i = 0; i < myIntArray.length; i++) {
        //    myIntArray[i] = i * 10;
        //}
        //printArray(myIntArray);
        // }
        // public static void printArray(int[] array) {
        // for(int i=0; i<array.length; i++){
        //  System.out.println("Element " + i + ", value is " + array[i]);
        // }
        // }


        // System.out.println(myIntArray[5] + " is my sixth element in my array");
        // System.out.println(myIntArray[6] + " is my seventh element in my array");
        // System.out.println(myIntArray[8] + " is my ninth element in my array");
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum+=array[i];
        }
        return (double) sum / (double) array.length;
    }
}
