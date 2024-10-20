package ADVANCED.Exercises3;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTutor {
    // Method to generate and ask a new multiplication question
    public static void askQuestion() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate two random one-digit numbers between 1 and 9
        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(9);

        int correctAnswer = number1 * number2;
        int userAnswer;

        // Loop until the student answers correctly
        while (true) {
            System.out.printf("How much is %d times %d? ", number1, number2);
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Very good!");
                break;
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        // Loop to keep asking questions until the user wants to stop
        do {
            askQuestion();
            System.out.print("Do you want to try another question? (yes/no): ");
            continueChoice = scanner.next();
        } while (continueChoice.equalsIgnoreCase("yes"));

        // Close the scanner
        scanner.close();
    }
}
/*
How much is 2 times 6? 12
Very good!
Do you want to try another question? (yes/no): yes
How much is 6 times 5? 30
Very good!
Do you want to try another question? (yes/no): yes
How much is 8 times 5? 1
No. Please try again.
How much is 8 times 5? 40
Very good!
Do you want to try another question? (yes/no): no

               MultiplicationTutor
+-----------------------------------------------+
|                                               |
+-----------------------------------------------+
| + askQuestion(): void                         |
| + main(args: String[]): void                  |
+-----------------------------------------------+

 */