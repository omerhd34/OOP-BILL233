package ADVANCED.Exercises3;

import java.util.Random;
import java.util.Scanner;

public class CAIMultiplicationTutor {
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
                displayCorrectResponse(random);
                break;
            } else {
                displayIncorrectResponse(random);
            }
        }
    }

    // Method to display a random correct response
    public static void displayCorrectResponse(Random random) {
        int response = 1 + random.nextInt(4); // Generate a number between 1 and 4

        // Use a switch statement to issue the response
        switch (response) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
    }

    // Method to display a random incorrect response
    public static void displayIncorrectResponse(Random random) {
        int response = 1 + random.nextInt(4); // Generate a number between 1 and 4

        // Use a switch statement to issue the response
        switch (response) {
            case 1 -> System.out.println("No. Please try again.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
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
How much is 6 times 7? 42
Very good!
Do you want to try another question? (yes/no): yes
How much is 3 times 8? 25
Wrong. Try once more.
How much is 3 times 8? 24
Excellent!
Do you want to try another question? (yes/no): no

               CAIMultiplicationTutor
+----------------------------------------------------+
|                                                    |
+----------------------------------------------------+
| + askQuestion(): void                              |
| + displayCorrectResponse(random: Random): void     |
| + displayIncorrectResponse(random: Random): void   |
| + main(args: String[]): void                       |
+----------------------------------------------------+
*/
