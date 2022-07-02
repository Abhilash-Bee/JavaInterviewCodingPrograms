package com.java.array_programming;

/*
 * Infosys Interview Question
 *
 * Short ID Debug
 *
Instructions:

This is a debug type question.
Once you choose the language of your choice to code, the editor window will be
populated with a program.
The program would have one or more bugs which prevent it from providing right
results upon clicking "Run Code"

You need to understand the question and the provided program. You need to then
correct the program such that, upon running the program, all the test cases
pass successfully.

This is denoted by a message that says "Code Compiled Successfully. All available
test cases passed!"

You can submit the code once you are done.


Question description:

Example
Suppose two participants have identifiers as 8967 and 9485.

In the following way we can identify the M, such that (ID mod M) will produce
corresponding smaller ids:

* 8-digit Ids       Mod 2      Mod 3     Mod 8

     8967             1          0         7
     9485             1          2         5


* Explanation
2 doesn't give unique IDs. Both 3 and 8 give unique IDs. But 3 is the smallest
positive integer to do so. Hence, the answer here is 3 (M=3).

Input Format:

Input line starts with an integer containing the number of participants in the show.
This integer is followed by the list of 4-digit identifiers for each participant.
The number of participants will be between 1<=participants<=30.

Output Format:

Smallest Integer M

Example Input           Example Output
2 9098 8495                   2
3 8663 7436 9293              4

 *
 */

import java.util.Scanner;

public class Short_ID_Debug {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = scan.nextInt();

        System.out.println(shortID(n, ar));

    }

    static int shortID(int n, int[] ar) {
        int k = 2;
        while (true) {
            String str = "";
            for (int i = 0; i < n; i++) {
                int temp = ar[i] % k;
                str += temp;
                str += ",";
            }
            //System.out.println(str);
            int i;
            String[] star = str.split(",");
            out:
            for (i = 0; i < star.length - 1; i++) {
                for (int j = i + 1; j < star.length; j++) {
                    if (star[i].equals(star[j]))
                        break out;
                }
            }
            if (i != star.length - 1)
                k++;
            else
                return k;
        }
    }

}
