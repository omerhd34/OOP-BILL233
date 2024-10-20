package MEDIUM.BookExercises4;

public class Patterns {
    public static void main(String[] args) {
        // Pattern (a)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // Boş satır ile desenler arasında ayırma

        // Pattern (b)
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // Boş satır ile desenler arasında ayırma

        // Pattern (c)
        for (int i = 10; i >= 1; i--) {
            // Boşluklar
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // Boş satır ile desenler arasında ayırma

        // Pattern (d)
        for (int i = 1; i <= 10; i++) {
            // Boşluklar
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 **********

 **********
 *********
 ********
 *******
 ******
 *****
 ****
 ***
 **
 *

 **********
 *********
 ********
 *******
 ******
 *****
 ****
 ***
 **
 *

 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 **********

UML:
-------------------------------------------
|                Patterns                 |
-------------------------------------------
| + main(args: String[]): void            |
-------------------------------------------
*/