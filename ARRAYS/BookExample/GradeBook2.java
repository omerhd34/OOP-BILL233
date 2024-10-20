package ARRAYS.BookExample;

// Grade book using a two-dimensional array to store grades.
public class GradeBook2 {
    private String courseName; // name of course this grade book represents
    private int grades[][]; // two-dimensional array of student grades

    // two-argument constructor initializes courseName and grades array
    public GradeBook2(String name, int gradesArray[][]) {
        courseName = name; // initialize courseName
        grades = gradesArray; // store grades
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
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    }

    // perform various operations on the data
    public void processGrades() {
        outputGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("\n%s %d\n%s %d\n\n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // output bar chart displaying grade distribution
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0][0]; // assume first element is smallest

        // loop through rows of grades array
        for (int studentGrades[] : grades) {
            // loop through columns of current row
            for (int grade : studentGrades) {
                if (grade < lowGrade)
                    lowGrade = grade;
            }
        }
        return lowGrade;
    }

    // find maximum grade
    public int getMaximum() {
        int highGrade = grades[0][0]; // assume first element is largest

        // loop through rows of grades array
        for (int studentGrades[] : grades) {
            // loop through columns of current row
            for (int grade : studentGrades) {
                if (grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }

    // determine average grade for particular set of grades
    public double getAverage(int setOfGrades[]) {
        int total = 0;
        for (int grade : setOfGrades)
            total += grade;
        return (double) total / setOfGrades.length;
    }

    // output bar chart displaying overall grade distribution
    public void outputBarChart() {
        System.out.println("Overall grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int frequency[] = new int[11];

        // for each grade in GradeBook, increment the appropriate frequency
        for (int studentGrades[] : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }

        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    // output the contents of the grades array
    public void outputGrades() {
        System.out.println("The grades are:\n");
        System.out.print("            "); // align column heads

        // create a column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d ", test + 1);

        System.out.println("Average"); // student average column heading

        // create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student])
                System.out.printf("%8d", test);

            // calculate average of student's test grades
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f\n", average);
        }
    }
}
/*
Welcome to the grade book for
CS101 Introduction to Java Programming!

The grades are:

            Test 1 Test 2 Test 3 Average
Student  1      87      96      70    84,33
Student  2      68      87      90    81,67
Student  3      94     100      90    94,67
Student  4     100      81      82    87,67
Student  5      83      65      85    77,67
Student  6      78      87      65    76,67
Student  7      85      75      83    81,00
Student  8      91      94     100    95,00
Student  9      76      72      84    77,33
Student 10      87      93      73    84,33

Lowest grade in the grade book is 65
Highest grade in the grade book is 100

Overall grade distribution:
00-09:
10-19:
20-29:
30-39:
40-49:
50-59:
60-69: ***
70-79: ******
80-89: ***********
90-99: *******
  100: ***

+-------------------------------------+
|            GradeBook2               |
+-------------------------------------+
| - courseName: String                |
| - grades: int[][]                   |
+-------------------------------------+
| + GradeBook2(name: String, gradesArray: int[][])       |
| + setCourseName(name: String): void                    |
| + getCourseName(): String                              |
| + displayMessage(): void                               |
| + processGrades(): void                                |
| + getMinimum(): int                                    |
| + getMaximum(): int                                    |
| + getAverage(setOfGrades: int[]): double               |
| + outputBarChart(): void                               |
| + outputGrades(): void                                 |
+-------------------------------------+

+--------------------------------------+
|          GradeBookTest2              |
+--------------------------------------+
| + main(args: String[]): void         |
+--------------------------------------+


*/
