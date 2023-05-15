//Java program to create regex for valid mobile number

package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = sc.nextLine();

        // Validating mobile number
        
        /*
         * ^: Matches the start of the string.
         * \\d{2}: Matches exactly 2 digits for the country code.
         * ' ' : Matches a single space character.
         * \\d{10}: Matches exactly 10 digits for the mobile number.
         * $: Matches the end of the string.
         */
        Pattern pattern = Pattern.compile("^\\d{2} \\d{10}$");
// Creating a matcher object to match the mobile number against the pattern
        Matcher matcher = pattern.matcher(mobileNumber);
        // Checking if the mobile number matches the pattern
        boolean isValidMobileNumber = matcher.matches();

        if (isValidMobileNumber) {// If the mobile number is valid
            System.out.println("Valid mobile number!");
        } else {// If the mobile number is invalid
            System.out.println("Invalid mobile number. Please make sure it follows the specified format.");
        }

        sc.close();
    }
}
