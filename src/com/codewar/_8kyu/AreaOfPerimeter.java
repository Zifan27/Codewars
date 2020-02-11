package com.codewar._8kyu;

public class AreaOfPerimeter {
    // https://www.codewars.com/kata/5ab6538b379d20ad880000ab/java
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(26, 26));
    }

    public static int areaOrPerimeter(int l, int w) {

        return (l + w) * 2;
    }
}
