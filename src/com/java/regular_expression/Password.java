package com.java.regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String password;
    private Pattern upperCaseCharacters;
    private Pattern lowerCaseCharacters;
    private Pattern numberCase;
    private Pattern specialCase;

    private Matcher upperCaseMatcher;
    Matcher lowerCaseMatcher;
    Matcher numberMatcher;
    Matcher specialMatcher;

    public Password(String password) {
        if(password.length() > 8 && password.length() < 15)
            this.password = password;
        else
            this.password = "null";
        this.upperCaseCharacters = Pattern.compile("[A-Z]");
        this.lowerCaseCharacters = Pattern.compile("[a-z]");
        this.numberCase = Pattern.compile("\\d");
        this.specialCase = Pattern.compile("\\W");
        this.upperCaseMatcher = upperCaseCharacters.matcher(this.password);
        this.lowerCaseMatcher = lowerCaseCharacters.matcher(this.password);
        this.numberMatcher = numberCase.matcher(this.password);
        this.specialMatcher = specialCase.matcher(this.password);
    }
    private static boolean checkPassword(Password password) {
        if(!password.password.equals("null")) {
            return (password.upperCaseMatcher.find() && password.lowerCaseMatcher.find() &&
                password.numberMatcher.find() && password.specialMatcher.find());
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
