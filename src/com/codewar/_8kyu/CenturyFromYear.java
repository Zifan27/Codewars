package com.codewar._8kyu;

public class CenturyFromYear {
    // https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/java
    public static void main(String[] args) {
        System.out.println(century(1705));
    }

    public static int century(int number) {
        int remainYears = number % 100;

        if (remainYears > 0) {
            return number / 100 + 1;
        }

        if (number < 100) {
            return 1;
        }
        return number / 100;
    }
}
