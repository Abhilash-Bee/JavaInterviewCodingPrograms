package com.java.general_programming;

/*
 * Cubic Sum Exist
 *
 * You are given a function:
 * static int isCubicSumExist(long A[]) {}
 *
 * The function accepts an array 'A' of size 'N'. Implement the
 * function to return the count of good integers in array 'A'.
 *
 * An integer Z is said to be good if and only if there exist
 * two integers X and Y such that X pow 3 + Y pow 3 = Z.
 *
 * Example:
 *
 * Input:
 *
 * N : 3
 * A : [35, 9, 1]
 *
 * Output:
 *
 * 2
 *
 * Explanation:
 *
 * 35 is a good integer, there exist an answer with X = 2, Y = 3, (2pow3 + 3pow3 = 8 + 27 = 35).
 * 9 is a good integer, there exist an answer with X = 1, Y = 2, (1pow3 + 2pow3 = 1 + 8 = 9).
 * 1 is not a good integer, So total 2 integers are good in the given array A.
 *
 */

import java.util.Scanner;

public class CubicSumExist {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = scan.nextInt();

        flag:
        for (int i = 0; i < n; i++) {
            for (int j = 1; (int) Math.pow(j, 3) <= ar[i]; j++) {
                for (int k = j + 1; (int) Math.pow(k, 3) <= ar[i]; k++) {
                    if ((int) Math.pow(j, 3) + (int) Math.pow(k, 3) == ar[i]) {
                        System.out.println(ar[i] + " is a good number");
                        continue flag;
                    }
                }
            }
            System.out.println(ar[i] + " is not a good number");
        }
    }
}
