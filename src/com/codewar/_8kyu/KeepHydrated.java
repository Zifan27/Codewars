package com.codewar._8kyu;

public class KeepHydrated {
    // https://www.codewars.com/kata/582cb0224e56e068d800003c/java
    public static void main(String[] args) {
        System.out.println(Liters(3));
    }

    public static int Liters(double time) {

        return (int) (time * 0.5);
    }
}
