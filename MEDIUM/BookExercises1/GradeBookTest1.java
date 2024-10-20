package MEDIUM.BookExercises1;

import java.util.Scanner;

public class GradeBookTest1 {
    public static void main(String[] args) {
/// ----------------------------------------------------------------------------------------------------------------
        GradeBook1 myGradeBook1 = new GradeBook1();     // 1
        myGradeBook1.ohd();               // OHD
/// ----------------------------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);        // 2
        GradeBook1 courseName = new GradeBook1();
        System.out.print("Please enter the course name: ");   // Please enter the course name: JAVA
        String nameOfCourse = input.nextLine();
        courseName.abc(nameOfCourse);          // Welcome to the grade book for JAVA!
/// ----------------------------------------------------------------------------------------------------------------
        GradeBook1 myGradeBook2 = new GradeBook1();     // 3
        myGradeBook2.add(5, 6);             // 11
/// ----------------------------------------------------------------------------------------------------------------
        GradeBook1 myGradeBook3 = new GradeBook1();     // 4
        myGradeBook3.add(5, 6, 7);           // 18
/// ----------------------------------------------------------------------------------------------------------------
        GradeBook1 myGradeBook4 = new GradeBook1();     // 5
        myGradeBook4.nameSurname("Ömer Halis", "DEMİR");  // Ömer Halis DEMİR
/// ----------------------------------------------------------------------------------------------------------------
        GradeBook1 myGradeBook5 = new GradeBook1();     // 6
        myGradeBook5.number();    // Bir sayı gir: 5        -->        Girdiğin sayı: 5
/// ----------------------------------------------------------------------------------------------------------------
        GradeBook1 fact1 = new GradeBook1();            // 7
        fact1.factorialWhile();   // Bir sayı gir: 5       -->        120
/// ----------------------------------------------------------------------------------------------------------------
        GradeBook1 fact2 = new GradeBook1();            // 8
        fact2.factorialFor();     // Bir sayı gir: 5       -->        120
/// ----------------------------------------------------------------------------------------------------------------

// ----------------------------------------------------------------------------------------------------------------
    }
}
