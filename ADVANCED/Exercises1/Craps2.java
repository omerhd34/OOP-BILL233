package ADVANCED.Exercises1;

import java.util.Random;
import java.util.Scanner;

public class Craps2 {
    private static final Random randomNumbers = new Random();
    private enum Status { CONTINUE, WON, LOST }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bankBalance = 1000.0;
        boolean keepPlaying = true;

        System.out.println("Welcome to Craps!");

        while (keepPlaying && bankBalance > 0) {
            System.out.printf("Your current balance is $%.2f%n", bankBalance);

            // Kullanıcıdan bahis al
            double wager = 0;
            do {
                System.out.print("Enter a wager: ");
                wager = input.nextDouble();

                if (wager > bankBalance) {
                    System.out.println("Your wager cannot exceed your bank balance. Please try again.");
                }
            } while (wager > bankBalance);

            // Oyunu oynat
            Status gameStatus = play();

            // Oyunun sonucuna göre bakiyeyi güncelle
            if (gameStatus == Status.WON) {
                System.out.println("Player wins!");
                bankBalance += wager;
            } else {
                System.out.println("Player loses!");
                bankBalance -= wager;

                // Eğer bank balance sıfıra düştüyse, oyuncuyu bilgilendir
                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                }
            }

            // Rastgele bir sohbet mesajı göster
            displayChatterMessage();

            // Oyuncuya tekrar oynamak isteyip istemediğini sor
            System.out.print("Do you want to play again? (yes or no): ");
            keepPlaying = input.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        input.close();
    }

    // Craps oyununu oynayan metot
    public static Status play() {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;
            }
        }

        return gameStatus;
    }

    // Zarları atan ve toplamlarını döndüren metot
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    // Rastgele bir sohbet mesajı gösteren metot
    public static void displayChatterMessage() {
        int messageNumber = randomNumbers.nextInt(3);

        switch (messageNumber) {
            case 0:
                System.out.println("Oh, you're going for broke, huh?");
                break;
            case 1:
                System.out.println("Aw c'mon, take a chance!");
                break;
            case 2:
                System.out.println("You're up big. Now's the time to cash in your chips!");
                break;
        }
    }
}
/*
Welcome to Craps!
Your current balance is $1000,00
Enter a wager: 200
Player rolled 1 + 4 = 5
Point is 5
Player rolled 5 + 4 = 9
Player rolled 2 + 3 = 5
Player wins!
Aw c'mon, take a chance!
Do you want to play again? (yes or no): no
Thanks for playing!

+-----------------------------+
|           Craps             |
+-----------------------------+
| - randomNumbers: Random     |
| - bankBalance: double       |
| + main(args: String[]): void|
| + play(): Status            |
| + rollDice(): int           |
| + displayChatterMessage(): void |
| - getWager(): double        |
+-----------------------------+
| <<enumeration>> Status      |
| CONTINUE, WON, LOST         |
+-----------------------------+

*/