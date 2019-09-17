package jJava;

import java.util.Scanner;
import java.util.Set;

public class InputVerification {
    //public static final String DOUBLE_REGEX = "";
    //public static final String INTEGER_REGEX = "?-";

    public static String verify(String regex) {
        return verify("Please type in a response: ", regex);
    }

    public static String verify(String prompt, String regex) {
        return verify(prompt, regex, "Wrong input. Please try again: ");
    }

    public static String verify(String prompt, String regex, String errMessage) {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt); // prompts the user

        while (true) { // loops until input given matches the regular expression
            String s = in.nextLine();
            if (s.matches(regex)) // returns if the the input if it is in the correct format.
                return s;
            System.out.print(errMessage);
        }
    }

    public static String verify(Set valid) {
        return verify("Please type in a response: ", valid);
    }

    public static String verify(String prompt, Set valid) {
        return verify(prompt, valid, "Wrong input. Please try again: ");
    }

    public static String verify(String prompt, Set valid, String errMessage) {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt); // prompts the user

        while(true) {
            String s = in.nextLine();
            if(valid.contains(s))
                return s;
            System.out.print(errMessage);
        }
    }
}
