package BEGINNING;

import java.util.Scanner; // Scanner sınıfını kullanmak için import

public class CircleMetrics {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan dairenin yarıçapını (radius) tamsayı olarak iste
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt(); // Yarıçapı oku

        // Dairenin çapını, çevresini ve alanını hesaplayıp yazdır
        System.out.printf("Diameter: %.2f%n", 2.0 * radius);
        System.out.printf("Circumference: %.2f%n", 2.0 * Math.PI * radius);
        System.out.printf("Area: %.2f%n", Math.PI * radius * radius);

        // Scanner'ı kapat
        input.close();
    }
}
/*
Enter the radius of the circle: 5
Diameter: 10.00
Circumference: 31.42
Area: 78.54
*/
