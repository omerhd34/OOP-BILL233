package MEDIUM.BookExercises1;

// 1'den 10'a kadar olan tam sayıların toplamını hesapla
public class Calculate {
    public static void main(String[] args) {
        int sum; // toplam değişkeni
        int x;   // sayma değişkeni

        x = 1;   // saymayı başlatmak için x'i 1 olarak başlat
        sum = 0; // toplamı 0 olarak başlat

        while (x <= 10) // x 10'a eşit veya küçük olduğu sürece
        {
            sum += x; // x'i toplam değişkenine ekle
            ++x;      // x'i bir artır
        } // while döngüsünün sonu

        System.out.printf("Toplam: %d\n", sum); // toplamı yazdır
    } // main metodunun sonu
} // Calculate sınıfının sonu


// Toplam: 55