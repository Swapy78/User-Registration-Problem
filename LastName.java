//Java program to create regex for valid last name

package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        // Validating last name
        
        // Regular expression for validating last name
        /*
         * [A-Z]: Matches any uppercase letter from A to Z.
         * This ensures that the first letter of the first name is an uppercase letter.
         * [a-zA-Z]: Matches any letter (either uppercase or lowercase) from A to Z.
         * This allows for any subsequent letters in the first name to be either uppercase or lowercase.
         * {2,}: Specifies that the preceding pattern (matching any letter) should occur at least 2 times.
         * This ensures that the minimum length of the first name (excluding the first letter) is 2 characters.
         * Together with the first uppercase letter, this makes a minimum total length of 3 characters.
         */
        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
     // Creating a matcher object to match the last name against the pattern
        Matcher matcher = pattern.matcher(lastName);
        // Checking if the first name matches the pattern
        boolean isValidLastName = matcher.matches();

        if (isValidLastName) {// If the last name is valid
            System.out.println("Valid last name!");
        } else {// If the last name is invalid
            System.out.println("Invalid last name. Please make sure it starts with a capital letter and has a minimum length of 3 characters.");
        }

        sc.close();
    }
}
