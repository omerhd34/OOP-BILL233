package MEDIUM.BookExercises4;

public class Interest2 {
    public static void main(String[] args) {
        int principal = 100000; // 1000.00$ başlangıç miktarı, kuruş olarak ifade edilir (1000 dolar = 100000 kuruş)
        int rate = 5; // faiz oranı %5 olarak ifade edilir

        // Başlıkları yazdır
        System.out.printf("%s%20s\n", "Year", "Amount on deposit");

        // Her yıl için miktarı hesapla
        for (int year = 1; year <= 10; year++) {
            // Yeni miktarı hesapla: A = P * (1 + r)^n
            int amount = (int) (principal * Math.pow(1 + rate / 100.0, year));

            // Dolar ve kuruşları ayır
            int dollars = amount / 100; // toplam kuruş miktarını 100'e bölerek dolar kısmını bul
            int cents = amount % 100; // toplam kuruş miktarının 100'e bölümünden kalan kuruş kısmıdır

            // Sonucu yazdır
            System.out.printf("%4d%17d.%02d\n", year, dollars, cents);
        }
    }
}
/*
Year   Amount on deposit
   1             1050.00
   2             1102.50
   3             1157.62
   4             1215.50
   5             1276.28
   6             1340.09
   7             1407.10
   8             1477.45
   9             1551.32
  10             1628.89
*/
