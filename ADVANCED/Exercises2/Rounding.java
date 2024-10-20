package ADVANCED.Exercises2;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sonsuz döngü ile sürekli giriş alacağız
        while (true) {
            // Kullanıcıdan bir sayı iste
            System.out.print("Enter a number to round (negative number to exit): ");
            double x = input.nextDouble();

            // Negatif bir sayı girildiğinde programı sonlandır
            if (x < 0) {
                break;
            }

            // Yuvarlama işlemi: x'e 0.5 ekle ve sonucu Math.floor ile aşağı yuvarla
            long y = (long) Math.floor(x + 0.5);

            // Sonuçları göster
            System.out.printf("Original number: %.2f, Rounded number: %d\n", x, y);
        }
    }
}
/*
Enter a number to round (negative number to exit): 0,5
Original number: 0,50, Rounded number: 1
Enter a number to round (negative number to exit): 0,42
Original number: 0,42, Rounded number: 0
Enter a number to round (negative number to exit): 0,75
Original number: 0,75, Rounded number: 1
Enter a number to round (negative number to exit): -1

                    Rounding
    ----------------------------------------
    + main(args: String[]): void
    ----------------------------------------

*/
