package com.java.array_programming;

/*
 * CP Friends
 *
 * 100 marks
 *
 * There are 3 friends who are trying to solve N problems. If anyone of them
 * can solve the problem successfully then he will be represented by 1 else 0.
 *
 * There is one more condition that they will implement the ith problem only
 * when at least two of them will be able to solve the problem, otherwise
 * they will not be able to solve the ith problem.
 *
 * You need to output the number of problems they can solve.
 *
 * Input Format
 * --> First line of input consists of a single integer n, number of problems.
 * --> Next n lines each consists of 3 space-separated integers, representing
 *     if the problem is solvable by the person or not. Each integer is either
 *     0 or 1.
 *
 * Constraints
 * 1 <= n <= 10000
 *
 * Output Format
 * Output the number of problems they can solve
 *
 * Sample Input 1:
 * 5
 * 0 0 1
 * 1 1 1
 * 0 0 1
 * 1 1 0
 * 1 0 0
 *
 * Sample Output 1:
 * 2
 *
 */


import java.util.Scanner;

public class CP_Friends {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] ar = new int[n][3];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                ar[i][j]=scan.nextInt();
            }
        }

        System.out.println(friends(n, ar));

    }

    static int friends(int n, int[][] ar) {
        int res = 0, count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                if(ar[i][j] == 1)
                    count++;
            }
            if(count>=2)
                res++;

            count=0;
        }
        return res;
    }

}
