package BEGINNING;

import java.util.Scanner; // Scanner sınıfını kullanmak için import

public class DigitSeparator {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan beş basamaklı bir sayı iste
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        // Beş basamaklı sayının geçerli olup olmadığını kontrol et
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a five-digit number.");
        } else {
            // Basamakları ayırma işlemi
            int digit1 = number / 10000;           // İlk basamağı elde et
            int digit2 = (number / 1000) % 10;     // İkinci basamağı elde et
            int digit3 = (number / 100) % 10;      // Üçüncü basamağı elde et
            int digit4 = (number / 10) % 10;       // Dördüncü basamağı elde et
            int digit5 = number % 10;              // Beşinci basamağı elde et

            // Basamakları üçer boşlukla yazdır
            System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
        }

        // Scanner'ı kapat
        input.close();
    }
}
/*
Enter a five-digit number: 52784
5   2   7   8   4
*/
