package com.java.general_programming;

/*

You are given the binary representation of a number. You must consider the highest number of set bits
in the binary representation to complete your task. For example, 23 is represented as 10111 in binary
and it contains four set bits (1-bits). You are also given a number N and your task is to determine
the number that is less than or equal to N and contains the maximum number of set bits in its
binary representation. In other words, print a number K that is less than or equal to N such that the
number of set bits in the binary representation of K must be maximum.

Input Format
--> An integer N

Constraints
--> 1<=Nc=109

Output Format
Print the answer denoting a number K that is less than or equal to N such that the number of set bits
in the binary representation of K must be maximum.

Sample Input
345

Sample Output
255
 */

import java.util.Scanner;

public class MaximumSetBits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(maximumSetBits(n));

    }

    public static int maximumSetBits(int n) {

        int data = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(i);
            int count = 0;
            for (int j=0; j<str.length(); j++) {
                if(str.charAt(j) == '1')
                    count++;
            }
            if(max < count) {
                max = count;
                data = i;
            }
        }
        return data;

    }

}
