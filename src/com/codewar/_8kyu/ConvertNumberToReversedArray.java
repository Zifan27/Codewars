package com.codewar._8kyu;

import java.util.Arrays;

public class ConvertNumberToReversedArray {
    // https://www.codewars.com/kata/5583090cbe83f4fd8c000051/java
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(348597)));
    }

    public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
