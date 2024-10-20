package MEDIUM.BookExercises1;

public class GradeBook2 {
    private String courseName;

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!", getCourseName());
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
                        | creates
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
          ----------------------------------
*/
