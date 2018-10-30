package com.arrayChallenge;

import java.util.*;

public class arrayChallenge{

    private Scanner scanner = new Scanner(System.in);

    public int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    public int[] sortIntegers(int[] array) {
        int[] values = array;
        Arrays.sort(values);
        return values;
    }
}
