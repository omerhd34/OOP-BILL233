package BEGINNING;

import java.util.Scanner; // Scanner sınıfını kullanmak için import

public class OddOrEven {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir tamsayı girişi iste
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Sayının çift veya tek olduğunu kontrol et ve ekrana yazdır
        if (number % 2 == 0) {
            System.out.printf("%d is even.%n", number);
        } else {
            System.out.printf("%d is odd.%n", number);
        }

        // Scanner'ı kapat
        input.close();
    }
}
/*
Enter an integer: 5
5 is odd.

Enter an integer: 6
6 is even.
*/