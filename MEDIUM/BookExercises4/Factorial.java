package MEDIUM.BookExercises4;

public class Factorial {
    public static void main(String[] args) {
        // Başlıkları yazdır
        System.out.printf("%-10s%-10s\n", "Number", "Factorial");

        // 1'den 5'e kadar olan sayıların faktöriyelini hesapla
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10d%-10d\n", i, calculateFactorial(i));
        }
    }

    public static int calculateFactorial(int number) {  // Faktöriyel hesaplama metodu
        int factorial = 1;

        // number'ın faktöriyelini hesapla
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
/*
Number    Factorial
1         1
2         2
3         6
4         24
5         120

UML:
-------------------------------------------
|                Factorial                |
-------------------------------------------
| + main(args: String[]): void            |
| + calculateFactorial(number: int): int  |
-------------------------------------------
*/