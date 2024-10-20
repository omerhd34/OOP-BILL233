package ADVANCED.Exercises2;

import java.util.Scanner;

public class HypotenuseCalculator {

    public static double hypotenuse(double side1, double side2) {   // hipotenüs hesaplayan metot
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kenar uzunluklarını al ve hipotenüs hesapla
        System.out.print("Enter the length of side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = input.nextDouble();

        double hypotenuseValue = hypotenuse(side1, side2);
        System.out.printf("The length of the hypotenuse is: %.2f\n", hypotenuseValue);

        // 6.26 tablosundaki üçgenlerin hipotenüslerini hesapla
        System.out.println("\nHypotenuse values for the triangles in Fig. 6.26:");
        System.out.printf("Triangle 1: %.2f\n", hypotenuse(3.0, 4.0));
        System.out.printf("Triangle 2: %.2f\n", hypotenuse(5.0, 12.0));
        System.out.printf("Triangle 3: %.2f\n", hypotenuse(8.0, 15.0));
    }
}
/*
Enter the length of side 1: 3
Enter the length of side 2: 4
The length of the hypotenuse is: 5,00

Hypotenuse values for the triangles in Fig. 6.26:
Triangle 1: 5,00
Triangle 2: 13,00
Triangle 3: 17,00

                       HypotenuseCalculator
          --------------------------------------------
           + hypotenuse(side1: double, side2: double): double
           + main(args: String[]): void
          --------------------------------------------
*/