package com.codewar._8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedSequence {
    // https://www.codewars.com/kata/5a00e05cc374cb34d100000d/java
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        List<Integer> reverseArr = new ArrayList<>() {};
        for (int i = n; i > 0; i--) {
            reverseArr.add(i);
        }

        return reverseArr.stream().mapToInt(i -> i).toArray();
    }
}
