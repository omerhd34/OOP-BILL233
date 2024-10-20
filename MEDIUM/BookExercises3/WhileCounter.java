package MEDIUM.BookExercises3;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; // declare and initialize control variable

        while (counter <= 10) // loop-continuation condition
        {
            System.out.printf("%d ", counter);
            ++counter; // increment control variable by 1
        } // end while

        System.out.println(); // output a newline
    } // end main
} // end class WhileCounter

// 1 2 3 4 5 6 7 8 9 10