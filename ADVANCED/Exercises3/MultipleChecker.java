package ADVANCED.Exercises3;

import java.util.Scanner;

public class MultipleChecker {
    // İkinci sayının, birinci sayının katı olup olmadığını kontrol eden metot
    public static boolean multiple(int first, int second) {
        return second % first == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sonsuz döngü ile sürekli çift değer girişi alacağız
        while (true) {
            // Kullanıcıdan birinci ve ikinci sayıları al
            System.out.print("Enter the first integer (or -1 to exit): ");
            int first = input.nextInt();

            if (first == -1) { // Çıkış koşulu
                break;
            }

            System.out.print("Enter the second integer: ");
            int second = input.nextInt();

            // multiple() metodunu kullanarak, ikinci sayının birinci sayının katı olup olmadığını kontrol et
            if (multiple(first, second)) {
                System.out.printf("%d is a multiple of %d\n", second, first);
            } else {
                System.out.printf("%d is not a multiple of %d\n", second, first);
            }
        }
    }
}
/*
Enter the first integer (or -1 to exit): 5
Enter the second integer: 25
25 is a multiple of 5
Enter the first integer (or -1 to exit): 4
Enter the second integer: 15
15 is not a multiple of 4
Enter the first integer (or -1 to exit): -1

             MultipleChecker
---------------------------------------

---------------------------------------
- multiple(first: int, second: int): boolean
- main(args: String[]): void
---------------------------------------
 */