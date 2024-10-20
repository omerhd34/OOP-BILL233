package ADVANCED.Exercises1;

import java.util.Random; // program Random sınıfını kullanır

public class RandomIntegers {
    public static void main(String[] args) {
        Random rastgeleSayilar = new Random(); // rastgele sayı üreteci
        int yuz; // her rastgele üretilen tam sayıyı depolar

        for (int sayac = 1; sayac <= 20; sayac++)     // döngüyü 20 kez çalıştır
        {
            // 1 ile 6 arasında rastgele bir tam sayı seç
            yuz = 1 + rastgeleSayilar.nextInt(6);

            System.out.printf("%d ", yuz); // üretilen değeri göster

            // eğer sayaç 5'e bölünebiliyorsa, yeni bir satır başlat
            if (sayac % 5 == 0)
                System.out.println();
        } // döngü sonu
    } // main sonu
} // sınıf RastgeleSayilar sonu
/*
1 1 3 5 6
1 4 4 6 6
5 6 2 5 3
6 2 1 2 4
UML :
                   RandomIntegers
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
*/