package com.java.general_programming;

/*
 * Number Pattern 4
 *
 * Sample Input:
 *
 * 4
 *
 * Sample Output:
 *
 * 4
 * 8 18
 * 12 27 48
 * 16 36 64 100
 * 20 45 80 125 180
 *
 */

import java.util.Scanner;

public class NumberPattern4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = 2;
            for (int j = 1; j <= i; j++) {
                System.out.print((square * square) * i + " ");
                square++;
            }
            System.out.println();
        }

    }

}
