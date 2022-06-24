package com.java.string_programming;

/*
 * Length of the longest prefix which is also a suffix
 *
 * Problem Statement
 *
 * A suffix is a letter or a group of letters added to the end
 * of a word to change its meaning.
 * A prefix is a letter or a group of letters added at the
 * beginning of a word to change its meaning.
 * You are required to implement the following function:
 * int LengthLongestPrefixSuffix(char* str);
 *
 * The function accepts a string 'str' as its argument. You are
 * required to calculate the length of the longest prefix value.
 *
 * Note:
 * -> If 'str' = NULL (None, in case of Python), return -1.
 * -> Prefix or suffix cannot be string 'str' itself.
 *
 * Assumption:
 * -> all characters of 'str' are in upper-case.
 *
 * Example:
 * Input:
 * str: ABCDNMTYABCD
 *
 * Output:
 * 4
 *
 * Explanation:
 * The longest proper prefix which is also the suffix is "ABCD" in
 * the string "ABCDNMTYABCD" and its length is 4.
 *
 * Sample input:
 * str: EFGHPEFRTFFGGHPEFGHP
 *
 * Sample output:
 * 5
 *
 */

import java.util.Scanner;

public class LongestPrefixSuffix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        longestPrefixSuffix(str);

    }

    static void longestPrefixSuffix(String str) {
        int i = 0, j = 1, count = 0;

        while (j < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j++;
                count++;
            } else {
                i = 0;
                j++;
                count = 0;
            }
        }
        System.out.println(count);
    }

}
