package com.java.string_programming;

/*
 * Largest of two numbers
 *
 * Sample Input 1:
 * 38389473
 *
 * Sample Output 1:
 * 94
 *
 * Sample Input 2:
 * 95432342
 *
 * Sample Output 2:
 * 95
 *
 */

import java.util.Scanner;

public class Largest2DigitNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(largest(n));

    }

    static int largest(int n) {
        String s = String.valueOf(n);

        int start = 0, end = 2, max = Integer.MIN_VALUE;
        while (end <= s.length()) {
            String temp = s.substring(start, end);
            if (max < Integer.parseInt(temp) && temp.charAt(0) != temp.charAt(1)) {
                max = Integer.parseInt(temp);
            }
            start += 2;
            end += 2;
        }
        return max;
    }

}
