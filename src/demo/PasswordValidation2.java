//Java program to check password with at least 1 upper case 

package demo;

import java.util.Scanner;

public class PasswordValidation2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Validating password
        boolean isValidPassword = isMinimumLength(password, 8) && hasUppercaseLetter(password);
                

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
    // Method to check if the password meets the upper case requirement
    private static boolean hasUppercaseLetter(String password) {
        return !password.equals(password.toLowerCase());
    }

}