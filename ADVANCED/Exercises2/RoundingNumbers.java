package ADVANCED.Exercises2;

import java.util.Scanner;

public class RoundingNumbers {
    // Sayıyı en yakın tam sayıya yuvarlar
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    // Sayıyı en yakın onda birliğe yuvarlar
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // Sayıyı en yakın yüzde birliğe yuvarlar
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // Sayıyı en yakın binde birliğe yuvarlar
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı girmesini iste
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Orijinal ve yuvarlanmış değerleri göster
        System.out.printf("Original number: %.5f\n", number);
        System.out.printf("Rounded to nearest integer: %.0f\n", roundToInteger(number));
        System.out.printf("Rounded to nearest tenth: %.1f\n", roundToTenths(number));
        System.out.printf("Rounded to nearest hundredth: %.2f\n", roundToHundredths(number));
        System.out.printf("Rounded to nearest thousandth: %.3f\n", roundToThousandths(number));
    }
}
/*
Enter a number: 0,754
Original number: 0,75400
Rounded to nearest integer: 1
Rounded to nearest tenth: 0,8
Rounded to nearest hundredth: 0,75
Rounded to nearest thousandth: 0,754
                     RoundingNumbers
    ------------------------------------------------
    + roundToInteger(number: double): double
    + roundToTenths(number: double): double
    + roundToHundredths(number: double): double
    + roundToThousandths(number: double): double
    + main(args: String[]): void
    ------------------------------------------------
*/