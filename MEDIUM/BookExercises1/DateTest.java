package MEDIUM.BookExercises1;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(10, 19, 2024);  // Date nesnesi oluşturma

        System.out.print("Tarih: ");   // Tarihi gösterme
        date.displayDate();

        // Tarihi değiştirme
        date.setMonth(11);
        date.setDay(25);
        date.setYear(2025);

        System.out.print("Değiştirilen tarih: ");   // Değiştirilen tarihi gösterme
        date.displayDate();
    }

    public static class GradeBook6 {
        private String courseName; // name of course this GradeBook represents

        // constructor initializes courseName
        public GradeBook6(String name) {
            courseName = name; // initializes courseName
        }

        // method to set the course name
        public void setCourseName(String name) {
            courseName = name; // store the course name
        }

        // method to retrieve the course name
        public String getCourseName() {
            return courseName;
        }

        // display a welcome message to the GradeBook user
        public void displayMessage() {
            // getCourseName gets the name of the course
            System.out.printf("Welcome to the grade book for %s!\n", getCourseName());
        }

        // determine class average based on 10 grades entered by user
        public void determineClassAverage() {
            // create Scanner to obtain input from command window
            Scanner input = new Scanner(System.in);

            int total; // sum of grades entered by user
            int gradeCounter; // number of grade to be entered next
            int grade; // grade value entered by user
            int average; // average of grades

            // initialization phase
            total = 0; // initialize total
            gradeCounter = 1; // initialize loop counter

            // processing phase
            while (gradeCounter <= 5) { // loop 5 times
                System.out.print("Enter grade: "); // prompt
                grade = input.nextInt(); // input next grade
                total = total + grade; // add grade to total
                gradeCounter = gradeCounter + 1; // increment counter by 1
            }

            // termination phase
            average = total / 5; // integer division yields integer result

            // display total and average of grades
            System.out.printf("\nTotal of all 5 grades is %d.\n", total);
            System.out.printf("Class average is %d.\n", average);
        }
    } // end class GradeBook

    public static class GradeBookTest6 {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner input = new Scanner(System.in);

            // Prompt for and read the course name
            System.out.print("Please enter the course name: ");
            String courseName = input.nextLine();

            // Create a GradeBook1 object and pass the course name
            GradeBook6 myGradeBook = new GradeBook6(courseName);

            // Display a welcome message
            myGradeBook.displayMessage();

            // Determine the average of the grades entered by the user
            myGradeBook.determineClassAverage();
        }
    }
}
/*
Tarih: 10/19/2024
Değiştirilen tarih: 11/25/2025

UML :
                    DateTest
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |creates
                        ↓
                                           Date
          -------------------------------------------------------------------------
           - month : int
           - day : int
           - year : int
          --------------------------------------------------------------------------
           + «constructor» Date(month: int, day: int, year: int)
           + setMonth(month: int)
           + setDay(day: int)
           + setYear(year: int)
           + getMonth(): int
           + getDay(): int
           + getYear(): int
           + displayDate()
          --------------------------------------------------------------------------
 */
