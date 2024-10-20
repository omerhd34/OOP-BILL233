package BEGINNING;

import java.util.Scanner; // Scanner sınıfını kullanmak için import

public class MultipleCheck {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan ilk tam sayıyı iste
        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();

        // Kullanıcıdan ikinci tam sayıyı iste
        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();

        // İkinci sayının sıfır olup olmadığını kontrol et
        if (secondNumber == 0) {
            System.out.println("The second number cannot be zero.");
        } else {
            // İlk sayının ikinci sayının katı olup olmadığını kontrol et
            if (firstNumber % secondNumber == 0) {
                System.out.printf("%d is a multiple of %d.%n", firstNumber, secondNumber);
            } else {
                System.out.printf("%d is not a multiple of %d.%n", firstNumber, secondNumber);
            }
        }

        // Scanner'ı kapat
        input.close();
    }
}
/*
Enter the first integer: 10
Enter the second integer: 2
10 is a multiple of 2.

Enter the first integer: 10
Enter the second integer: 3
10 is not a multiple of 3.

Enter the first integer: 10
Enter the second integer: 0
The second number cannot be zero.
*/