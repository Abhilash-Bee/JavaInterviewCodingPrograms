package com.java.string_programming;

/*
 * ROT13 is a simple Alphabet Substitution Cipher that takes in a String
 * str as input and provides an encoded version of Str, by replacing the
 * current English Alphabet from a message with those present 13 positions
 * ahead of that Alphabet.
 *
 * For example, the alphabet 'a' is replaced by 'n', 'b' by 'o', 'c' by 'p', etc.,
 *
 * Write a program to read a string Str and print the ROT13 encoded version of Str.
 *
 * Notes:
 * i) Both Upper Case and Lower Case alphabets are changed with the relevant case
 * only. Numbers and punctuation are not changed.
 *
 * ii) if Z/z is reached, start again from A/a.
 *
 * Read the input from STDIN (Standard input) and write the output to
 * STDOUT (Standard output). Do not print arbitrary strings while reading
 * the input or printing the output as those would contribute to STDOUT.
 *
 * Constraint:
 * Length of Str <= 10000
 *
 * Input Format:
 * The input contains Str.
 *
 * Output Format:
 * The output contains ROT13 encoded version of Str.
 *
 * Sample Input 1:
 * Hello, World!
 *
 * Sample Output 1:
 * Uryyb, Jbeyq!
 *
 * Note:
 * The special characters are not changed.
 *
 */

import java.util.Scanner;

public class ROT13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        rot13(str);

    }

    static void rot13(String str) {

        String rot = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                rot += (char) (65 + (str.charAt(i) + 13 - 65) % 26);
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                rot += (char) (97 + (str.charAt(i) + 13 - 97) % 26);
            else
                rot += str.charAt(i);
        }
        System.out.println(rot);

    }

}
