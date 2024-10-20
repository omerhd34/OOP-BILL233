package ADVANCED.Exercises3;

import java.util.Scanner;

public class ReverseDigits {
    // Method to reverse the digits of an integer
    public static int reverse(int number) {
        int reversed = 0;

        // Extract digits and build the reversed number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Add digit to the reversed number
            number /= 10; // Remove the last digit
        }

        return reversed;
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an integer input
        System.out.print("Enter an integer to reverse: ");
        int number = scanner.nextInt();

        // Get the reversed number using the reverse method
        int reversedNumber = reverse(number);

        // Display the reversed number
        System.out.printf("Reversed number: %d\n", reversedNumber);

        // Close the scanner
        scanner.close();
    }
}
/*
Enter an integer to reverse: 7631
Reversed number: 1367

             ReverseDigits
+-------------------------------------+
|                                     |
+-------------------------------------+
| + reverse(number: int): int         |
| + main(args: String[]): void        |
+-------------------------------------+

*/

