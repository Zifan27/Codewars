package com.codewar._8kyu;

public class SquareNSum {
    // https://www.codewars.com/kata/515e271a311df0350d00000f/java
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2};

        System.out.println(squareSum(numbers));
    }

    public static int squareSum(int[] n) {
        int total = 0;

        for (int value : n) {
            total += Math.pow(value, 2);
        }

        return total;
    }
}
