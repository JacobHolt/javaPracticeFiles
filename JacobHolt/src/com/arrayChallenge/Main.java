package com.arrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main extends arrayChallenge {
    int[] Numbers = new int[5];
    public static void main(String[] args) {
        int[] Numbers = getIntegers(5);
        printArray(Numbers);
        sortIntegers(Numbers);
        printArray(Numbers);
        printArrayDecending(Numbers);
    }
}
