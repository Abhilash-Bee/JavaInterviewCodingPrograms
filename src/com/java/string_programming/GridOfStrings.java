package com.java.string_programming;

import java.util.Scanner;

public class GridOfStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        String[] ar = new String[n];

        for (int i = 0; i < n; i++)
            ar[i] = scan.next();

        winningSpot(n, m, k, ar);

    }

    static void winningSpot(int n, int m, int k, String[] ar) {

        char[][] chr = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                chr[i][j] = ar[i].charAt(j);
            }
        }

        int i = 0, j = 0;
        while (k > -1) {
            if (chr[i][j] == '*') {
                System.out.println(k);
                System.exit(0);
            }

            if (chr[i][j] == 'L')
                j--;

            else if (chr[i][j] == 'R')
                j++;

            else if (chr[i][j] == 'U')
                i--;

            else if (chr[i][j] == 'D')
                i++;

            k--;
        }
        System.out.println(-1);
    }

}
