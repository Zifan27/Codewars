package com.codewar._8kyu;

public class IsNDivisibleByXAndY {
    // https://www.codewars.com/kata/5545f109004975ea66000086/java
    public static void main(String[] args) {
        System.out.println(isDivisible(12, 4, 3));
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
