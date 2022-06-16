package com.java.general_programming;

/*
 * Diamond Pattern
 *
 *      A
 *     B B
 *    C   C
 *   D     D
 *  E       E
 * F         F
 * 	E       E
 *   D     D
 *    C   C
 *     B B
 *      A
 *
 */

import java.util.Scanner;

public class DimondPattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++)
            System.out.print(" ");
        System.out.println("A");

        for(int i=1;i<=n;i++) {
            for(int j=0;j<n-i;j++)
                System.out.print(" ");

            System.out.print((char)(65+i));
            for(int j=0;j<(2*i)-1;j++)
                System.out.print(" ");

            System.out.println((char)(65+i));

        }

        for(int i=n-1;i>=1;i--) {
            for(int j=0;j<n-i;j++)
                System.out.print(" ");

            System.out.print((char)(65+i));

            for(int j=0;j<(2*i)-1;j++)
                System.out.print(" ");

            System.out.println((char)(65+i));
        }

        for(int i=0;i<n;i++)
            System.out.print(" ");
        System.out.println("A");

    }

}
