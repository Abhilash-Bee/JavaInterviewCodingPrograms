package com.java.array_programming;

import java.util.Scanner;

public class PlayingWithArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = scan.nextInt();

        System.out.println(playingArray(n, ar));

    }

    static int playingArray(int n, int[] ar) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += ar[i];

        return sum * n;
    }

}
