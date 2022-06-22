package com.java.array_programming;

/*
 * Infosys Interview Question
 *
Coloring The Blocks

There are n blocks placed in a row. Each block must be covered with one of the three colors available,
but no two adjacent blocks can be the same color. The cost of coloring each block varies and is given
in an array. Given the cost of using each color on each block, determine the minimum cost to color all
the blocks.

For example, there are three blocks to color and the cost to use each color for each block is given
as cost - [[1, 2, 3], [1, 2, 3] [3, 3, 1]]. For the first block, the cheapest color is the first color
which costs 1. For the second block, colors cost the same but color 1 cannot be used because it matches
the first block. Instead, choose color 2. For the third block, it can be color 1 or color 3, The cheaper
is color 3 at 1 unit. The total cost to color the blocks is 1 + 2 + 1 - 4.

Function Description
Complete the function minPrice in the editor below. The function must return an integer that denotes the
minimum cost to color all the blocks.

minPrice has the following parameter:
cost[cost[O]..cost[n-1]]: an array of integers where cost[i][j] denotes the cost of using the jth color
on the ith block.

Constraints
1 <= n <= 100
0 <= cost[i][j] <= 100

Input Format For Custom Testing
Sample Case 0
Sample input For Custom Testing
3
3
1 2 2
2 2 1
2 1 2

Sample Output
3

Explanation
Choose the cheapest color for each block: color 1 for block 0, color 3 for block 1 and color 2 for block 2.
 *
 */

import java.util.Scanner;

public class ColouringTheBlocks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] ar = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ar[i][j] = scan.nextInt();

        int colour = colouringTheBlocks(n, ar);
        System.out.println(colour);

    }

    static int colouringTheBlocks(int n, int[][] ar) {
        int pastIndex = n + 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int presentIndex1 = 0, presentIndex2 = 0;
            for (int j = 0; j < n; j++) {
                if (ar[i][j] < min1) {
                    presentIndex2 = presentIndex1;
                    min2 = min1;
                    presentIndex1 = j;
                    min1 = ar[i][j];
                } else if (ar[i][j] < min2 && min2 != ar[i][j]) {
                    presentIndex2 = j;
                    min2 = ar[i][j];
                }
            }
            if (presentIndex1 != pastIndex) {
                sum += min1;
                pastIndex = presentIndex1;
            } else {
                sum += min2;
                pastIndex = presentIndex2;
            }
        }
        return sum;
    }

}
