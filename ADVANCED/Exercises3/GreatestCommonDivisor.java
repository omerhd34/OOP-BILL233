package ADVANCED.Exercises3;

import java.util.Scanner;

public class GreatestCommonDivisor {
    // Method to find the greatest common divisor using Euclid's Algorithm
    public static int gcd(int a, int b) {
        // Keep finding the remainder until b becomes zero
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the GCD using the gcd method
        int result = gcd(num1, num2);

        // Display the result
        System.out.printf("The GCD of %d and %d is: %d\n", num1, num2, result);

        // Close the scanner
        scanner.close();
    }
}
/*
Enter the first integer: 54
Enter the second integer: 24
The GCD of 54 and 24 is: 6

            GreatestCommonDivisor
+------------------------------------------+
|                                          |
+------------------------------------------+
| + gcd(a: int, b: int): int               |
| + main(args: String[]): void             |
+------------------------------------------+
*/