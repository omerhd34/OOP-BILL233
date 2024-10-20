package MEDIUM.BookExercises1;

public class GradeBook3 {
    private String courseName;

    public GradeBook3(String name) {
        courseName = name; // initializes courseName
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!\n", getCourseName());
    }
}
/* course name is: Java
   course name is: Python
UML :
                    GradeBookTest3
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
                          GradeBook3
          -----------------------------------------
           – courseName : String
          -----------------------------------------
           «constructor» GradeBook3( name : String )
           + setCourseName( name : String )
           + getCourseName( ) : String
           + displayMessage( )
          -----------------------------------------                */