package ADVANCED.Exercises3;

public class PerfectNumber {
    // Method to check if a number is perfect
    public static boolean perfect(int number) {
        int sum = 0;

        // Calculate the sum of all divisors (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == number;
    }

    // Method to print factors of a number
    public static void printFactors(int number) {
        System.out.print("Factors: 1");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000 are:");

        // Loop through numbers from 1 to 1000 and check if each is perfect
        for (int i = 1; i <= 1000; i++) {
            if (perfect(i)) {
                System.out.printf("Perfect number: %d\n", i);
                printFactors(i);
            }
        }

        // Challenge the computer with a large number
        System.out.println("Checking larger numbers for perfectness:");
        int largeNumber = 8128;
        if (perfect(largeNumber)) {
            System.out.printf("Perfect number: %d\n", largeNumber);
            printFactors(largeNumber);
        }
    }
}
/*
Perfect numbers between 1 and 1000 are:
Perfect number: 6
Factors: 1, 2, 3
Perfect number: 28
Factors: 1, 2, 4, 7, 14
Perfect number: 496
Factors: 1, 2, 4, 8, 16, 31, 62, 124, 248
Checking larger numbers for perfectness:
Perfect number: 8128
Factors: 1, 2, 4, 8, 16, 32, 64, 127, 254, 508, 1016, 2032, 4064

              PerfectNumber
+-----------------------------------+
|                                   |
+-----------------------------------+
| + perfect(number: int): boolean   |
| + printFactors(number: int): void |
| + main(args: String[]): void      |
+-----------------------------------+

*/