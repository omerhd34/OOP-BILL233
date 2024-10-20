/* Sürücüler otomobillerinin kat ettiği km ile ilgilenir. Bir sürücü, her bir tank için kat edilen km'yi ve kullanılan
galonu kaydederek birkaç tank dolusu benzinin kaydını tutmuştur. Her bir tank için kat edilen km'yi ve kullanılan galonu
(her ikisi de tam sayı olarak) girecek bir Java uygulaması geliştirin. Program, her bir tank için elde edilen galon başına mili hesaplamalı
ve görüntülemeli ve bu noktaya kadar tüm tanklar için elde edilen toplam galon başına mili yazdırmalıdır. Tüm ortalama hesaplamaları kayan
nokta sonuçları üretmelidir. Kullanıcıdan verileri almak için sınıf Scanner(Tarayıcı) ve sentinel kontrollü tekrarı kullanın. */

/*
1 - Başla
2 - Değişkenleri tanımla: miles, gallons, totalMiles, totalGallons
3 - Kullanıcıdan verileri al:
miles ve gallons için döngü oluştur
Kullanıcı "0" girdiğinde döngüyü sonlandır
4 - Her tankful için mil başına galon hesapla:
mpg = miles / gallons
Toplamı güncelle
5 - Toplam mil başına galon hesapla:
totalMpg = totalMiles / totalGallons
6 - Sonuçları yazdır
7 - Bitir
*/

package MEDIUM.BookExercises2;

import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int miles, gallons;
        int totalMiles = 0, totalGallons = 0;
        double mpg;

        while (true) {
            System.out.print("Gidilen mil sayısını girin (0 ile çıkış): ");
            miles = scanner.nextInt();
            if (miles == 0) {
                break;   // Kullanıcı 0 girerse döngüden çık
            }

            System.out.print("Kullanılan galon sayısını girin: ");
            gallons = scanner.nextInt();

            // Mil başına galon hesapla
            mpg = (double) miles / gallons;
            System.out.printf("Bu tankful için mil başına galon: %.2f\n\n", mpg);

            // Toplamı güncelle
            totalMiles += miles;
            totalGallons += gallons;
        }

        // Toplam mil başına galon hesapla
        if (totalGallons > 0) {
            double totalMpg = (double) totalMiles / totalGallons;
            System.out.printf("Toplam mil başına galon: %.2f\n", totalMpg);
        } else {
            System.out.println("Hiçbir veri girilmedi.");
        }

        scanner.close();
    }
}
/*
Gidilen mil sayısını girin (0 ile çıkış): 6
Kullanılan galon sayısını girin: 4
Bu tankful için mil başına galon: 1,50

Gidilen mil sayısını girin (0 ile çıkış): 3
Kullanılan galon sayısını girin: 5
Bu tankful için mil başına galon: 0,60

Gidilen mil sayısını girin (0 ile çıkış): 5
Kullanılan galon sayısını girin: 5
Bu tankful için mil başına galon: 1,00

Gidilen mil sayısını girin (0 ile çıkış): 0
Toplam mil başına galon: 1,00
*/