/* Üç çalışanın her biri için brüt ücreti belirleyecek bir Java uygulaması geliştirin. Şirket, her çalışanın çalıştığı ilk 40 saat
için düz mesai ücreti ve 40 saati aşan tüm çalışılan saatler için 1,5 saat ücreti öder. Size şirketin çalışanlarının bir listesi,
her çalışanın geçen hafta çalıştığı saat sayısı ve her çalışanın saatlik ücreti verilir. Programınız bu bilgileri her çalışan için girmeli
ve çalışanın brüt ücretini belirlemeli ve görüntülemelidir. Verileri girmek için sınıf tarayıcısını(SCANNER) kullanın. */

/* Bu problemi çözmek için bir Java programı yazabiliriz. Problemde, 3 çalışan için toplam brüt maaşı hesaplamamız isteniyor.
İlk 40 saatlik çalışma için normal saatlik ücret ödeniyor, 40 saati aşan süreler için ise ücretin 1.5 katı ödeniyor.
Kullanıcıdan her çalışan için haftalık çalışma saati ve saatlik ücreti girmesi isteniyor.   */

package MEDIUM.BookExercises2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Çalışan sayısı sabit olarak verilmiş
        final int calisanSayisi = 3;

        // Brüt maaş hesaplaması için gerekli veriler
        for (int i = 1; i <= calisanSayisi; i++) {   // Sabit olarak 3 çalışan olarak belirtilmiştir. Bu nedenle bir for döngüsü ile her çalışan için veri girişi alınır.
            // Her çalışan için saatlikUcret ve calismaSaati kullanıcıdan alınır.
            System.out.printf("Çalışan %d için saatlik ücreti girin: ", i);
            double saatlikUcret = input.nextDouble();

            System.out.printf("Çalışan %d için haftalık çalışma saatini girin: ", i);
            double calismaSaati = input.nextDouble();
            // Her çalışan için hesaplaBrutMaas fonksiyonu çağrılarak brüt maaş hesaplanır.
            double brutMaas = hesaplaBrutMaas(saatlikUcret, calismaSaati);
            System.out.printf("Çalışan %d'nin brüt maaşı: %.2f$\n\n", i, brutMaas);
        }

        input.close();
    }

    // Brüt maaş hesaplayan fonksiyon
    public static double hesaplaBrutMaas(double saatlikUcret, double calismaSaati) {
        double brutMaas;
        // Eğer çalışma saati 40'tan küçük veya eşitse, brüt maaş normal saatlik ücret ile çarpılarak hesaplanır.
        if (calismaSaati <= 40) {   // İlk 40 saat için normal ücret
            brutMaas = saatlikUcret * calismaSaati;
        } else {
            // Çalışma saati 40'tan fazla ise, ilk 40 saat için normal ücret ödenir ve 40 saati aşan saatler için saatlik ücretin 1.5 katı ödenir.
            brutMaas = (40 * saatlikUcret) + ((calismaSaati - 40) * saatlikUcret * 1.5);
        }
        return brutMaas;
    }
}
/*
Çalışan 1 için saatlik ücreti girin: 15
Çalışan 1 için haftalık çalışma saatini girin: 42
Çalışan 1'nin brüt maaşı: 645.00$

Çalışan 2 için saatlik ücreti girin: 12.5
Çalışan 2 için haftalık çalışma saatini girin: 38
Çalışan 2'nin brüt maaşı: 475.00$

Çalışan 3 için saatlik ücreti girin: 20
Çalışan 3 için haftalık çalışma saatini girin: 45
Çalışan 3'nin brüt maaşı: 950.00$
*/