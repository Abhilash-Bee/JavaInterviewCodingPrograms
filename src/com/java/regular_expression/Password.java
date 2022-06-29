package com.java.regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String password;
    private Pattern upperCaseCharacters = Pattern.compile("[A-Z]");
    private Pattern lowerCaseCharacters = Pattern.compile("[a-z]");
    private Pattern numberCase = Pattern.compile("\\d");
    private Pattern specialCase = Pattern.compile("\\W");

    public Password(String password) {
        if(password.length() > 8 && password.length() < 15)
            this.password = password;
        else
            this.password = "null";
    }
    private static boolean checkPassword(Password password) {
        if(!password.password.equals("null")) {
            Matcher upperCaseMatcher = password.upperCaseCharacters.matcher(password.password);
            Matcher lowerCaseMatcher = password.lowerCaseCharacters.matcher(password.password);
            Matcher numberMatcher = password.numberCase.matcher(password.password);
            Matcher specialMatcher = password.specialCase.matcher(password.password);

            return (upperCaseMatcher.find() && lowerCaseMatcher.find() &&
                numberMatcher.find() && specialMatcher.find());
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        Password password = new Password(scanner.next());
        if(checkPassword(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");

    }

}
