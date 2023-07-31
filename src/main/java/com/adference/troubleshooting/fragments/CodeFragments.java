package com.adference.troubleshooting.fragments;

import java.util.Arrays;

public class CodeFragments {

    public static int sumSmallestNumbers(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }

    public static boolean sameXOAmount(String letters) {
        letters = letters.toLowerCase();
        int countX = 0;
        int countO = 0;

        for (char y : letters.toCharArray()) {
            if (y == 'x') {
                countX++;
            } else if (y == 'o') {
                countO++;
            }
        }

        return countX == countO;
    }
}