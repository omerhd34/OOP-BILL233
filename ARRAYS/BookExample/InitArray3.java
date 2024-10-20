package ARRAYS.BookExample;

// Calculating values to be placed into elements of an array.
public class InitArray3 {
    public static void main(String args[]) {
        final int ARRAY_LENGTH = 10; // declare constant
        int array[] = new int[ARRAY_LENGTH]; // create array

        // calculate value for each array element
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s\n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    } // end main
} // end class InitArray
/*
Index   Value
    0       2
    1       4
    2       6
    3       8
    4      10
    5      12
    6      14
    7      16
    8      18
    9      20

+---------------------------+
|        InitArray          |
+---------------------------+
| - ARRAY_LENGTH: final int |
| - array: int[]            |
+---------------------------+
| + main(args: String[]): void |
+---------------------------+

 */