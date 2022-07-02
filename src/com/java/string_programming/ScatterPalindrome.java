package com.java.string_programming;

/*
 * Infosys Interview Question
 *
 * Scattered Palindrome
 *
A palindrome is a string which reads the same forward and backwards, for example,
tacocat and mom. A string is a scatter-palindrome if its letters can be rearranged
to if form palindrome. Given an array consisting of n strings, for each string,
determine how many its substrings are scatter-palindromes. A substring is a  contiguous
range of characters within the string.

Example:

strToEvaluate = ['aabb']

The scatter-palindromes are a, aa, aab, aabb, a, abb, b, bb, b. There are 9 substrings
that a scatter-palindromes.

Function Description:

Complete the scatterPalindrome function in the editor below.

scatterPalindrome has one parameter:
    string strToEvaluate[n]: the n strings to be evaluated

Returns
int[n]: each element / represents the number of substrings of strToEvaluate[i] which
are scatter-palindromes.

Constraints
1 <= n <= 100
1 <= size of strToEvaluate[i] <= 1000
all characters of strToEvaluate[i] € ascii[a-z]


Input Format For Custom Testing:

The first line contains an integer, n, that denotes the number of elements in
strToEvaluate.

Each line i of the n subsequent lines (where 0 si < n) contains a string that
describes strToEvaluate[i].

Sample Case 0:
Sample Input For Custom Testing

STDIN         Function
1             strToEvaluate[] size n = 1
abc           strToEvaluate = ["abc"]

Sample Output:
3

Explanation:
The substrings that are scatter-palindromes of the string abc are:
* a
* b
* c

Sample Case 1:
Sample Input For Custom Testing
STDIN          Function
1              strToEvaluate[] size n = 1
bbrrg          strToEvaluate = ["bbrrg"]

Sample Output:
12

Explanation:
The substrings that are scatter-palindromes of the string bbrrg are:
b
bb
bbr
bbrr
bbrrg
b
brr
r
rr
rrg
r
g

 *
 */

import java.util.Scanner;

public class ScatterPalindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int scattered = scatterPalindrome(scan.next());
        System.out.println(scattered);

//        For Multiple inputs
//
//        int n = scan.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            int scattered = scatterPalindrome(scan.next());
//            System.out.println(scattered);
//        }

    }

    static int scatterPalindrome(String s) {
        int scat = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                int[] ar = new int[26];
                String temp = s.substring(i, j);
                for (int k = 0; k < temp.length(); k++) {
                    int index = temp.charAt(k) - 97;
                    ar[index]++;
                }

                int pal = 0;
                for (int l = 0; l < 26; l++) {
                    if (ar[l] % 2 == 1)
                        pal++;
                }

                if (pal < 2)
                    scat++;
            }
        }
        return scat;
    }

}
