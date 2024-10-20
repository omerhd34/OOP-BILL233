package ADVANCED.Exercises3;

import java.util.Scanner;

public class DigitSeparator {

    // Part (a) Calculate quotient
    public static int calculateQuotient(int a, int b) {
        return a / b; // Integer division to find the quotient
    }

    // Part (b) Calculate remainder
    public static int calculateRemainder(int a, int b) {
        return a % b; // Modulus operator to find the remainder
    }

    // Part (c) Method to display digits
    public static void displayDigits(int number) {
        // Validate the number
        if (number < 1 || number > 99999) {
            System.out.println("Number out of range. Please enter a number between 1 and 99999.");
            return;
        }

        int divisor = 10000; // Start with the divisor for the leftmost digit

        // Loop through each digit
        while (divisor > 0) {
            int digit = number / divisor; // Get the current digit
            System.out.print(digit + "  "); // Print the digit followed by two spaces
            number %= divisor; // Remove the current digit from the number
            divisor /= 10; // Move to the next digit
        }
        System.out.println(); // Print a newline after all digits
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part (a) and (b): Calculate quotient and remainder
        System.out.print("Enter two integers (a and b): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int quotient = calculateQuotient(a, b);
        int remainder = calculateRemainder(a, b);

        System.out.printf("Quotient of %d / %d = %d\n", a, b, quotient);
        System.out.printf("Remainder of %d %% %d = %d\n", a, b, remainder);

        // Part (c) and (d): Display digits
        System.out.print("Enter a number between 1 and 99999: ");
        int number = input.nextInt();
        System.out.print("Digits of " + number + " are: ");
        displayDigits(number);
    }
}
/*
Enter two integers (a and b): 13 4
Quotient of 13 / 4 = 3
Remainder of 13 % 4 = 1
Enter a number between 1 and 99999: 4562
Digits of 4562 are: 4  5  6  2

          DigitSeparator
-------------------------------------

-------------------------------------
+ calculateQuotient(a: int, b: int)
+ calculateRemainder(a: int, b: int)
+ displayDigits(number: int)
+ main(args: String[])
-------------------------------------
 */