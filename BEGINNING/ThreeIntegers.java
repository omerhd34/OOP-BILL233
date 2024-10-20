package BEGINNING;

import java.util.Scanner; // Scanner sınıfını kullanmak için import

public class ThreeIntegers {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluştur
        Scanner input = new Scanner(System.in);

        // Üç tamsayı değişkenini tanımla
        int number1, number2, number3;

        // Kullanıcıdan ilk sayıyı iste
        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); // İlk sayıyı oku

        // Kullanıcıdan ikinci sayıyı iste
        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); // İkinci sayıyı oku

        // Kullanıcıdan üçüncü sayıyı iste
        System.out.print("Enter third integer: ");
        number3 = input.nextInt(); // Üçüncü sayıyı oku

        // Toplamı, ortalamayı ve çarpımı hesapla
        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;

        // En küçük ve en büyük sayıyı bul
        int smallest = number1; // Başlangıçta en küçük olarak birinci sayıyı kabul et
        int largest = number1; // Başlangıçta en büyük olarak birinci sayıyı kabul et

        // En küçük sayıyı bulmak için karşılaştırma yap
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // En büyük sayıyı bulmak için karşılaştırma yap
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Sonuçları ekrana yazdır
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        // Scanner'ı kapat
        input.close();
    }
}
/*
Enter first integer: 5
Enter second integer: 6
Enter third integer: 7
Sum: 18
Average: 6
Product: 210
Smallest: 5
Largest: 7
*/