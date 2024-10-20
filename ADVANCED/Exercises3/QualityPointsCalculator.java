package ADVANCED.Exercises3;

import java.util.Scanner;

public class QualityPointsCalculator {
    // Method to determine quality points based on average
    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100) {
            return 4;
        } else if (average >= 80 && average <= 89) {
            return 3;
        } else if (average >= 70 && average <= 79) {
            return 2;
        } else if (average >= 60 && average <= 69) {
            return 1;
        } else {
            return 0;
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for student's average
        System.out.print("Enter the student's average (0-100): ");
        int average = scanner.nextInt();

        // Get the quality points using the qualityPoints method
        int qualityPoint = qualityPoints(average);

        // Display the result
        System.out.printf("The quality point for an average of %d is: %d\n", average, qualityPoint);

        // Close the scanner
        scanner.close();
    }
}
/*
Enter the student's average (0-100): 85
The quality point for an average of 85 is: 3

             QualityPointsCalculator
+-----------------------------------------------+
|                                               |
+-----------------------------------------------+
| + qualityPoints(average: int): int            |
| + main(args: String[]): void                  |
+-----------------------------------------------+

 */