package com.java.string_programming;

/*
You will be given a grid of size N * M (The grid will be described as an array of N strings, each string of length M).

There is a winning spot at only one cell which is represented as '*'.

In the beginning, you are standing at cell (1, 1) at time 0. You will move from cell (x, y) only with 4 cases:
- If the current cell value is 'L', then you will go to cell (x, y - 1).
- If the current cell value is 'R', then you will go to cell (x, y + 1).
- If the current cell value is 'U', then you will go to cell (x - 1, Y).
- If the current cell value is 'D', then you will go to cell (x + 1, y).

Each movement takes one second. If at any case you move outside the grid, you are dead and you can not get back.

Your task is to find the minimum number of changes needed so that you can get to the winning spot at some time
that is less than or equal to K (in seconds) to the winning spot, print -1.

Input Format
The first line contains an integer, N, denoting the number of elements in S
The next line contains an integer, M. denoting the length of each string.
he next line contains an integer, K, denoting the limit for the required time.
Each line i of the N subsequent lines (where 0 <= i <= N) contains a string describing S[i].

Constraints
1 <= N <= 50
1 <= M <= 50
0 <= K <= 1000
1 <= len(S[i]) <= 10^5

Sample input 1
2
2
2
RD
D*

Sample output 1
0

Explanation 1:
If you follow the already existing values. you can get to the winning spot easily at time 2. So there is
no need to change any value.

Sample input 2:
2
2
0
RR
R*

Sample output 2:
-1

Explanation 2:
At time 0, you are standing at cell (1, 1). No matter how many cells you change, you can never get to cell (2, 2)

Sample input 3:
2
2
0
*L
LL

Sample output 3:
0

Explanation:
At time 0: you are standing at cell (1, 1) - The winning spot is cell (1, 1) So there is no need to change any
value of other cells.

 */

import java.util.Scanner;

public class GridOfStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        String[] ar = new String[n];

        for (int i = 0; i < n; i++)
            ar[i] = scan.next();

        winningSpot(n, m, k, ar);

    }

    static void winningSpot(int n, int m, int k, String[] ar) {

        char[][] chr = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                chr[i][j] = ar[i].charAt(j);
            }
        }

        int i = 0, j = 0;
        while (k > -1) {
            if (chr[i][j] == '*') {
                System.out.println(k);
                System.exit(0);
            }

            if (chr[i][j] == 'L')
                j--;

            else if (chr[i][j] == 'R')
                j++;

            else if (chr[i][j] == 'U')
                i--;

            else if (chr[i][j] == 'D')
                i++;

            k--;
        }
        System.out.println(-1);
    }

}
