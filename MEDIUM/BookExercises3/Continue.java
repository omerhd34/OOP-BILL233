package MEDIUM.BookExercises3;

// continue statement terminating an iteration of a for statement.

public class Continue {
    public static void main(String args[]) {
        for (int count = 1; count <= 10; count++) // loop 10 times
        {
            if (count == 5) // if count is 5,
                continue; // skip remaining code in loop

            System.out.printf("%d ", count);
        } // end for

        System.out.println("\nUsed continue to skip printing 5.");
    } // end main
} // end class ContinueTest
// 1 2 3 4 6 7 8 9 10
// Used continue to skip printing 5