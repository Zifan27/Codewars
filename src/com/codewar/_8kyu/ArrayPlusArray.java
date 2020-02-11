package com.codewar._8kyu;

import java.util.stream.IntStream;

public class ArrayPlusArray {
    // https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/java
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {4, 5, 6};

        System.out.println(arrayPlusArray(arr1, arr2));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
