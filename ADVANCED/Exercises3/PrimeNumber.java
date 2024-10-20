package ADVANCED.Exercises3;

public class PrimeNumber {
    // Method to check if a number is prime using the square root method
    public static boolean isPrimeSqrt(int number) {
        // Handle edge cases
        if (number <= 1) return false;
        if (number == 2) return true;

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is prime using n/2 method
    public static boolean isPrimeHalf(int number) {
        // Handle edge cases
        if (number <= 1) return false;
        if (number == 2) return true;

        // Check for divisibility from 2 to number/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method to find and display prime numbers less than 10,000
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000 using square root method:");
        int primeCountSqrt = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrimeSqrt(i)) {
                System.out.print(i + " ");
                primeCountSqrt++;
            }
        }
        System.out.println("\nTotal primes found using square root method: " + primeCountSqrt);

        System.out.println("\nPrime numbers less than 10,000 using half method:");
        int primeCountHalf = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrimeHalf(i)) {
                System.out.print(i + " ");
                primeCountHalf++;
            }
        }
        System.out.println("\nTotal primes found using half method: " + primeCountHalf);
    }
}
/*
Prime numbers less than 10,000 using square root method:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71  ...
Total primes found using square root method: 1229

Prime numbers less than 10,000 using half method:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71  ...
Total primes found using half method: 1229

              PrimeNumber
+-------------------------------------+
|                                     |
+-------------------------------------+
| + isPrimeSqrt(number: int): boolean |
| + isPrimeHalf(number: int): boolean |
| + main(args: String[]): void        |
+-------------------------------------+
 */