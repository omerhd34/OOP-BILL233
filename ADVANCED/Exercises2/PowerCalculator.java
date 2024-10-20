package ADVANCED.Exercises2;

import java.util.Scanner;

public class PowerCalculator {
    // integerPower metodu: base^exponent hesaplar.
    public static int integerPower(int base, int exponent) {
        int result = 1; // Sonucu tutacak değişken

        // Üs kadar çarpma işlemi yapılır
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan taban (base) ve üs (exponent) değerlerini al.
        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        // Hesaplama yap ve sonucu göster.
        int power = integerPower(base, exponent);
        System.out.printf("%d raised to the power of %d is: %d\n", base, exponent, power);
    }
}
/*
Enter the base: 5
Enter the exponent: 3
5 raised to the power of 3 is: 125

UML:
                         PowerCalculator
          --------------------------------------------

          --------------------------------------------
           integerPower(base:int , exponent:int) : int
           main(args:String[]): void
          --------------------------------------------
*/