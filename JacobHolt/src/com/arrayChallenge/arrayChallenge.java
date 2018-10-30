package com.arrayChallenge;

import java.util.*;

public class arrayChallenge{

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    public static void printArrayDecending(int[] array) {
        for(int i = 4; i > array.length - 6; i--) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] values = array;
        Arrays.sort(values);
        return values;
    }
}
