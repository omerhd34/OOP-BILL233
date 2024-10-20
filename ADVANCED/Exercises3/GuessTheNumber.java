/* Aşağıdaki gibi "sayıyı tahmin et" oyunu oynayan bir uygulama yazın: Programınız 1 ile 1000 aralığında rastgele bir tam sayı
seçerek tahmin edilecek sayıyı seçer. Uygulama 1 ile 1000 arasında bir sayı tahmin edin istemini görüntüler. Oyuncu ilk
tahminini girer. Oyuncunun tahmini yanlışsa, programınız oyuncunun doğru cevaba "odaklanmasına" yardımcı olmak için Çok yüksek.
Tekrar dene. veya Çok düşük. Tekrar dene. mesajını görüntülemelidir. Program kullanıcıdan bir sonraki tahmini istemelidir.
Kullanıcı doğru cevabı girdiğinde Tebrikler.
Sayıyı tahmin ettiniz! mesajını görüntüler ve kullanıcının tekrar oynamak isteyip istemediğini seçmesine izin verir. */

package ADVANCED.Exercises3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(1000) + 1; // Generate a number between 1 and 1000
            int guess = 0;
            System.out.println("Guess a number between 1 and 1000:");

            // Loop until the correct number is guessed
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Congratulations. You guessed the number!");
                }
            }

            // Ask the user if they want to play again
            System.out.print("Would you like to play again? (yes or no): ");
            String response = input.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}

/*
Guess a number between 1 and 1000:
Enter your guess: 555
Too low. Try again.
Enter your guess: 42
Too low. Try again.
Enter your guess: 990
Too high. Try again.
Enter your guess: 888
Too low. Try again.
Enter your guess: 915
Too low. Try again.
Enter your guess: 956
Too high. Try again.
Enter your guess: 950
Congratulations. You guessed the number!
Would you like to play again? (yes or no):

+-------------------------+
|      GuessTheNumber     |
+-------------------------+
| - random: Random        |
| - input: Scanner        |
+-------------------------+
| + main(args: String[]): void |
| - playGame(): void          |
| - getUserGuess(): int       |
| - askToPlayAgain(): boolean |
+-------------------------+


*/