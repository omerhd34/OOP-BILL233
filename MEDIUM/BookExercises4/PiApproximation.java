package MEDIUM.BookExercises4;

public class PiApproximation {
    public static void main(String[] args) {
        double pi = 0.0;
        int sign = 1; // İşaret, pozitif ve negatif terimler için kullanılır
        int terms = 0; // Kullanılan terim sayısı

        System.out.printf("%-10s%-10s\n", "Terms", "Approx. Pi");

        // Sonsuz seriyi hesaplamak için döngü
        for (int i = 1; i <= 1000000; i += 2) {
            pi += sign * (4.0 / i);
            sign *= -1; // İşareti değiştir

            terms++;

            // Kaç terimde bu değerlere ulaşıldığını kontrol etmek
            if (terms == 1 || terms == 2 || terms == 3 || terms == 4 || terms == 5 ||
                    terms == 6 || terms == 7 || terms == 8 || Math.abs(pi - 3.141) < 0.001 ||
                    Math.abs(pi - 3.1415) < 0.0001 || Math.abs(pi - 3.14159) < 0.00001) {
                System.out.printf("%-10d%-10.6f\n", terms, pi);
            }

            // İstenilen hassasiyetlere ulaştığımızda döngüden çıkabiliriz
            if (Math.abs(pi - 3.14159) < 0.00001) {
                break;
            }
        }
    }
}
/*
3,141558
29101     3,141627
29102     3,141558
29103     3,141627
29104     3,141558
29105     3,141627
29106     3,141558
.
.
.
79030     3,141580
 */