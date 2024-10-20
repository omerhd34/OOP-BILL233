/* 6.33:
Aşağıdaki gibi "sayıyı tahmin et" oyunu oynayan bir uygulama yazın: Programınız 1 ile 1000 aralığında rastgele bir tam sayı
seçerek tahmin edilecek sayıyı seçer. Uygulama 1 ile 1000 arasında bir sayı tahmin edin istemini görüntüler. Oyuncu ilk
tahminini girer. Oyuncunun tahmini yanlışsa, programınız oyuncunun doğru cevaba "odaklanmasına" yardımcı olmak için Çok yüksek.
Tekrar dene. veya Çok düşük. Tekrar dene. mesajını görüntülemelidir. Program kullanıcıdan bir sonraki tahmini istemelidir.
Kullanıcı doğru cevabı girdiğinde Tebrikler.
Sayıyı tahmin ettiniz! mesajını görüntüler ve kullanıcının tekrar oynamak isteyip istemediğini seçmesine izin verir. */

/*6.34:
6.33'ün programını, oyuncunun yaptığı tahmin sayısını sayacak şekilde değiştirin. Sayı 10 veya daha azsa, şunu
görüntüleyin Ya sırrı biliyorsun ya da şanslısın! Oyuncu sayıyı 10 denemede tahmin ederse, şunu görüntüleyin Aha! Sırrı
biliyorsun! Oyuncu 10'dan fazla tahmin yaparsa, şunu görüntüleyin Daha iyisini yapabilmelisin! Neden 10'dan fazla tahmin
gerekmesin? Pekala, her "iyi tahminde" oyuncu sayıların yarısını, sonra kalan sayıların yarısını ve böyle devam edebilmelidir.
*/
package ADVANCED.Exercises3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(1000) + 1; // 1-1000 arasında sayı seçilir
            int guess = 0;
            int guessCount = 0; // Tahmin sayacını başlat
            System.out.println("Guess a number between 1 and 1000:");

            // Kullanıcı doğru tahmin yapana kadar döngü
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                guessCount++; // Tahmin sayacını artır

                if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Congratulations. You guessed the number!");

                    // Tahmin sayısına göre mesaj göster
                    if (guessCount < 10) {
                        System.out.println("Either you know the secret or you got lucky!");
                    } else if (guessCount == 10) {
                        System.out.println("Aha! You know the secret!");
                    } else {
                        System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
                    }
                }
            }

            // Kullanıcıya tekrar oynamak isteyip istemediğini sor
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
Enter your guess: 500
Too high. Try again.
Enter your guess: 250
Too low. Try again.
Enter your guess: 375
Congratulations. You guessed the number!
Aha! You know the secret!
Would you like to play again? (yes or no): no
Thanks for playing!

+-------------------------+
| GuessTheNumberWithCount |
+-------------------------+
| - random: Random        |
| - input: Scanner        |
+-------------------------+
| + main(args: String[]): void        |
| - playGame(): void                  |
| - getUserGuess(): int               |
| - askToPlayAgain(): boolean         |
| - displayResultMessage(guessCount: int): void |
+-------------------------+

 */