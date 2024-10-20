package MEDIUM.BookExercises1;

public class Mystery {
    public static void main(String[] args) {
        int y; // y değişkeni
        int x = 1; // x değişkenini 1 olarak başlat

        int total = 0; // toplam değişkenini 0 olarak başlat

        while (x <= 4) // x 10'a eşit veya küçük olduğu sürece
        {
            y = x * x; // y'yi x'in karesi olarak hesapla
            System.out.println(y); // y'yi ekrana yazdır
            total += y; // total değişkenine y'yi ekle
            ++x; // x'i bir artır
        } // while döngüsünün sonu

        System.out.printf("Toplam: %d\n", total); // toplamı yazdır
    } // main metodunun sonu
} // Mystery sınıfının sonu
/*
1
4
9
16
Toplam: 30
*/