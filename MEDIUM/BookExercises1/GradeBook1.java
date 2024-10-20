package MEDIUM.BookExercises1;

import java.util.Scanner;

/// ----------------------------------------------------------------------------------------------------------------
public class GradeBook1 {
    public void ohd() {           // 1
        System.out.println("OHD");    // OHD
    }
//    GradeBookTest1.java
//    GradeBook1 myGradeBook1 = new GradeBook1();
//    myGradeBook1.ohd();        // OHD
/* UML :  GradeBook1
          ----------

          ----------
           + ohd()
          ----------                 */
/// ----------------------------------------------------------------------------------------------------------------
    public void abc(String courseName) {  // 2
        System.out.printf("Welcome to the grade book for %s!\n", courseName);
    }
//   Scanner input = new Scanner(System.in);
//   GradeBook1 courseName = new GradeBook1();
//   System.out.print("Please enter the course name: ");   // Please enter the course name: JAVA
//   String nameOfCourse = input.nextLine();
//   courseName.abc(nameOfCourse);                         // Welcome to the grade book for JAVA!
/* UML :
                   GradeBookTest1
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |
                        ↓
                    GradeBook1
          ---------------------------------

          ---------------------------------
           + ohd(courseName : String)
          ---------------------------------                */
/// ----------------------------------------------------------------------------------------------------------------
    public void add(int x, int y) {   // 3
        System.out.println(x + y);
    }

/// ----------------------------------------------------------------------------------------------------------------
    public void add(int x, int y, int z) {  // 4
        System.out.println(x + y + z);
    }

/// ----------------------------------------------------------------------------------------------------------------
    public void nameSurname(String name, String surname) {   // 5
        System.out.println(name + " " + surname);
    }

/// ----------------------------------------------------------------------------------------------------------------
    public void number() {   // 6
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");            // Bir sayı gir: 5
        int sayi = scan.nextInt();
        System.out.println("Girdiğin sayı: " + sayi);  // Girdiğin sayı: 5
    }

/// ----------------------------------------------------------------------------------------------------------------
    public void factorialWhile() {   // 7
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");     // 4
        int sayi = scan.nextInt();
        int fact = 1;
        while (sayi > 0) {
            fact *= sayi;
            sayi--;
        }
        System.out.println(fact);  // 24
    }

/// ----------------------------------------------------------------------------------------------------------------
    public void factorialFor() {   // 8
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");    // 4
        int sayi = scan.nextInt();
        int fact = 1;

        for (int i = 1; i <= sayi; i++) {
            fact *= i;
        }
        System.out.println(fact);  // 24
    }
/// ----------------------------------------------------------------------------------------------------------------
}

