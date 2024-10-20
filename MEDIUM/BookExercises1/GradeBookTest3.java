package MEDIUM.BookExercises1;

public class GradeBookTest3 {
    public static void main(String[] args) {
        GradeBook3 Book1 = new GradeBook3("Java");
        GradeBook3 Book2 = new GradeBook3("Python");
        System.out.printf("course name is: %s\n", Book1.getCourseName());
        System.out.printf("course name is: %s\n", Book2.getCourseName());
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