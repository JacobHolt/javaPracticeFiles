package com.arrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[] Numbers = new int[5];
    public static void main(String[] args) {
        int[] Numbers = getIntegers(5);
        printArray(Numbers);
        sortIntegers(Numbers);
        printArray(Numbers);
    }
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
    public static int[] sortIntegers(int[] array) {
        int[] values = array;
        Arrays.sort(values);
        return values;
    }
}
