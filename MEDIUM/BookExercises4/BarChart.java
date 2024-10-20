package MEDIUM.BookExercises4;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 5 sayı okumak için döngü
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            int number = input.nextInt();

            // Sayının 1 ile 30 arasında olup olmadığını kontrol et
            if (number < 1 || number > 30) {
                System.out.println("Invalid number. Please enter a number between 1 and 30.");
                i--; // Geçerli bir sayı alana kadar aynı döngü tekrar edilecek
                continue;
            }

            // Yıldızları yazdır
            for (int j = 1; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println(); // Her satırın sonunda yeni bir satır ekle
        }
    }
}
/*
Enter a number between 1 and 30: 7
*******
Enter a number between 1 and 30: 6
******
Enter a number between 1 and 30: 5
*****
Enter a number between 1 and 30: 4
****
Enter a number between 1 and 30: 5
*****
*/