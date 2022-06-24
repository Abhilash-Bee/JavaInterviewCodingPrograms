package com.java.general_programming;

/*
Value of cards

Problem Statement

You are given four positive integers, a, b, c, and d as input. Cards of deck are represented as follows:
{Ace->1, 2->2, 3->3, 4->4, 5->5, 6->6, 7->7, 8->8, 9->9, 10->10, Jack->11, Queen->12, King->13}.
a, b, c, and d form a set of 4 cards of a deck. In a card game called 'Twenty Nine', the points associated
with each card is:
- Face card Jack has 3 points each.
- Cards with the number 9 have 2 points each.
- Aces have 1 point each.
- Cards with the number 10 have point each.
- The Rest of the cards have value of 0 points each.
Calculate and print the total points of a given set of 4 cards of a deck by adding the points associated
with each card and print the same.

Input Format:
The consists of four lines of input:
- The first line contains a positive Integer, i.e., a.
- The second line contains a positive integer, i.e., b.
- The third line contains a positive integer, i.e., c.
- The fourth line contains a positive integer, i.e. d.
Input will be read from the STDIN by the candidate

Output Format:
Print the total points of the given set of 4 cards of a deck.
The output will be matched to the candidate's output printed on the STDOUT

Constraints:
1 <= a,b,c,d <= 13

Example
Input:
11
9
1
5
Output:
6

Explanation:
Set of cards:
- 11 represents a Jack
- 9 represents a 9 numbered card
- 1 represents an Ace
- 5 represents a 5 numbered card
Jack scores 3 points, 9 numbered card score 2 points, Ace scores 1 point and 5 numbered card scores 0 points.
Total points = 3 + 2 + 1 + 0 = 6
Hence, the output is 6.

 */

import java.util.Scanner;

public class ValueOfCards {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int sum = 0;
        if (a == 11 || b == 11 || c == 11 || d == 11)
            sum += 3;

        if (a == 9 || b == 9 || c == 9 || d == 9)
            sum += 2;

        if (a == 1 || b == 1 || c == 1 || d == 1)
            sum += 1;

        if (a == 10 || b == 10 || c == 10 || d == 10)
            sum += 1;

        System.out.println(sum);

    }

}
