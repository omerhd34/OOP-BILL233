package MEDIUM.BookExercises4;

public class DiamondShape {
    public static void main(String[] args) {
        int n = 5; // Elmasın yarı yüksekliği (yukarıdaki yarının satır sayısı)

        // Yukarıdaki yarıyı oluştur
        for (int i = 0; i < n; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Yeni satıra geç
            System.out.println();
        }

        // Aşağıdaki yarıyı oluştur
        for (int i = n - 2; i >= 0; i--) {
            // Boşlukları yazdır
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Yeni satıra geç
            System.out.println();
        }
    }
}
/*
       *
      ***
     *****
    *******
   *********
    *******
     *****
      ***
       *
*/