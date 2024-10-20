/*
1- Kullanıcıdan side değeri alınır (kaça kaçlık bir kare isteniyor).
2- squareOfAsterisks metodu, verilen side değeri kadar satır ve sütundan oluşan bir kare çizer.
3- Her satırda side kadar * basılır.
*/
package ADVANCED.Exercises3;

import java.util.Scanner;

public class AsteriskSquare {
    // Belirtilen kenar uzunluğunda bir kare oluşturan metot
    public static void squareOfAsterisks(int side) {
        // 'side' kadar satır döngüsü
        for (int i = 0; i < side; i++) {
            // Her satırda 'side' kadar yıldız basılır
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            // Bir satır tamamlandığında bir alt satıra geç
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kenar uzunluğu istenir
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();

        // Kareyi çizen metot çağrılır
        squareOfAsterisks(side);
    }
}
/*
 ******
 ******
 ******
 ******
 ******
 ******
      AsteriskSquare
-------------------------
|                        |
-------------------------
| + squareOfAsterisks(side: int): void |
| + main(args: String[]): void |
-------------------------

*/
