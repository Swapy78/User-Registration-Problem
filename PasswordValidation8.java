//Java program to check password with at least 1 special character

package demo;

import java.util.Scanner;

public class PasswordValidation4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Validating the password
        boolean isValidPassword = isMinimumLength(password, 8) && hasUppercaseLetter(password)
                 && hasDigit(password) && hasSpecialCharacter(password);

        if (isValidPassword) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password. Please make sure it follows the specified rules.");
        }

        sc.close();
    }
    // Method to check if the password meets the minimum length requirement
    private static boolean isMinimumLength(String password, int minLength) {
        return password.length() >= minLength;
    }
 // Method to check if the password contains at least one uppercase letter
    private static boolean hasUppercaseLetter(String password) {
        return !password.equals(password.toLowerCase());
    }
 // Method to check if the password contains at least one digit
    private static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
 // Method to check if the password contains at least one special character 
    private static boolean hasSpecialCharacter(String password) {
    	// Variable to keep track of the number of special characters
        int count = 0;  

        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                count++;
            }
        }
     // Return true if exactly one special character is found
        return count == 1;  
    }
}
