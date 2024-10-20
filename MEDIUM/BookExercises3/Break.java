package MEDIUM.BookExercises3;

public class Break {
    public static void main(String args[]) {
        int count; // control variable also used after loop terminates

        for (count = 1; count <= 10; count++) // loop 10 times
        {
            if (count == 5) // if count is 5,
                break; // terminate loop

            System.out.printf("%d ", count);
        } // end for

        System.out.printf("\nBroke out of loop at count = %d\n", count);
    } // end main
} // end class BreakTest
/*
1 2 3 4
Broke out of loop at count = 5
*/