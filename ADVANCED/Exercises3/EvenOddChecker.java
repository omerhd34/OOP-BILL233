package ADVANCED.Exercises3;

import java.util.Scanner;

public class EvenOddChecker {

    // isEven metodu: Verilen sayının çift olup olmadığını kontrol eder
    public static boolean isEven(int number) {
        return number % 2 == 0; // Eğer sayı 2'ye bölündüğünde kalan 0 ise, çift sayıdır.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sonsuz döngü ile sürekli giriş alacağız
        while (true) {
            // Kullanıcıdan bir sayı iste
            System.out.print("Enter an integer (negative number to exit): ");
            int number = input.nextInt();

            // Negatif bir sayı girildiğinde programı sonlandır
            if (number < 0) {
                break;
            }

            // Sayının çift veya tek olduğunu belirle ve sonucu göster
            if (isEven(number)) {
                System.out.printf("%d is even.\n", number);
            } else {
                System.out.printf("%d is odd.\n", number);
            }
        }
    }
}
/*
Enter an integer (negative number to exit): 4
4 is even.
Enter an integer (negative number to exit): 7
7 is odd.
Enter an integer (negative number to exit): -1

               EvenOddChecker
---------------------------------------

---------------------------------------
+ isEven(number: int): boolean
+ main(args: String[]): void
---------------------------------------
*/

