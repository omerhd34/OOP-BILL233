/*
Bir büyük şirket, satış elemanlarına komisyon bazında ödeme yapar. Satış elemanları, haftada 200$ sabit maaşın yanı sıra, haftalık toplam
satışlarının %9'u kadar komisyon alırlar. Örneğin, bir satış elemanı bir hafta içinde 5000$ değerinde mal sattıysa, bu satış elemanı 200$
sabit maaş + 5000$'ın %9'u, yani toplamda 650$ alır. Satış elemanları tarafından satılan her bir ürünün değeri aşağıdaki gibi verilmiştir:
Ürün	Değer
1	   239.99
2	   129.75
3	    99.95
4	   350.89
Geçen hafta için bir satış elemanının sattığı ürünlerin değerini girdi olarak alan ve bu satış elemanının kazancını hesaplayıp görüntüleyen
bir Java uygulaması geliştirin. Bir satış elemanının satabileceği ürün sayısında bir sınırlama yoktur.
----------------------------------------------------------------------------------------------------------------------------------------------
Şirket, satış elemanlarına haftada 200$ maaş ve haftalık toplam satışlarının %9’u kadar komisyon ödemektedir.
Satılan her bir ürünün fiyatı verilen bir listede bulunmaktadır. Kullanıcının girdiği ürünlerin değerine göre satış elemanının toplam
kazancını hesaplamamız gerekmektedir.
----------------------------------------------------------------------------------------------------------------------------------------------
Sabit maaşı ve komisyon yüzdesini tanımla (sabıtMaas = 200, komisyonYuzdesi = 0.09).
Kullanıcıdan, satılan her bir ürün için ürün değerini girmesini iste.
Kullanıcı tüm ürünleri girdikten sonra, toplam satışı hesapla (toplamSatis).
Toplam kazancı hesapla (toplamKazanc = sabitMaas + toplamSatis * komisyonYuzdesi).
Toplam kazancı ekranda göster.
----------------------------------------------------------------------------------------------------------------------------------------------
*/
package MEDIUM.BookExercises2;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit maaş ve komisyon oranı
        final double sabitMaas = 200.0;
        final double komisyonYuzdesi = 0.09;

        double toplamSatis = 0.0;  // Şatış elemanının sattığı ürünlerin toplam değerini tutmak için başlangıçta 0.0 olarak tanımlanmıştır.

        // Kullanıcıdan satılan ürün değerlerini alma
        System.out.print("Satış elemanının sattığı ürünlerin değerini girin (bitirmek için 0 girin): ");
        double urunDegeri = input.nextDouble();

        while (urunDegeri != 0) {
            // Bu döngü, urunDegeri 0 olmadığı sürece çalışır. Kullanıcı her yeni ürün değeri girdiğinde, bu değer toplamSatis
            // değişkenine eklenir. Kullanıcı 0 girdiğinde, döngü sona erer.
            toplamSatis += urunDegeri;
            System.out.print("Başka bir ürünün değerini girin (bitirmek için 0 girin): ");
            urunDegeri = input.nextDouble();
        }

        // Toplam kazancı hesapla
        System.out.printf("Satış elemanının toplam kazancı: %.2f$\n", sabitMaas + (toplamSatis * komisyonYuzdesi));

        input.close();
    }
}
/*
Satış elemanının sattığı ürünlerin değerini girin (bitirmek için 0 girin): 100
Başka bir ürünün değerini girin (bitirmek için 0 girin): 150
Başka bir ürünün değerini girin (bitirmek için 0 girin): 0
Satış elemanının toplam kazancı: 222.50$       [200 + ((100+150) * 0.09)) = 200 + 22.5 = 222.50]
*/