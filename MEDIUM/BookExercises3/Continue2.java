package MEDIUM.BookExercises3;

public class Continue2 {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            // Koşul kontrolü, 5 olduğunda geri kalan kodu çalıştırmama
            if (count != 5) {
                System.out.printf("%d ", count);
            }
        }
        System.out.println("\nSkipped printing 5");
    }
}
/*
1 2 3 4 6 7 8 9 10
Skipped printing 5
 */