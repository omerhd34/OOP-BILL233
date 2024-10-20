package MEDIUM.BookExercises4;

public class CombinedPatterns {
    public static void main(String[] args) {
        int size = 10; // Desen boyutu, satır sayısı

        // Her satır için döngü
        for (int i = 1; i <= size; i++) {
            // (a) Desenini yazdır
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Desenler arasına boşluk ekle
            System.out.print("    ");

            // (b) Desenini yazdır
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            // Desenler arasına boşluk ekle
            System.out.print("    ");

            // (c) Desenini yazdır
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            // Desenler arasına boşluk ekle
            System.out.print("    ");

            // (d) Desenini yazdır
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Bir sonraki satıra geç
            System.out.println();
        }
    }
}
/*
 *    **********    **********             *
 **    *********     *********            **
 ***    ********      ********           ***
 ****    *******       *******          ****
 *****    ******        ******         *****
 ******    *****         *****        ******
 *******    ****          ****       *******
 ********    ***           ***      ********
 *********    **            **     *********
 **********    *             *    **********
*/