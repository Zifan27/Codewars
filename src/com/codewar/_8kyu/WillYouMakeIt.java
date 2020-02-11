package com.codewar._8kyu;

public class WillYouMakeIt {

    public static void main(String[] args) {
        System.out.println(zeroFuel(100, 50, 1));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= mpg * fuelLeft;
    }
}
