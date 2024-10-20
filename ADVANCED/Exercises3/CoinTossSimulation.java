package ADVANCED.Exercises3;

import java.util.Random;
import java.util.Scanner;

public class CoinTossSimulation {
    // Method to simulate flipping a coin
    public static boolean flip() {
        Random random = new Random();
        return random.nextBoolean(); // Returns true for heads, false for tails
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        String choice;

        // Loop to allow the user to toss the coin multiple times
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2): ");
            choice = scanner.next();

            if (choice.equals("1")) {
                // Toss the coin
                if (flip()) {
                    headsCount++;
                    System.out.println("Result: Heads");
                } else {
                    tailsCount++;
                    System.out.println("Result: Tails");
                }
            } else if (!choice.equals("2")) {
                System.out.println("Invalid choice! Please enter 1 or 2.");
            }
        } while (!choice.equals("2"));

        // Display the total results
        System.out.println("\nTotal Tosses:");
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);

        // Close the scanner
        scanner.close();
    }
}
/*
Choose an option:
1. Toss Coin
2. Exit
Enter your choice (1 or 2): 1
Result: Heads

Choose an option:
1. Toss Coin
2. Exit
Enter your choice (1 or 2): 1
Result: Tails

Choose an option:
1. Toss Coin
2. Exit
Enter your choice (1 or 2): 2

Total Tosses:
Heads: 1
Tails: 1

            CoinTossSimulation
+-----------------------------------------+
|                                         |
+-----------------------------------------+
| + flip(): boolean                       |
| + main(args: String[]): void            |
+-----------------------------------------+

*/
