package MEDIUM.BookExercises4;

import java.util.Scanner;

public class RetailCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int productNumber;
        int quantity;
        double total = 0.0;

        // Gözcü kontrollü döngü
        while (true) {
            // Ürün numarası ve miktar al
            System.out.print("Enter product number (1-5) or 0 to stop: ");
            productNumber = input.nextInt();

            // Kullanıcı 0 girerse döngüden çık
            if (productNumber == 0) {
                break;
            }

            // Geçersiz ürün numarası kontrolü
            if (productNumber < 1 || productNumber > 5) {
                System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                continue; // Döngünün başına dön
            }

            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();

            // Ürün numarasına göre fiyatı belirle ve toplamı güncelle
            switch (productNumber) {
                case 1:
                    total += 2.98 * quantity;
                    break;
                case 2:
                    total += 4.50 * quantity;
                    break;
                case 3:
                    total += 9.98 * quantity;
                    break;
                case 4:
                    total += 4.49 * quantity;
                    break;
                case 5:
                    total += 6.87 * quantity;
                    break;
            }
        }
        // Toplam perakende değerini yazdır
        System.out.printf("Total retail value of all products sold: $%.2f\n", total);
    }
}
/*
Enter product number (1-5) or 0 to stop: 1
Enter quantity sold: 3
Enter product number (1-5) or 0 to stop: 2
Enter quantity sold: 2
Enter product number (1-5) or 0 to stop: 0
Total retail value of all products sold: $17.94
*/