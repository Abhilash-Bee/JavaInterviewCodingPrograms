package com.java.string_programming;

/*
Light bulbs

Alice has arranged N bulbs in a row. The ON bulbs are represented by a character
O and the OFF bulbs are represented by an X. She is having one switch, which can
turn on and off only the first bulb from the left. Every time she presses the
switch, the state of the first bulb toggles.

These bulbs are having a special feature, a bulb can switch its state automatically
if the bulb in its left gets turned off. Alice presses the switch K times.

Task
Determine the final state of all bulbs.

Example
Assumptions
K = 2
S = OOXOX

Approach
For 1St switch press:
Since the first bulb gets OFF after pressing the switch,2nd bulb toggles its states:
Since the second bulb also gets OFF 3rd bulb switches its state too.
S = XXOOX


For 2nd switch press:
• Since the first bulb gets ON after pressing the switch, 2nd bulb doe not toggle
its states.
S = OXOOX

Therefore the answer is OXOOX.

Function description
Complete the function solve provided in the editor. This function takes the following
2 parameters and returns the answer:

K: Represents an integer denoting K
S: Represents the string denoting the initial state of each bulb

Input format
Note: This is the input format you must use to provide custom input (available above
the Compile and Test button).

The first line contains 7 denoting the number of test cases. T also specifies the number
of times you have to run the solve function on a different set of inputs.

For each test case:
The first line contains an integer K denoting the number of times Alice presses
the switch.
The second line contains the string S. The ON bulbs are represented by a character
O and the OFF bulbs are denoted by character X.

Explanation
The first line denotes the number of test cases, T = 2

The first test case
Given
K = 2
S = XOXXO

Approach
Configuration after switch pressed 1 time: OOXXO
Configuration after switch pressed 2 times: XXOXO

The second test case
Given
K = 3
S = XOXXO

Approach
Configuration after switch pressed 1 time OOXXO.
Configuration after switch pressed 2 times XXOXO.
Configuration after switch pressed 3 times OXOXO.

Sample input 1:
4
3
XOXOO
3
XOXX
3
XX
5
OXXO

Sample output 1:
OXOOO
OXOX
OO
XOOO

Sample input 2:
3
3
XOO
5
OXO
3
OXOXX

Sample output2:
OXX
XOX
XXXOX

 *
 */

import java.util.Scanner;

public class LightBulbs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s = scan.next();
            char[] ar = s.toCharArray();

            for (int j = 0; j < n; j++) {
                if (ar[0] == 'X')
                    ar[0] = 'O';
                else {
                    char prev = ar[0];
                    ar[0] = 'X';
                    char pres = ar[0];

                    for (int k = 1; k < ar.length; k++) {
                        if (prev == 'O' && pres == 'X') {
                            prev = ar[k];

                            if (ar[k] == 'O')
                                ar[k] = 'X';
                            else
                                ar[k] = 'O';

                            pres = ar[k];
                        }
                    }
                }
            }
            System.out.println(new String(ar));
        }
    }

}
