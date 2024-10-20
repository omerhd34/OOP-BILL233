package MEDIUM.BookExercises4;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1; // Çarpımı tutacak değişken

        // 1'den 15'e kadar olan tek sayılar için döngü
        for (int i = 1; i <= 15; i += 2) {
            product *= i; // Çarpımı güncelle
        }

        // Sonucu yazdır
        System.out.printf("The product of odd integers from 1 to 15 is: %d\n", product);
    }
}
/*
The product of odd integers from 1 to 15 is: 2027025
---------------------------------------------------
|            ProductOfOddIntegers                 |
---------------------------------------------------
| + main(args: String[]): void                    |
---------------------------------------------------
*/