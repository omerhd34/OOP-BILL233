package MEDIUM.BookExercises4;

public class PythagoreanTriples {
    public static void main(String[] args) {
        // Başlıkları yazdır
        System.out.printf("%-10s %-10s %-10s\n", "Side1", "Side2", "Hypotenuse");

        // Üçlü iç içe döngü kullanarak tüm olasılıkları dene
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) { // side2 en az side1 kadar olmalı, tekrarları önlemek için
                for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++) {
                    // Pisagor koşulunu kontrol et
                    if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                        // Sonucu yazdır
                        System.out.printf("%-10d %-10d %-10d\n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}
/*
Side1      Side2      Hypotenuse
3          4          5
5          12         13
6          8          10
7          24         25
.
.
.
325        360        485
340        357        493
 */