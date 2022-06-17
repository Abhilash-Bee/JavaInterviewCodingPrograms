package com.java.general_programming;

/*
 * Number Pattern 2
 *
 * Sample Input:
 * 5
 *
 * Sample Output:
 * 1
 * 212
 * 32123
 * 4321234
 * 543212345
 * 4321234
 * 32123
 * 212
 * 1
 *
 */

import java.util.Scanner;

public class NumberPattern2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        numberPattern(n);

    }

    static void numberPattern(int n) {

        int count;
        for (int i = 1; i <= n; i++) {
            count = i;
            while (count >= 1)
                System.out.print(count--);

            count = 2;
            while (count <= i)
                System.out.print(count++);

            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            count = i;
            while (count >= 1)
                System.out.print(count--);

            count = 2;
            while (count <= i)
                System.out.print(count++);

            System.out.println();
        }
    }

}
