package com.java.array_programming;

/*
 * Infosys Interview Question
 *
 * Coluring The Blocks
 *
 *
 */

import java.util.Scanner;

public class ColouringTheBlocks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] ar = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ar[i][j] = scan.nextInt();

        int colour = colouringTheBlocks(n, ar);
        System.out.println(colour);

    }

    static int colouringTheBlocks(int n, int[][] ar) {
        int pastIndex = n + 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int presentIndex1 = 0, presentIndex2 = 0;
            for (int j = 0; j < n; j++) {
                if (ar[i][j] < min1) {
                    presentIndex2 = presentIndex1;
                    min2 = min1;
                    presentIndex1 = j;
                    min1 = ar[i][j];
                } else if (ar[i][j] < min2 && min2 != ar[i][j]) {
                    presentIndex2 = j;
                    min2 = ar[i][j];
                }
            }
            if (presentIndex1 != pastIndex) {
                sum += min1;
                pastIndex = presentIndex1;
            } else {
                sum += min2;
                pastIndex = presentIndex2;
            }
        }
        return sum;
    }

}
