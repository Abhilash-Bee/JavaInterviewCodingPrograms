package com.java.general_programming;

/*
 * Simple Recursive Sequence
 *
 * The k-fantastic sequence is define in the following way:
 *
 * a(i+1) = (k * b(i) + a(i) * a(i)) mod 3001
 *
 * b(i+1) = (k * a(i) + b(i)) mod 3001
 *
 * a(0) = 1
 *
 * b(0) = 2
 *
 * Fine the T-th pair of numbers of the k-fantastic sequence
 *
 * Example
 *
 * Consider K = 2 and T = 2.
 *
 * as (a(0), b(0)) = (1, 2), using a(i+1) = (k * b(i) + a(i) * a(i)) mod 3001
 * and b(i+1) = (k * a(i) + b(i)) mod 3001
 *
 * then we get (a(1), b(1)) = (5, 4)
 *
 * then we get (a(2), b(2)) = (33, 14)
 *
 * Function description
 *
 * Complete the Simple_Recursive_Sequence function provided
 * in the editor.
 * This function takes the following 2 parameters and returns
 * an array containing a(T) and b(T).
 *
 * --> K: An Integer representing value of K.
 * --> T: An Integer representing value of T.
 *
 *
 * Input format
 *
 * --> First line: Two space-separated integers K and T
 *
 * Output format
 *
 * Print a(T) and b(T).
 *
 * Constraints
 *
 * 0 <= K <= 3000
 * 0 <= T <= 10 pow 9
 *
 *
 * Sample Input:
 * 5 10
 *
 * Sample Output:
 * 2601 513
 *
 * Explanation:
 * 0: 1 2
 * 1: 11 7
 * 2: 156 62
 * 3: 638 842
 * 4: 117 1031
 * 5: 838 1616
 * 6: 2088 2805
 * 7: 1312 1241
 * 8: 1974 1799
 * 9: 1370 2666
 * 10: 2601 513
 *
 */

import java.util.Scanner;

public class SimpleRecursiveSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int t = scan.nextInt();

        int preva = 1, prevb = 2;
        int presa, presb;

        for (int i = 0; i < t; i++) {
            presa = (((k * prevb) + (preva * preva))) % 3001;
            presb = (((k * preva) + prevb)) % 3001;
            System.out.println(presa + " " + presb);
            preva = presa;
            prevb = presb;
        }

    }

}
