package com.codewar._8kyu;

import java.util.Arrays;

public class TakeTheFirstNElements {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 3, 5, 8, 13};
        System.out.println(Arrays.toString(take(arr, 9)));
    }

    public static int[] take(int[] arr, int n) {
        if (n > arr.length) {
            n = arr.length;
        }
        int[] arr2 = new int[n];
        System.arraycopy(arr, 0, arr2, 0, n);

        return arr2;
    }
}
