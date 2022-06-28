package com.java.string_programming;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        //since, password doesn't allow spaces, taking input in next() method.
        String password = scanner.next();
        //Calling checkPassword() method to check the password is valid or not
        //Passing 'password' variable as a parameter to checkPassword() to validate.
        if (checkPassword(password))
            System.out.println("Valid Password"); //Prints if checkPassword() method, returns true;
        else
            System.out.println("Invalid Password"); //Prints if checkPassword() method, returns false;

    }

    private static boolean checkPassword(String password) {

        //Checking whether the string length is greater than 8 and less than 15.
        if (password.length() > 8 && password.length() < 15) {

            //Declaring variable all integer type to get the count of each case.
            int upperCaseCharacterCount, lowerCaseCharacterCount, numberCount, specialCharacterCount;
            //Initializing all integer type variable to zero.
            upperCaseCharacterCount = lowerCaseCharacterCount = numberCount = specialCharacterCount = 0;

            //Storing all the respective alphabets and numbers in respective variables.
            String upperCaseAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerCaseAlphabets = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";

            //for loop to traverse each character in password variable (String).
            for (int i = 0; i < password.length(); i++) {
                //Checking whether character present at 'i' is upper case.
                if (upperCaseAlphabets.contains(password.charAt(i) + "")) {
                    upperCaseCharacterCount++; //if true. Incrementing.
                }
                //Checking whether character present at 'i' is lower case.
                else if (lowerCaseAlphabets.contains(password.charAt(i) + "")) {
                    lowerCaseCharacterCount++; //if true. Incrementing.
                }
                //Checking whether character present at 'i' is  number.
                else if (numbers.contains(password.charAt(i) + "")) {
                    numberCount++; //if true. Incrementing.
                }
                //if none of the cases are true then it is a special character.
                else
                    specialCharacterCount++;
            }

            //Checking whether all the case are present. In other words not equal to zero.
            return (upperCaseCharacterCount != 0 && lowerCaseCharacterCount != 0 &&
                    numberCount != 0 && specialCharacterCount != 0);
            //return true, if all case are present
            //return false, if even one case is not present.
        }

        return false; //return false, if length of the string is less than or equal to 8
        //and greater than equal to 15.
    }

}
