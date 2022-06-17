package com.java.array_programming;

/*
 * Min and Max in 2 Arrays
 *
 * Problem Statement
 *
 * You are required to implement the following function:
 * int MinMaxInTwoArrays(int arr1[], int arr2[], int len1, int len2, int k);
 *
 * The function accepts two integer arrays 'arr1' of length 'len1',
 * 'arr2' of length 'len2' and an integer 'k' as its arguments.
 * Let the count of numbers greater than 'k' in array 'arr1' be 'x' and
 * the count of numbers lesser than 'k' in array 'arr2' be 'y'. You are
 * required to return the maximum of 'x' and 'y' from the function.
 *
 * Assumption: 'len1', 'len2' > 0
 *
 * Example:
 *
 * Sample Input 1:
 * 5
 * 9 16 12 5 15
 * 6
 * 14 7 22 5 32 77
 * 9
 *
 * Sample Output 1:
 * 3
 *
 * Explanation:
 * 3 Integers in the array {9, 16, 12, 5, 15} are greater than 9,
 * 2 Integers in the array {14, 7, 22, 5, 32, 77} are lesser than 9.
 * Hence, 3 is returned.
 *
 * Sample Input 2:
 * 7
 * 1 5 7 22 6 6 8
 * 8
 * 14 7 22 5 32 77 12 4
 * 20
 *
 * Sample Output 2:
 * 5
 *
 */

import java.util.Scanner;

public class MinMaxIn2Arrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len1 = scan.nextInt();

        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++)
            arr1[i] = scan.nextInt();

        int len2 = scan.nextInt();

        int[] arr2 = new int[len2];
        for (int i = 0; i < len2; i++)
            arr2[i] = scan.nextInt();

        int k = scan.nextInt();

        minMax(arr1, arr2, len1, len2, k);

    }

    static void minMax(int[] arr1, int[] arr2, int len1, int len2, int k) {
        int bigCount = 0;
        for (int i = 0; i < len1; i++) {
            if (arr1[i] > k)
                bigCount++;
        }

        int smallCount = 0;
        for (int i = 0; i < len2; i++) {
            if (arr2[i] < k)
                smallCount++;
        }

        System.out.println(Math.max(bigCount, smallCount));
    }

}
