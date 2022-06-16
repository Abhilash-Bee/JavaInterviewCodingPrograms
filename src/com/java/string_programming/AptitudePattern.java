package com.java.string_programming;

/*
 * Aptitude Number Pattern
 *
 * 6
 *
 * 1
 * 1 1
 * 2 1
 * 1 2 1 1
 * 1 1 1 2 2 1
 * 3 1 2 2 1 1
 *
 */

import java.util.Scanner;

public class AptitudePattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern(n);

    }

    static void pattern(int n)
    {
		/*ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		System.out.println(al);
		for(int i=0;i<n-1;i++) {
			ArrayList<Integer> bl = new ArrayList<>();
			int count=1;
			for(int j=0;j<al.size()-1;j++) {
				if(al.get(j)==al.get(j+1))
					count++;
				else {
					bl.add(count);
					bl.add(al.get(j));
					count=1;
				}
			}
			bl.add(count);
			bl.add(al.get(al.size()-1));
			System.out.println(bl);
			al.clear();
			al = (ArrayList<Integer>) bl.clone();
			bl.clear();
		}*/


        String old = "1";
        System.out.println(old);
        for(int i=0;i<n-1;i++) {
            String fresh = "";
            int count = 1;
            for(int j=0;j<old.length()-1;j++) {
                if(old.charAt(j) == old.charAt(j+1))
                    count++;
                else {
                    fresh += count;
                    fresh += old.charAt(j);
                    count=1;
                }
            }
            fresh += count;
            fresh += old.charAt(old.length()-1);
            System.out.println(fresh);
            old = fresh;
        }

    }

}
