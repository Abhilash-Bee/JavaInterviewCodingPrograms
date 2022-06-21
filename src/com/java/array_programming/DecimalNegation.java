package com.java.array_programming;

/* Wipro Interview Question
 *
 * Decimal-Negate-Decimal
 *
 * Example:
 *
 * Input 1:
 * 4
 * 65 29 56 34
 * Output 1:
 * 62 2 7 29
 *
 * Explanation:
 * Binary conversions for the given data are:
 *
 * For data (65)dec the binary form is (1000001)bin.
 * Upon inverting, it becomes (0111110)bin which converted
 * in decimal is (62)dec.
 *
 * For data (29)dec the binary form is (11101)bin.
 * Upon inverting, it becomes (00010)bin which converted
 * in decimal is (2)dec.
 *
 * For data (56)dec the binary form is (111000)bin.
 * Upon inverting, it becomes (000111)bin which converted
 * in decimal is (7)dec.
 *
 * For data (34)dec the binary form is (100010)bin.
 * Upon inverting, it becomes (011101)bin which converted
 * in decimal is (29)dec.
 *
 */

import java.util.Scanner;

public class DecimalNegation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++)
            ar[i] = scan.nextInt();

        for (int t = 0; t < n; t++) {
            String s = Integer.toBinaryString(ar[t]);
            //System.out.println(s);

            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0')
                    temp += '1';
                else
                    temp += '0';
            }

            System.out.print(Integer.parseInt(temp, 2) + " ");

//			int j=0, sum=0;
//			for(int i=temp.length()-1;i>=0;i--) {
//				sum += (Math.pow(2, j) * Integer.parseInt(temp.charAt(i)+""));
//				j++;
//			}
//
//			System.out.print(sum+" ");

        }

    }

}
