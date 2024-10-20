package ADVANCED.Exercises1;

public class CrapsTest {
    public static void main(String[] args) {
        Craps game = new Craps();
        game.play(); // Bir oyun craps oyna
    } // main sonu
} // CrapsTest sınıfı sonu
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