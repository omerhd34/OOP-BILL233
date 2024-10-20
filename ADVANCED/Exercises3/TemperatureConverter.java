package ADVANCED.Exercises3;

import java.util.Scanner;

public class TemperatureConverter {
    // Method to convert Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // Method to convert Celsius to Fahrenheit
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 to convert Fahrenheit to Celsius, or 2 to convert Celsius to Fahrenheit: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = celsius(fahrenheit);
            System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = fahrenheit(celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
/*
Enter 1 to convert Fahrenheit to Celsius, or 2 to convert Celsius to Fahrenheit: 1
Enter temperature in Fahrenheit: 4
Temperature in Celsius: -15,56

Enter 1 to convert Fahrenheit to Celsius, or 2 to convert Celsius to Fahrenheit: 2
Enter temperature in Celsius: 24
Temperature in Fahrenheit: 75,20

+------------------------------------+
|        TemperatureConverter        |
+------------------------------------+
| - celsius(fahrenheit: double): double |
| - fahrenheit(celsius: double): double |
+------------------------------------+
| + main(args: String[]): void       |
+------------------------------------+
*/