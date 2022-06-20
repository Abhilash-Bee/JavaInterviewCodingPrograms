package com.java.general_programming;

/*
 * Number Pattern 5
 *
 * Sample Input 1:
 *
 * 4
 *
 * Sample Output 1:
 *
 * 01*02*03*04
 * 09*10*11*12
 * 13*14*15*16
 * 05*06*07*08
 *
 * Sample Input 2:
 *
 * 5
 *
 * Sample Output 2:
 *
 * 01*02*03*04*05
 * 11*12*13*14*15
 * 21*22*23*24*25
 * 16*17*18*19*20
 * 06*07*08*09*10
 *
 */

import java.util.Scanner;

public class NumberPattern5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] ar = new int[n][n];

        int first, last = n - 1;
        if (n % 2 == 1)
            first = n / 2 + 1;
        else
            first = n / 2;

        int count = 1;

        for (int i = 0; i < first; i++) {
            for (int j = 0; j < n; j++)
                ar[i][j] = count++;

            if (last > n / 2 && n % 2 == 1)
                for (int k = 0; k < n; k++)
                    ar[last][k] = count++;

            if (last > n / 2 - 1 && n % 2 == 0)
                for (int k = 0; k < n; k++)
                    ar[last][k] = count++;

            last--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i][j] < 10)
                    System.out.print("0");

                System.out.print(ar[i][j]);

                if (j != n - 1)
                    System.out.print("*");
            }
            System.out.println();
        }

    }

}
