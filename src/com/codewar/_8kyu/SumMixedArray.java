package com.codewar._8kyu;

import java.util.List;
import java.util.Arrays;

public class SumMixedArray {
    // https://www.codewars.com/kata/57eaeb9578748ff92a000009/java
    public static void main(String[] args) {
        List<?> mixed = Arrays.asList("1", 2, 3, 4);
        System.out.println(sum(mixed));
    }

    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt(i -> Integer.parseInt(i.toString())).sum();
    }
}
