package BEGINNING;

import java.util.Scanner; // Scanner sınıfını kullanmak için import

public class LargestAndSmallest {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // İlk sayıyı al ve hem en büyük hem de en küçük olarak ayarla
        System.out.print("Enter the first integer: ");
        int number = input.nextInt();
        int largest = number;  // Başlangıçta en büyük
        int smallest = number; // Başlangıçta en küçük

        // Diğer dört sayıyı al ve karşılaştır
        for (int i = 2; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            number = input.nextInt();

            // En büyük değeri kontrol et ve güncelle
            if (number > largest) {
                largest = number;
            }

            // En küçük değeri kontrol et ve güncelle
            if (number < smallest) {
                smallest = number;
            }
        }

        // Sonuçları ekrana yazdır
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The smallest number is: %d%n", smallest);

        // Scanner'ı kapat
        input.close();
    }
}
/*
Enter the first integer: 5
Enter integer 2: 6
Enter integer 3: 7
Enter integer 4: 8
Enter integer 5: 9
The largest number is: 9
The smallest number is: 5
*/