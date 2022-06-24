package com.java.array_programming;

/*
 * Sub-Array Sum
 *
 * XYZ company is conducted a walk-in-interview for freshers, they want
 * candidates who are strong in coding. The candidate has been provided
 * with a list of numbers L. Elements of L may be positive or negative
 * or zero's. Candidate code is expected to check the existence of a
 * sublist S (continues indexes) whose sum of elements is 0. If S exist
 * print "true" else print "false".
 *
 * Read the input from STDIN and write the output to STDOUT. You should
 * not write arbitrary strings while reading the input and while printing
 * as these contribute to the standard output.
 *
 * Constraints:
 * 1 <= length of L <= 2 * (10 pow 4)
 * -1000 <= L[i] <= 1000
 * Length of S >= 1
 *
 * Input Format:
 * The first line of input contains the number of test cases N.
 * Next N lines of input contains an array of positive and negative number per line.
 *
 * Output Format:
 * N lines output contains true or false.
 *
 * Sample Input 1:
 * 2
 * 4 2 -3 1 6
 * -3 2 3 1 6
 *
 * Sample Output 1:
 * true
 * false
 *
 * Explanation 1:
 * From testcase1, there is a subarray with zero-sum from index 1 to 3. So the output is true.
 * From testcase2, there is no subarray that has sum 0. So the output is false.
 *
 * Sample Input 2:
 * 2
 * -3 2 0 1 6
 * 4 5 2 1 -3
 *
 * Sample Output 2:
 * true
 * true
 */

import java.util.Scanner;

public class SubArraySum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int t = 0; t < n; t++) {
            int[] ar = new int[5];
            for (int i = 0; i < 5; i++)
                ar[i] = scan.nextInt();

            int count = 0;
            out:
            for (int i = 0; i < 4; i++) {
                for (int j = 4; j > i; j--) {
                    int v = i, sum = 0;
                    while (v <= j) {
                        sum += ar[v];
                        v++;
                    }
                    System.out.println(sum);
                    if (sum == 0) {
                        count++;
                        System.out.println("true");
                        break out;
                    }
                }
            }
            if (count == 0)
                System.out.println("false");
        }

    }

}
