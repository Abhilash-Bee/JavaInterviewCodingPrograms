package com.java.general_programming;

/*
 *
 * Astro Number
 *
 * An astro number is defined by the following process.
 * Given any positive number, replace the integer by the
 * sum of the squares of its digits.
 *
 * Those numbers for which this process end in 1 are astro
 * number, while those number that not end at 1 are not
 * astro number
 *
 * Example:
 *
 * 7 => 49 => 16 + 81 => 81 + 49 => 1 + 9 + 0 => 1 (Hence 7 is astro number)
 * 8 => 64 => 36 + 16 => 25 + 4 => 4 + 81 => 64 + 25 => 64 + 81 => never ending (not astro number)
 *
 * Given a number from 1 to 100, find if the number if it is astro number or not.
 * Hint: 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100 are astro number.
 *
 * Constraint:
 * 1 <= n <= 100
 *
 * Input 1:
 * 7
 * Output 1:
 * Yes
 *
 * Input 2:
 * 8
 * Output 2:
 * No
 *
 */

import java.util.Scanner;

public class AstroNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int j = 0;
        while(n != 1 && j<100) {
            int sum = 0;
            while(n!=0) {
                int rem = n % 10;
                sum += (int)Math.pow(rem, 2);
                n /= 10;
            }
            n = sum;
            j++;
        }
        if(n==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
