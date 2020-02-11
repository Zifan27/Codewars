package com.codewar._8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumbersDivideByNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(divisibleBy(numbers, 2)));
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (number % divider == 0) {
                result.add(number);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
