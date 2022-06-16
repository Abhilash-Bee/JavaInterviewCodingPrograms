package com.java.array_programming;

/*
 * Add K Values
 *
 * Pair Sums
 *
 * Sum of k values and leave k values alternatively.
 *
 * Input 1:
 * 10
 * 1 2 3 4 5 6 7 8 9 10
 * 3
 * Output 1:
 * 30
 *
 * Input 2:
 * 5
 * 1 2 3 4 5
 * 1
 * Output 2:
 * 9
 *
 */

import java.util.Scanner;

public class AddKValues {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++)
            ar[i] = scan.nextInt();

        int k = scan.nextInt();

        int remote = 0, sum = 0;
        for (int i = 0; i < n; i = i + k) {
            for (int j = 0; j < k; j++) {
                if (remote % 2 == 0) {
                    if (i + j < n)
                        sum += ar[i + j];
                }
            }
            remote++;
        }
        System.out.println(sum);

    }

}
