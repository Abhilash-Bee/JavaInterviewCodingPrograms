package com.java.string_programming;

/*
 * Fractions To Mixed Fraction
 *
 * Sample input 1
 * 9.5
 *
 * Sample output 1
 * 9 1/2
 *
 * Sample input 2
 * 0.25
 *
 * Sample output 2
 * 0 1/4
 *
 * Sample input 3
 * 4.75
 *
 * Sample output 3
 * 4 3/4
 *
 */

import java.util.Scanner;

public class FractionsToIrrationalNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        double temp = Double.parseDouble(str);
        //System.out.println(temp);
        int index=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == '.') {
                index=i;
                break;
            }
        }

        String trim = str.substring(index+1);
        int len = trim.length();
        //System.out.println(len);
        int mul=1;
        for(int i=0;i<len;i++)
            mul*=10;

        //System.out.println(mul);
        int q = (int)(temp*mul)/mul;
        int r = (int)(temp*mul)%mul;

        System.out.print(q+" ");
        for(int i=r;i>=1;i--) {
            if(r%i == 0 && mul%i == 0) {
                System.out.print(r/i +"/"+ mul/i);
                System.exit(0);
            }
        }

    }

}
