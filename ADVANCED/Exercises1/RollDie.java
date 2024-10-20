package ADVANCED.Exercises1;

import java.util.Random;

public class RollDie {  // Altı yüzlü bir zar 6000 kez atılır.
    public static void main(String[] args) {
        Random randomNumbers = new Random(); // Rastgele sayı üreticisi

        int frequency1 = 0; // 1'lerin atılma sayısını tutar
        int frequency2 = 0; // 2'lerin atılma sayısını tutar
        int frequency3 = 0; // 3'lerin atılma sayısını tutar
        int frequency4 = 0; // 4'lerin atılma sayısını tutar
        int frequency5 = 0; // 5'lerin atılma sayısını tutar
        int frequency6 = 0; // 6'ların atılma sayısını tutar

        int face; // en son atılan değeri depolar

        // Zarın 6000 kez atılma sonucunu özetle
        for (int roll = 1; roll <= 6000; roll++) {
            face = 1 + randomNumbers.nextInt(6); // 1 ile 6 arasında bir sayı

            // Zarın atılma değerini 1-6 arasında belirle ve ilgili sayacı artır
            switch (face) {
                case 1:
                    ++frequency1; // 1'lerin sayacını artır
                    break;
                case 2:
                    ++frequency2; // 2'lerin sayacını artır
                    break;
                case 3:
                    ++frequency3; // 3'lerin sayacını artır
                    break;
                case 4:
                    ++frequency4; // 4'lerin sayacını artır
                    break;
                case 5:
                    ++frequency5; // 5'lerin sayacını artır
                    break;
                case 6:
                    ++frequency6; // 6'ların sayacını artır
                    break; // switch'in sonunda opsiyonel olarak kullanılabilir
            } // switch sonu
        } // for döngüsü sonu

        System.out.println("Face\tFrequency"); // Başlıkları çıktı olarak ver
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
    } // main sonu
} // RollDie sınıfı sonu
/*
Face	Frequency
1	998
2	991
3	991
4	1035
5	967
6	1018

                        RollDie
          --------------------------------------------
           + main(args: String[]): void
          --------------------------------------------


*/