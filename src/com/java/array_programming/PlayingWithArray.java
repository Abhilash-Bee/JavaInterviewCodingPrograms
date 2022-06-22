package com.java.array_programming;

/*
 * Playing with Array
 *
 * Sum of all elements in the Array and product of sum and n.
 *
 * Sample Input:
 * 5
 * 1 2 3 4 5
 *
 * Sample Output:
 * 75
 *
 * Explanation:
 *
 * sum = 1+2+3+4+5 = 15
 *
 * sum * n = result
 * 15 * 5 = 75
 *
 */

import java.util.Scanner;

public class PlayingWithArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = scan.nextInt();

        System.out.println(playingArray(n, ar));

    }

    static int playingArray(int n, int[] ar) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += ar[i];

        return sum * n;
    }

}
