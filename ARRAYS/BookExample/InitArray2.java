package ARRAYS.BookExample;

public class InitArray2 {
    public static void main(String args[]) {
        // initializer list specifies the value for each element
        int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s\n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);
    } // end main
} // end class InitArray
/*
Index   Value
    0      32
    1      27
    2      64
    3      18
    4      95
    5      14
    6      90
    7      70
    8      60
    9      37
+---------------------------+
|        InitArray2         |
+---------------------------+
| - array: int[]            |
+---------------------------+
| + main(args: String[]): void |
+---------------------------+

 */