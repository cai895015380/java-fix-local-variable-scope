package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(relation(1, 2));
        System.out.println(relation(2, 1));
        System.out.println(relation(2, 2));
    }

    // Fix the compilation error
    // Return "a<b" if a < b, "a>b" if a > b, "a=b" otherwise
    public static String relation(int a, int b) {
        if (a > b) {
            String sign = "a > b";
            return sign;
        } else if (a < b) {
            String sign = "a < b";
            return sign;
        } else {
            String sign = "a = b";
            return sign;
        }
    }
}
