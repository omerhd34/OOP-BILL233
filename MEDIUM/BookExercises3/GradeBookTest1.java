package MEDIUM.BookExercises3;

// Create GradeBook object, input grades and display grade report.
public class GradeBookTest1 {
    public static void main(String[] args) {
        // create GradeBook object myGradeBook and
        // pass course name to constructor
        GradeBook1 myGradeBook = new GradeBook1("Java");

        myGradeBook.displayMessage(); // display welcome message
        myGradeBook.inputGrades(); // read grades from user
        myGradeBook.displayGradeReport(); // display report based on grades
    } // end main
} // end class GradeBookTest
/*
Welcome to the grade book for Java!
Enter the integer grades in the range 0-100:
55
66
77
88
99
0
35
^D

Grade Report:
Total of the 7 grades entered is 420
Class average is 60,00
Number of students who received each grade:
A: 1
B: 1
C: 1
D: 1
F: 3
UML :
---------------------------------------------
|                 GradeBook1                |
---------------------------------------------
| - courseName: String                      |
| - total: int                              |
| - gradeCounter: int                       |
| - aCount: int                             |
| - bCount: int                             |
| - cCount: int                             |
| - dCount: int                             |
| - fCount: int                             |
---------------------------------------------
| + GradeBook1(name: String)                |
| + setCourseName(name: String):            |
| + getCourseName(): String                 |
| + displayMessage()                        |
| + inputGrades()                           |
| + incrementLetterGradeCounter(grade: int) |
| + displayGradeReport()                    |
---------------------------------------------
*/