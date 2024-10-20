/*  İki zar atarsınız. Her zarın sırasıyla 1, 2, 3, 4, 5 ve 6 nokta içeren altı yüzü vardır. Zarlar durduktan sonra, iki yukarı
bakan yüzdeki noktaların toplamı hesaplanır. İlk atışta toplam 7 veya 11 gelirse kazanırsınız. İlk atışta toplam 2, 3 veya 12
olursa (buna "craps" denir) kaybedersiniz (yani, "house" kazanır). İlk atışta toplam 4, 5, 6, 8, 9 veya 10 olursa, bu toplam sizin
"puanınız" olur. Kazanmak için, "puanınızı yapana" (yani, aynı puan değerini atana) kadar zarları atmaya devam etmelisiniz. Puanı
yapmadan önce 7 atarsanız kaybedersiniz. */

package ADVANCED.Exercises1;

import java.util.Random;

public class Craps {     // Craps sınıfı zar oyunu craps'i simüle eder.

    // rollDice metodunda kullanılmak üzere rastgele sayı üreticisi oluştur.
    private Random randomNumbers = new Random();

    // Oyunun durumunu temsil eden sabitlerle enum tanımı
    private enum Status {CONTINUE, WON, LOST};


    // Zarların yaygın atışlarını temsil eden sabitler.
    private final static int SNAKE_EYES = 2;
    private final static int TREY = 3;
    private final static int SEVEN = 7;
    private final static int YO_LEVEN = 11;
    private final static int BOX_CARS = 12;

    public void play() {    // Bir craps oyunu oynar.
        int myPoint = 0; // İlk atışta kazanma veya kaybetme yoksa puanı temsil eder
        Status gameStatus; // CONTINUE, WON veya LOST durumlarını içerebilir

        int sumOfDice = rollDice(); // Zarların ilk atışı

        // İlk atışa göre oyunun durumunu ve puanı belirle.
        switch (sumOfDice) {
            case SEVEN: // İlk atışta 7 ile kazan.
            case YO_LEVEN: // İlk atışta 11 ile kazan.
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // İlk atışta 2 ile kaybet.
            case TREY: // İlk atışta 3 ile kaybet.
            case BOX_CARS: // İlk atışta 12 ile kaybet.
                gameStatus = Status.LOST;
                break;
            default: // Kazanmadı veya kaybetmedi, puanı hatırla.
                gameStatus = Status.CONTINUE; // Oyun bitmedi.
                myPoint = sumOfDice; // Puanı hatırla.
                System.out.printf("Puan = %d\n", myPoint);
                break; // switch sonunda isteğe bağlı
        } // switch sonu

        // Oyun tamamlanmadığı sürece devam et.
        while (gameStatus == Status.CONTINUE) // Kazanmadı veya kaybetmedi.
        {
            sumOfDice = rollDice(); // Zarı tekrar at.

            // Oyunun durumunu belirle.
            if (sumOfDice == myPoint) // Puanı yaparak kazan.
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN) // Puan yapmadan önce 7 atarak kaybet.
                gameStatus = Status.LOST;
        } // while sonu

        // Kazanma veya kaybetme mesajını göster.
        if (gameStatus == Status.WON)
            System.out.println("Oyuncu kazandı.");
        else
            System.out.println("Oyuncu kaybetti.");
    } // play metodu sonu

    // Zarı atar, toplamı hesaplar ve sonuçları gösterir.
    public int rollDice() {
        // Rastgele zar değerlerini seç
        int die1 = 1 + randomNumbers.nextInt(6); // İlk zar atışı
        int die2 = 1 + randomNumbers.nextInt(6); // İkinci zar atışı

        int sum = die1 + die2; // Zarların toplamı

        // Bu atışın sonuçlarını göster
        System.out.printf("Oyuncu %d + %d = %d attı.\n",
                die1, die2, sum);

        return sum; // Zarların toplamını döndür.
    } // rollDice metodu sonu
} // Craps sınıfı sonu
/*
Oyuncu 6 + 6 = 12 attı.
Oyuncu kaybetti.

Oyuncu 6 + 2 = 8 attı.
Puan = 8
Oyuncu 5 + 1 = 6 attı.
Oyuncu 1 + 2 = 3 attı.
Oyuncu 1 + 6 = 7 attı.
Oyuncu kaybetti.

Oyuncu 5 + 1 = 6 attı.
Puan = 6
Oyuncu 5 + 4 = 9 attı.
Oyuncu 3 + 5 = 8 attı.
Oyuncu 4 + 5 = 9 attı.
Oyuncu 3 + 6 = 9 attı.
Oyuncu 6 + 2 = 8 attı.
Oyuncu 4 + 5 = 9 attı.
Oyuncu 4 + 3 = 7 attı.
Oyuncu kaybetti.

Oyuncu 3 + 3 = 6 attı.
Puan = 6
Oyuncu 1 + 5 = 6 attı.
Oyuncu kazandı.
                                     Craps
          --------------------------------------------------------------
           – random RandomNumbers
           – enum Status {CONTINUE,WON,LOST}
           - final static int SNAKE_EYES
           - final static int TREY
           - final static int SEVEN
           - final static int YO_LEVEN
           - final static int BOX_CARDS
          --------------------------------------------------------------
           + play():
           + rollDice():
          --------------------------------------------------------------
*/