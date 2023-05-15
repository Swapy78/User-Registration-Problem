//Java program to create regex for valid email id

package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        // Validating email address
        /*
         * ^: Matches the start of the string.
         * [A-Za-z0-9]+: Matches one or more alphanumeric characters for the mandatory part of the email address before the "@" symbol.
         * ([._%+-][A-Za-z0-9]+)*: Matches zero or more occurrences of a dot, underscore, percent sign, plus sign, or hyphen followed by one or more alphanumeric characters for the optional part of the email address before the "@" symbol.
         * @: Matches the "@" symbol.
         * [A-Za-z0-9]+: Matches one or more alphanumeric characters for the mandatory part of the email address after the "@" symbol.
         * (\\.[A-Za-z]{2,}){1,2}: Matches one or two occurrences of a dot followed by two or more alphabetic characters for the optional part of the email address after the "@" symbol.
         * $: Matches the end of the string.
         */
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z]{2,}){1,2}$");
     // Creating a matcher object to match the email id against the pattern
        Matcher matcher = pattern.matcher(email);
        // Checking if the email id matches the pattern
        boolean isValidEmail = matcher.matches();

        if (isValidEmail) {// If the email id is valid
            System.out.println("Valid email address!");
        } else {// If the email id is invalid
            System.out.println("Invalid email address. Please make sure it follows the specified format.");
        }

        sc.close();
    }
}

