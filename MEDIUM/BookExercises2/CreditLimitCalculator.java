/*
Birkaç mağaza müşterisinden herhangi birinin bir hesaptaki kredi limitini aşıp aşmadığını belirleyecek bir Java uygulaması geliştirin.
Her müşteri için aşağıdaki bilgiler mevcuttur:
a) hesap numarası
b) ay başındaki bakiye
c) bu ay müşteri tarafından tahsil edilen tüm kalemlerin toplamı
d) bu ay müşterinin hesabına uygulanan tüm kredilerin toplamı
e) izin verilen kredi limiti.
Program tüm bu gerçekleri tam sayı olarak girmeli, yeni bakiyeyi hesaplamalı (= beginning balance + charges – credits), yeni bakiyeyi
görüntülemeli ve yeni bakiyenin müşterinin kredi limitini aşıp aşmadığını belirlemelidir. Kredi limiti aşılmış olan müşteriler için
program "Credit limit exceeded" mesajını görüntülemelidir.
*/

package MEDIUM.BookExercises2;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Egzersiz gereksinimlerine göre üç veri setini işleyin.
        for (int i = 1; i <= 3; i++) {
            // Her müşteri için girdilerin toplanması
            System.out.println(i + ". müşteriye ait bilgileri girin.");

            System.out.print("Hesap Numarası: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Başlangıç Dengesi: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Toplam Ücretler: ");
            int charges = scanner.nextInt();

            System.out.print("Toplam Krediler: ");
            int credits = scanner.nextInt();

            System.out.print("İzin Verilen Kredi Limiti: ");
            int creditLimit = scanner.nextInt();

            int newBalance = beginningBalance + charges - credits;  // Yeni bakiyeyi hesapla.

            System.out.println("Hesap " + accountNumber + " için yeni bakiye: " + newBalance);  // Yeni bakiyeyi görüntüle.

            if (newBalance > creditLimit) {   // Kredi limitinin aşılıp aşılmadığını kontrol edin.
                System.out.println("Kredi limiti aşıldı.");
            }

            System.out.println(); // Müşteriler arasında daha iyi okunabilirlik için boş bir satır ekleniyor.
        }
        scanner.close();
    }
}
/*
1. müşteriye ait bilgileri girin.
Hesap Numarası: 1001
Başlangıç Dengesi: 500
Toplam Ücretler: 200
Toplam Krediler: 100
İzin Verilen Kredi Limiti: 600         (500 + 200 - 100 = 600)
Hesap 1001 için yeni bakiye: 600

2. müşteriye ait bilgileri girin.
Hesap Numarası: 1002
Başlangıç Dengesi: 1000
Toplam Ücretler: 800
Toplam Krediler: 200
İzin Verilen Kredi Limiti: 150
Hesap 1002 için yeni bakiye: 1600      (1000 + 800 - 200 = 1600)
Kredi limiti aşıldı.

3. müşteriye ait bilgileri girin.
Hesap Numarası: 1003
Başlangıç Dengesi: 300
Toplam Ücretler: 400
Toplam Krediler: 150
İzin Verilen Kredi Limiti: 500
Hesap 1003 için yeni bakiye: 550       (300 + 400 - 150 = 550)
Kredi limiti aşıldı.
*/