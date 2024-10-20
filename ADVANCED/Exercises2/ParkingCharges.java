/* Bir otopark garajı, üç saate kadar park etmek için 2,00 ABD doları asgari ücret alır. Garaj, üç saati aşan her saat veya
saatin bir kısmı için ek olarak saat başına 0,50 ABD doları ücret alır. Herhangi bir 24 saatlik süre için azami ücret 10,00 ABD
dolarıdır. Hiçbir otoparkın aynı anda 24 saatten uzun süre park etmediğini varsayın. Dün garaja park eden her müşteri için park
ücretlerini hesaplayan ve görüntüleyen bir uygulama yazın. Her müşteri için park edilen saatleri girmelisiniz. Program, geçerli
müşteri için ücreti görüntülemeli ve dünkü makbuzların toplamını hesaplamalı ve görüntülemelidir. Program, her müşteri için ücreti
belirlemek için calculateCharges yöntemini kullanmalıdır. */

/* Bu problemi çözmek için aşağıdaki adımları izleyebiliriz:
1- Minimum Ücret ve Fazla Saatler: İlk 3 saat için minimum ücret $2.00 olarak belirlenmiş. 3 saatten fazla park edilen her saat
   veya saatin bir kısmı için ek olarak $0.50 ücret alınır.
2- Maksimum Ücret: 24 saatlik bir park süresi için maksimum ücret $10.00 olarak sınırlandırılmış.
3- Program Akışı: Kullanıcıdan park edilen saatleri girmesi istenir. Her müşteri için ücreti hesaplayan bir metot yazılır.
   Ayrıca, birikmiş toplam ücreti (tüm müşteriler için) ekrana yazdırır.   */

package ADVANCED.Exercises2;

import java.util.Scanner;

public class ParkingCharges {
    // Ücreti hesaplayan metot
    public static double calculateCharges(double hours) {      // Park edilen saat sayısı (hours).
        double charge = 2.0;     // İlk 3 saat için ücret $2.00 olarak belirlenmiştir.

        if (hours > 3.0) {
            // Eğer saatler 3'ten fazla ise, fazladan her saat için (veya saatin kısmı için) $0.50 eklenir.
            // Bu, Math.ceil() kullanılarak gerçekleştirilir.
            charge += Math.ceil(hours - 3.0) * 0.50;
        }
        // Maksimum ücret kontrolü yapılır. Eğer ücret $10.00'dan fazla ise, ücret $10.00 olarak ayarlanır.
        if (charge > 10.0) {
            charge = 10.0;
        }
        return charge;   // Hesaplanan ücreti döndürür.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0; // Toplam günlük gelir
        double hours;
        int customerCount = 1;

        // Müşteriler için döngü (sonsuz döngü, -1 girildiğinde durur.)
        while (true) {
            System.out.printf("Enter hours parked for customer %d (or -1 to exit): ", customerCount);
            hours = input.nextDouble();

            if (hours == -1) {  // -1 girildiğinde döngüden çık
                break;
            }

            double charge = calculateCharges(hours);   // Ücreti hesapla.
            totalReceipts += charge; // Toplam gelire ekle

            System.out.printf("Customer %d charge: $%.2f\n", customerCount, charge);  // Müşteri için ücreti göster.
            customerCount++;
        }

        System.out.printf("Total receipts for yesterday: $%.2f\n", totalReceipts);  // Toplam geliri göster.
    }
}
/*
Enter hours parked for customer 1 (or -1 to exit): 2.5
Customer 1 charge: $2.00
Enter hours parked for customer 2 (or -1 to exit): 5
Customer 2 charge: $3.50
Enter hours parked for customer 3 (or -1 to exit): 12
Customer 3 charge: $10.00
Enter hours parked for customer 4 (or -1 to exit): -1
Total receipts for yesterday: $15.50

                   ParkingCharges
    ----------------------------------------
    + calculateCharges(hours: double): double
    + main(args: String[]): void
    ----------------------------------------
*/