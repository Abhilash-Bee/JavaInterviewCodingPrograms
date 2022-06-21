package com.java.string_programming;

/*
 * Light Bulbs
 *
 *
 *
 */

import java.util.Scanner;

public class LightBulbs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s = scan.next();
            char[] ar = s.toCharArray();

            for (int j = 0; j < n; j++) {
                if (ar[0] == 'X')
                    ar[0] = 'O';
                else {
                    char prev = ar[0];
                    ar[0] = 'X';
                    char pres = ar[0];

                    for (int k = 1; k < ar.length; k++) {
                        if (prev == 'O' && pres == 'X') {
                            prev = ar[k];

                            if (ar[k] == 'O')
                                ar[k] = 'X';
                            else
                                ar[k] = 'O';

                            pres = ar[k];
                        }
                    }
                }
            }
            System.out.println(new String(ar));
        }
    }

}
