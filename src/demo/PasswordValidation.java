//Java program to check password of minimum 8 characters 

package demo;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Validating the password
        boolean isValidPassword = isMinimumLength(password, 8);

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
}
