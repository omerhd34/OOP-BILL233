package ADVANCED.Exercises3;

import java.util.Scanner;

public class MinimumValue {
    // Method to find the minimum of three numbers using Math.min
    public static double minimum3(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double number3 = scanner.nextDouble();

        // Determine the smallest number
        double smallest = minimum3(number1, number2, number3);

        // Display the result
        System.out.printf("The smallest number is: %.2f\n", smallest);

        // Close the scanner
        scanner.close();
    }
}
/*
Enter the first number:
4.5
Enter the second number:
2.3
Enter the third number:
5.7
The smallest number is: 2.30

+---------------------------------+
|          MinimumValue           |
+---------------------------------+
| + minimum3(num1: double,        |
|            num2: double,        |
|            num3: double):double|
+---------------------------------+
| + main(args: String[])          |
+---------------------------------+
*/