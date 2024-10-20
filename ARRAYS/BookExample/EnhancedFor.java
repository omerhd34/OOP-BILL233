package ARRAYS.BookExample;

// Using enhanced for statement to total integers in an array.
public class EnhancedFor {
    public static void main(String[] args) {
        int array[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // add each element's value to total
        for (int number : array)
            total += number;

        System.out.printf("Total of array elements: %d\n", total);
    } // end main
} // end class EnhancedForTest
/*
Total of array elements: 849

+-------------------------------+
|        EnhancedForTest        |
+-------------------------------+
| - array: int[]                |
| - total: int                  |
+-------------------------------+
| + main(args: String[]): void  |
+-------------------------------+
*/