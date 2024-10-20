package BEGINNING;

import java.util.Scanner; // Scanner sınıfını kullanmak için import

public class LargerNumber {
    public static void main(String[] args) {
        // Kullanıcı girişini almak için Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // İki tam sayı tanımla
        int number1, number2;

        // Kullanıcıdan ilk sayıyı iste
        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); // İlk sayıyı al

        // Kullanıcıdan ikinci sayıyı iste
        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); // İkinci sayıyı al

        // Sayıları karşılaştır
        if (number1 > number2) {
            System.out.printf("%d is larger.%n", number1);
        } else if (number2 > number1) {
            System.out.printf("%d is larger.%n", number2);
        } else {
            System.out.println("These numbers are equal.");
        }

        // Scanner'ı kapat
        input.close();
    }
}
/*
Enter first integer: 52
Enter second integer: 53
53 is larger.

Enter first integer: 55
Enter second integer: 55
These numbers are equal.
*/