package ARRAYS.BookExample;

// Creates GradeBook object using an array of grades.
public class GradeBookTest {
    // main method begins program execution
    public static void main(String[] args) {
        // array of student grades
        int gradesArray[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook1 myGradeBook = new GradeBook1("CS101 Introduction to Java Programming", gradesArray);

        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    } // end main
} // end class GradeBookTest
/*
Welcome to the grade book for
CS101 Introduction to Java Programming!

The grades are:

Student  1:  87
Student  2:  68
Student  3:  94
Student  4: 100
Student  5:  83
Student  6:  78
Student  7:  85
Student  8:  91
Student  9:  76
Student 10:  87

Class average is 84,90
Lowest grade is 68
Highest grade is 100

Grade distribution:
00-09:
10-19:
20-29:
30-39:
40-49:
50-59:
60-69: *
70-79: **
80-89: ****
90-99: **
  100: *

+--------------------------------+
|           GradeBook            |
+--------------------------------+
| - courseName: String           |
| - grades: int[]                |
+--------------------------------+
| + GradeBook(name: String, gradesArray: int[]): void   |
| + setCourseName(name: String): void                   |
| + getCourseName(): String                             |
| + displayMessage(): void                              |
| + processGrades(): void                               |
| - getMinimum(): int                                   |
| - getMaximum(): int                                   |
| - getAverage(): double                                |
| - outputBarChart(): void                              |
| - outputGrades(): void                                |
+--------------------------------+

+--------------------------------+
|         GradeBookTest          |
+--------------------------------+
| + main(args: String[]): void   |
+--------------------------------+


 */