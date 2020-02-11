package com.codewar._8kyu;

import java.util.Arrays;

public class TakeTheFirstNElements {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 3, 5, 8, 13};
        System.out.println(Arrays.toString(take(arr, 9)));
    }

    public static int[] take(int[] arr, int n) {
        int length = n;
        if (n > arr.length) {
            length = arr.length;
        }
        int[] arr2 = new int[length];
        System.arraycopy(arr, 0, arr2, 0, length);

        return arr2;
    }
}
