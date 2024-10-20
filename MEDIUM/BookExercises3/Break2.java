package MEDIUM.BookExercises3;

public class Break2 {
    public static void main(String[] args) {
        int count; // Kontrol değişkeni

        // Döngü koşulunda "erken çıkış" koşulunu kontrol ediyoruz
        for (count = 1; count <= 10 && count != 5; count++) {
            System.out.printf("%d ", count);
        }
        System.out.printf("\nBroke out of loop at count = %d\n", count);
    }
}
/*
1 2 3 4
Broke out of loop at count = 5
 */