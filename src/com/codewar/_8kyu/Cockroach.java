package com.codewar._8kyu;

public class Cockroach {
    // https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/java
    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
    }

    public static int cockroachSpeed(double x) {

        return (int) (x * 27.778);
    }
}
