package MEDIUM.BookExercises1;

import java.util.Scanner;

public class GradeBookTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeBook2 myGradeBook = new GradeBook2();

        System.out.printf("Initial course name is: %s\n", myGradeBook.getCourseName());
        System.out.print("Please enter the course name: ");

        String theName = input.nextLine();
        myGradeBook.setCourseName(theName);

        myGradeBook.displayMessage();
    }
}
/*
Initial course name is: null
Please enter the course name: JAVA
Welcome to the grade book for JAVA!
UML :
                    GradeBookTest2
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |
                        |
                        |
                        |creates
                        |
                        |
                        ↓
                      GradeBook2
          ----------------------------------
           – courseName : String
          ----------------------------------
           + setCourseName( name : String )
           + getCourseName( ) : String
           + displayMessage( )
          ----------------------------------                */