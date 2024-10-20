package ADVANCED.Exercises3;

import java.util.Scanner;

public class CharacterSquare {
    // Verilen karakterle kare çizen metot
    public static void squareOfAsterisks(int side, char fillCharacter) {
        // 'side' kadar satır döngüsü
        for (int i = 0; i < side; i++) {
            // Her satırda 'side' kadar fillCharacter basılır
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
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

        // Kullanıcıdan doldurma karakteri istenir
        System.out.print("Enter the fill character: ");
        char fillCharacter = input.next().charAt(0);

        // Kareyi çizen metot çağrılır
        squareOfAsterisks(side, fillCharacter);
    }
}
/*
Enter the side length of the square: 5
Enter the fill character: @
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
                   CharacterSquare
--------------------------------------------------

--------------------------------------------------
+ squareOfAsterisks(side: int, fillCharacter: char)
+ main(args: String[])
--------------------------------------------------
*/