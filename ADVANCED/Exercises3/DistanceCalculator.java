package ADVANCED.Exercises3;

import java.util.Scanner;

public class DistanceCalculator {

    // İki nokta arasındaki mesafeyi hesaplayan metot
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan ilk noktanın koordinatlarını al
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Kullanıcıdan ikinci noktanın koordinatlarını al
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // İki nokta arasındaki mesafeyi hesapla
        double result = distance(x1, y1, x2, y2);

        // Sonucu göster
        System.out.printf("The distance between the points (%.2f, %.2f) and (%.2f, %.2f) is %.2f%n", x1, y1, x2, y2, result);

        input.close();
    }
}
/*
Enter x1: 1
Enter y1: 2
Enter x2: 4
Enter y2: 6
The distance between the points (1.00, 2.00) and (4.00, 6.00) is 5.00

+-------------------------------+
|      DistanceCalculator       |
+-------------------------------+
| + distance(x1: double, y1: double,        |
|            x2: double, y2: double): double|
+-------------------------------+
| + main(args: String[]): void  |
+-------------------------------+

 */